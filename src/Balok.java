class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;

    public Balok(){
        panjang=0;
        lebar=0;
        tinggi=0;
        volume=0;
    }

    public int getVolume() {
        volume=panjang*lebar*tinggi;
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

}
