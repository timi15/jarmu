package jarmu;

public abstract class Auto extends Jarmu{
    private int ajtokSzama;


    protected String uzemanyagTipus;

    public Auto(String rendszam, int aktSebesseg, int ajtokSzama, String uzemanyagTipus) {
        super(rendszam, aktSebesseg);
        this.ajtokSzama = ajtokSzama;
        this.uzemanyagTipus = uzemanyagTipus;
    }

    public int getAjtokSzama() {
        return ajtokSzama;
    }

    public void setAjtokSzama(int ajtokSzama) {
        this.ajtokSzama = ajtokSzama;
    }

    public String getUzemanyagTipus() {
        return uzemanyagTipus;
    }

    public void setUzemanyagTipus(String uzemanyagTipus) {
        this.uzemanyagTipus = uzemanyagTipus;
    }
}
