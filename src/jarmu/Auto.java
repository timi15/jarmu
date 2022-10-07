package jarmu;

public abstract class Auto extends Jarmu{
    private int ajtokSzama;
    protected String marka;

    public Auto(String rendszam, int aktSebesseg, int ajtokSzama, String marka) {
        super(rendszam, aktSebesseg);
        this.ajtokSzama = ajtokSzama;
        this.marka = marka;
    }

    public int getAjtokSzama() {
        return ajtokSzama;
    }

    public void setAjtokSzama(int ajtokSzama) {
        this.ajtokSzama = ajtokSzama;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
