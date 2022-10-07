package jarmu;

public abstract class Jarmu {

    private String rendszam;
    protected int aktSebesseg;

    public Jarmu(String rendszam, int aktSebesseg) {
        this.rendszam = rendszam;
        this.aktSebesseg = aktSebesseg;
    }

    public abstract boolean gyorshajtottE(int sebessegkorlat) ;

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getAktSebesseg() {
        return aktSebesseg;
    }

    public void setAktSebesseg(int aktSebesseg) {
        this.aktSebesseg = aktSebesseg;
    }

    @Override
    public String toString() {
        return String.format(" %s - %d km/h", this.rendszam, this.aktSebesseg);
    }
}
