package jarmu;

public class Autopalya {

    public static void main(String[] args) {
        Motor motor= new Motor("ABC-123",60, 130, "Aerox");
        Benzines benzines= new Benzines("DEF-456",150, 4, "benzin",50);
        Dízeles dizeles= new Dízeles("GHI-789",100, 5, "dizel", 100);


        System.out.println(benzines);
        System.out.println(benzines.gyorshajtottE(130));

        System.out.println(dizeles);
        System.out.println(dizeles.gyorshajtottE(130));

        System.out.println(motor);
        System.out.println(motor.gyorshajtottE(90));

    }
}
