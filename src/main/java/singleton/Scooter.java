package singleton;

public class Scooter {
    private static Scooter instance;
    private final String brandName;

    public static Scooter getInstance(String brandName) {
        if (instance == null) instance = new Scooter(brandName);
        return instance;
    }

    public Scooter(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

}
