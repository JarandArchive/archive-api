package dev.jarand.archiveapi.item.rest.resource;

public class ItemResource {

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

    public ItemResource(int id,
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

    public String getDate() {
        return date;
    }

    public String getShop() {
        return shop;
    }

    public String getBaker1() {
        return baker1;
    }

    public String getEstablished() {
        return established;
    }

    public String getBaker2() {
        return baker2;
    }

    public String getPlace() {
        return place;
    }

    public String getSeries() {
        return series;
    }

    public String getBreadName() {
        return breadName;
    }

    public String getDescription() {
        return description;
    }

    public String getComposition() {
        return composition;
    }

    public String getHealthClaim() {
        return healthClaim;
    }

    public String getName() {
        return name;
    }

    public String getSupport() {
        return support;
    }

    public String getMotive() {
        return motive;
    }

    public String getBagColor() {
        return bagColor;
    }

    public String getCoarseness() {
        return coarseness;
    }

    public String getCoarsenessPercentage() {
        return coarsenessPercentage;
    }

    public String getFibrePercentage() {
        return fibrePercentage;
    }

    public String getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    public String getKeyhole() {
        return keyhole;
    }

    public String getComment() {
        return comment;
    }

    public String getPricePerKg() {
        return pricePerKg;
    }

    public String getImageFront() {
        return imageFront;
    }

    public String getImageBack() {
        return imageBack;
    }
}
