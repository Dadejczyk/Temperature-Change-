import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            while(true) {
                System.out.println("1. Change from celsius to fahrenheit");
                System.out.println("2. Change from fahrenhei to celsius");
                int select = scanner.nextInt();
                double fahren;
                if (select == 1) {
                    System.out.println("specify degrees celsius");
                    fahren = scanner.nextDouble();
                    System.out.println("Degrees fahrenheit: " + Converter.celtofahr(fahren));
                } else if (select == 2) {
                    System.out.println("give degrees fahrenheit");
                    fahren = scanner.nextDouble();
                    System.out.println("Degrees of celsius: " + Converter.fahrtocels(fahren));
                } else {
                    System.out.println("wybierz coś innego");
                }
            }
    }
}
