import models.Mammals;

public class Main {
    public static void main(String[] args) {
        Mammals human = new Mammals();
        Mammals cow = new Mammals();
        System.out.println(human);
        System.out.println(cow);

        int heartHuman = human.getNoOfHeartChambers();
        boolean bloodTypHuman= human.isWarmBlooded();

        int heartCow = cow.getNoOfHeartChambers();
        boolean bloodTypeCow= cow.isWarmBlooded();
        String foodcow= cow.getFoodCow()

        System.out.println(heartCow);
        System.out.println(bloodTypeCow);

        System.out.println(heartHuman);
        System.out.println(bloodTypHuman);
        System.out.println();
    }
}
