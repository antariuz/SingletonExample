package singleton;

public class Scooter {
    private static Scooter instance;
    private String brandName;

    public Scooter(String brandName) {
        this.brandName = brandName;
    }

    public static Scooter getInstance(String brandName) {
        if (instance == null) instance = new Scooter(brandName);
        return instance;
    }

    public String getBrandName() {
        return brandName;
    }

}
