package jarmu;

public class Motor extends  Jarmu{
    private int maxSebesseg;
    private String marka;

    public Motor(String rendszam, int aktSebesseg, int maxSebesseg, String marka) {
        super(rendszam, aktSebesseg);
        this.maxSebesseg = maxSebesseg;
        this.marka = marka;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return this.aktSebesseg > sebessegkorlat;
    }

    @Override
    public String toString() {
        return "Motor: "+super.toString()+ this.marka;
    }
}