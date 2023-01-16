public class Electro extends Vehicle {
    private String tipTopliva = "электричество";
private int kolAkkum = 2;


    @Override
    public void zapravka() {
        System.out.print("Зарядить аккумулятор. ");
    }
@Override
    public double fullLenth(double rashNaKm, double kolTopliva) {
        double fLenth = kolTopliva*kolAkkum / rashNaKm;
        System.out.println(fLenth + "км");
        return fLenth;
    }

    public String getTipTopliva() {
        return tipTopliva;
    }


}
