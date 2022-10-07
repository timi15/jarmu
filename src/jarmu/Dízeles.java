package jarmu;

public class Dízeles extends Auto{
    private int uzemanyag;

    public Dízeles(String rendszam, int aktSebesseg, int ajtokSzama, String marka, int uzemanyag) {
        super(rendszam, aktSebesseg, ajtokSzama, marka);
        this.uzemanyag = uzemanyag;
    }

    public int getUzemanyag() {
        return uzemanyag;
    }

    public void setUzemanyag(int uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return this.aktSebesseg>sebessegkorlat;
    }

    @Override
    public String toString() {
        return "Dízeles:"+super.toString()+" "+this.marka;
    }
}
