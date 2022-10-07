package jarmu;

public class Benzines extends Auto{
    protected int üzemanyag;

    public Benzines(String rendszam, int aktSebesseg, int ajtokSzama, String marka, int üzemanyag) {
        super(rendszam, aktSebesseg, ajtokSzama, marka);
        this.üzemanyag = üzemanyag;
    }

    public int getÜzemanyag() {
        return üzemanyag;
    }

    public void setÜzemanyag(int üzemanyag) {
        this.üzemanyag = üzemanyag;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return this.aktSebesseg>sebessegkorlat;
    }

    @Override
    public String toString() {
        return "Benzines: " + super.toString()+" "+ this.marka;
    }
}
