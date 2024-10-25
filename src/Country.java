import java.util.Scanner;

public class Country {
    private String countryName;
    private int population;
    private double area;
    private String language;

    public Country(String countryName, int population, double area, String language) {
        this.countryName = countryName;
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public static double getArea(Country[] countries) {
        double b = countries[0].area;
        String country = countries[0].countryName;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].area > b) {
                b=countries[i].area;
                country=countries[i].countryName;


            }
        }
        System.out.println(country);
        return b;

}}
