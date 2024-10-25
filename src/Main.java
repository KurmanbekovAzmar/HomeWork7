public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan1",12322,1000,"Kyrgyz lenguage");
        Country country2 = new Country("Kyrgyzstan2",12322,11000,"Kyrgyz lenguage");
        Country country3 = new Country("Kyrgyzstan3",12322,1300,"Kyrgyz lenguage");
        Country[] countries = new Country[]{country1,country2,country3};
        System.out.println(Country.getArea(countries));

    }
}