package dev.jarand.archiveapi.item.domain;

import java.util.Optional;

public class Item {

    private final int id;
    private final String date;
    private final String shop;
    private final String baker1;
    private final String established;
    private final String baker2;
    private final String place;
    private final String series;
    private final String breadName;
    private final String description;
    private final String composition;
    private final String healthClaim;
    private final String name;
    private final String support;
    private final String motive;
    private final String bagColor;
    private final String coarseness;
    private final String coarsenessPercentage;
    private final String fibrePercentage;
    private final String weight;
    private final String price;
    private final String keyhole;
    private final String comment;
    private final String pricePerKg;
    private final String imageFront;
    private final String imageBack;

    public Item(int id,
                String date,
                String shop,
                String baker1,
                String established,
                String baker2,
                String place,
                String series,
                String breadName,
                String description,
                String composition,
                String healthClaim,
                String name,
                String support,
                String motive,
                String bagColor,
                String coarseness,
                String coarsenessPercentage,
                String fibrePercentage,
                String weight,
                String price,
                String keyhole,
                String comment,
                String pricePerKg,
                String imageFront,
                String imageBack) {
        this.id = id;
        this.date = date;
        this.shop = shop;
        this.baker1 = baker1;
        this.established = established;
        this.baker2 = baker2;
        this.place = place;
        this.series = series;
        this.breadName = breadName;
        this.description = description;
        this.composition = composition;
        this.healthClaim = healthClaim;
        this.name = name;
        this.support = support;
        this.motive = motive;
        this.bagColor = bagColor;
        this.coarseness = coarseness;
        this.coarsenessPercentage = coarsenessPercentage;
        this.fibrePercentage = fibrePercentage;
        this.weight = weight;
        this.price = price;
        this.keyhole = keyhole;
        this.comment = comment;
        this.pricePerKg = pricePerKg;
        this.imageFront = imageFront;
        this.imageBack = imageBack;
    }

    public int getId() {
        return id;
    }

    public Optional<String> getDate() {
        return Optional.ofNullable(date);
    }

    public Optional<String> getShop() {
        return Optional.ofNullable(shop);
    }

    public Optional<String> getBaker1() {
        return Optional.ofNullable(baker1);
    }

    public Optional<String> getEstablished() {
        return Optional.ofNullable(established);
    }

    public Optional<String> getBaker2() {
        return Optional.ofNullable(baker2);
    }

    public Optional<String> getPlace() {
        return Optional.ofNullable(place);
    }

    public Optional<String> getSeries() {
        return Optional.ofNullable(series);
    }

    public Optional<String> getBreadName() {
        return Optional.ofNullable(breadName);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<String> getComposition() {
        return Optional.ofNullable(composition);
    }

    public Optional<String> getHealthClaim() {
        return Optional.ofNullable(healthClaim);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getSupport() {
        return Optional.ofNullable(support);
    }

    public Optional<String> getMotive() {
        return Optional.ofNullable(motive);
    }

    public Optional<String> getBagColor() {
        return Optional.ofNullable(bagColor);
    }

    public Optional<String> getCoarseness() {
        return Optional.ofNullable(coarseness);
    }

    public Optional<String> getCoarsenessPercentage() {
        return Optional.ofNullable(coarsenessPercentage);
    }

    public Optional<String> getFibrePercentage() {
        return Optional.ofNullable(fibrePercentage);
    }

    public Optional<String> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getPrice() {
        return Optional.ofNullable(price);
    }

    public Optional<String> getKeyhole() {
        return Optional.ofNullable(keyhole);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getPricePerKg() {
        return Optional.ofNullable(pricePerKg);
    }

    public Optional<String> getImageFront() {
        return Optional.ofNullable(imageFront);
    }

    public Optional<String> getImageBack() {
        return Optional.ofNullable(imageBack);
    }
}
