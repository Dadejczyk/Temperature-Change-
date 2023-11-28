import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static double celtofahr(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static double fahrtocels(double fahr) {
        return (fahr - 32.0) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("1. Change from celsius to fahrenheit");
                System.out.println("2. Change from fahrenhei to celsius");
                int select = scanner.nextInt();
                double fahren;
                if (select == 1) {
                    System.out.println("specify degrees celsius");
                    fahren = scanner.nextDouble();
                    System.out.println("Degrees fahrenheit: " + celtofahr(fahren));
                } else if (select == 2) {
                    System.out.println("give degrees fahrenheit");
                    fahren = scanner.nextDouble();
                    System.out.println("Degrees of celsius: " + fahrtocels(fahren));
                } else {
                    System.out.println("wybierz coś innego");
                }
            }
        }
    }
}
