public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        System.out.println("Check whether both instances are same or not: "+(configurationManager1 == configurationManager2));

        configurationManager1.printConfiguration();
    }
}