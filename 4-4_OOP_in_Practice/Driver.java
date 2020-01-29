public class Driver {
    public static void main(String[] args) {
        Corgi myCorgi = new Corgi("cuddling", "Corgi", "Baby Yoda", 20, 3);
        myCorgi.setTopTrick("roll over");
        System.out.println(myCorgi.toString());
    }
}