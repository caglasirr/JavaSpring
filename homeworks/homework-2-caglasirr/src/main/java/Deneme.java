public class Deneme {
    private static Deneme deneme = new Deneme();

    private String firstName;
    private String lastName;

    private Deneme() {};

    public static Deneme getCustomer(){
        return deneme;
    }

}
