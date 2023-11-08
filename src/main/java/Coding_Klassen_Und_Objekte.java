public class Coding_Klassen_Und_Objekte {

    public static void main(String[] args) {
        Cars notMyCar = new Cars("Koenigsegg", "CC8S", "Silver", "2002");

        Cars myCar = new Cars("Fiat", "Multipla", "Grey", "1998");


        System.out.println(" This sadly isnt my car:  ");
        System.out.println(notMyCar.Brand);
        System.out.println(notMyCar.Model);
        System.out.println(notMyCar.Colour);
        System.out.println(notMyCar.BuildYear);
        System.out.println(" This is my car:  ");
        System.out.println(myCar.Brand);
        System.out.println(myCar.Model);
        System.out.println(myCar.Colour);
        System.out.println(myCar.BuildYear);
    }
}
