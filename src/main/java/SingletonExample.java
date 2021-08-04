import singleton.Scooter;

public class SingletonExample {
    public static void main(String[] args) {
        Scooter scooter = Scooter.getInstance();
        Scooter scooter2 = Scooter.getInstance();
        System.out.println(scooter);
        System.out.println(scooter2);
    }
}
