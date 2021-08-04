package singleton;

public class Scooter {
    private static Scooter instance = null;

    public Scooter() {
    }

    public static Scooter getInstance() {
        if (instance == null) instance = new Scooter();
        return instance;
    }

}
