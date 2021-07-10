package dev.jarand.archiveapi.oauth;

import dev.jarand.archiveapi.oauth.client.TokenResource;
import dev.jarand.archiveapi.oauth.client.Tokens;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class OAuthService {

    private final RestTemplate authApiRestTemplate;
    private final String clientId;
    private final String clientSecret;

    public OAuthService(RestTemplate authApiRestTemplate, @Value("${oauth.client-id}") String clientId, @Value("${oauth.client-secret}") String clientSecret) {
        this.authApiRestTemplate = authApiRestTemplate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public Tokens exchangeTokens(String code) {
        final var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        final var parameters = new LinkedMultiValueMap<String, String>();
        parameters.add("grant_type", "authorization_code");
        parameters.add("client_id", clientId);
        parameters.add("client_secret", clientSecret);
        parameters.add("code", code);
        final var entity = new HttpEntity<MultiValueMap<String, String>>(parameters, headers);

        final var response = authApiRestTemplate.exchange("/oauth/token", HttpMethod.POST, entity, TokenResource.class);

        final var status = response.getStatusCodeValue();
        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("Got unexpected status code " + status + " when trying to get tokens");
        }
        if (response.getBody() == null) {
            throw new RuntimeException("Got empty body when trying to get tokens");
        }
        final var tokenResource = response.getBody();
        return new Tokens(tokenResource.getAccessToken(), tokenResource.getExpiresIn(), tokenResource.getRefreshToken());
    }
}
