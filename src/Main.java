public class Main {

    public static void main(String[] args) {

        Smartphone iphoneX = new Smartphone();
        iphoneX.addKontakt(new KontaktList("Mehdi", "98734"));
        iphoneX.addKontakt(new KontaktList("Reza", "3456"));
        iphoneX.addKontakt(new KontaktList("gholi", "2408"));

        iphoneX.ausgabe();
        System.out.println("----------");

        iphoneX.findKontakt("gholi" );
        iphoneX.addKontakt(new KontaktList("Mehdi", "4567"));
        System.out.println("----------");
        iphoneX.ausgabe();
    }
}
