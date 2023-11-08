

public class Coding_Klassen_Und_Objekte {

    public static void main(String[] args) {
        Cars sadlyNotMyCar = new Cars("Koenigsegg", "CC8S", "Silver", "2002");
        sadlyNotMyCar.BuildYear = "2002";
        sadlyNotMyCar.Brand = "Koenigsegg";

        isEngineOn();

        }
        private static boolean isEngineOn() {
            System.out.println(" Engine turned on ");
            return true;


        }


}