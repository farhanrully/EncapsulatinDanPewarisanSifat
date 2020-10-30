public class LuasPermukaanBalok extends Balok {
    int luas;

    Balok balok = new Balok();
    public int getLuas() {
        luas=(2*(getPanjang()*getLebar()))+(2*(getPanjang()*getTinggi()))+(2*(getLebar()*getTinggi()));
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
}
