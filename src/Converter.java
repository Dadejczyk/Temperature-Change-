public class Converter {

    public static double celtofahr(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static double fahrtocels(double fahr) {
        return (fahr - 32.0) * 5.0 / 9.0;
    }
}
