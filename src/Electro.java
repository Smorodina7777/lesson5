public class Electro extends Vehicle {
    private String tipTopliva = "электричество";

    int zaradInKm;
    int fullAkkum;

    @Override
    public void zapravka() {
        System.out.print("Зарядить аккумулятор. ");
    }

    public double fullLenth(int zaradInKm, int fullAkkum) {
        int fLenth = fullAkkum / zaradInKm;
        System.out.println(fLenth + "км");
        return fLenth;
    }

    public String getTipTopliva() {
        return tipTopliva;
    }


}
