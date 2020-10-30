public class Main {

    public static void main(String[] args) {

        Balok balok = new Balok();
        balok.setPanjang(5);
        balok.setLebar(4);
        balok.setTinggi(3);

        System.out.println("Volume Balok :" +balok.getVolume());

        LuasPermukaanBalok luasPermukaanBalok = new LuasPermukaanBalok();
        luasPermukaanBalok.setPanjang(5);
        luasPermukaanBalok.setLebar(4);
        luasPermukaanBalok.setTinggi(3);
        System.out.println("LuasPermukaanBalok :" +luasPermukaanBalok.getLuas());
    }
}
