package dev.jarand.archiveapi.item.assembler;

import com.opencsv.CSVReader;
import dev.jarand.archiveapi.item.domain.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

@Component
public class ItemAssembler {

    public List<Item> assemble(MultipartFile file, Map<Integer, Item> existingItems) {
        try {
            final var reader = new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8);
            final var csvReader = new CSVReader(reader);
            csvReader.skip(1);
            final var parsedLines = csvReader.readAll();
            return parsedLines.stream().map(line -> assembleItem(line, existingItems)).toList();
        } catch (Throwable throwable) {
            throw new RuntimeException("Failed to assemble item from file", throwable);
        }
    }

    private Item assembleItem(String[] line, Map<Integer, Item> existingItems) {
        final var id = Integer.parseInt(line[0]);
        final var existingItem = existingItems.get(id);
        final var dateParts = line[1].split("/");
        final var localDate = LocalDate.of(Integer.parseInt(dateParts[2]), Month.of(Integer.parseInt(dateParts[0])), Integer.parseInt(dateParts[1])).atStartOfDay();
        final var dateInstant = localDate.toInstant(ZoneOffset.UTC);
        return new Item(
                id,
                dateInstant.toString(),
                line[2],
                line[3],
                line[4],
                line[5],
                line[6],
                line[7],
                line[8],
                line[9],
                line[10],
                line[11],
                line[12],
                line[13],
                line[14],
                line[15],
                line[16],
                line[17],
                line[18],
                line[19],
                line[20],
                line[21],
                line[22],
                line[23],
                existingItem.getImageFront().orElse(null),
                existingItem.getImageBack().orElse(null));
    }
}
