import singleton.Scooter;

public class SingletonExample {
    public static void main(String[] args) {
        Scooter scooter = Scooter.getInstance("TERMINATOR T-800");
        Scooter scooter2 = Scooter.getInstance("TERMINATOR T-1000");
        System.out.println(scooter.getBrandName() + "\n" +
                scooter2.getBrandName());
    }
}
