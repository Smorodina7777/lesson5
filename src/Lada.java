public class Lada extends Vehicle {
    private String privod = "механика";


    @Override
    public void zapravka() {
        System.out.print("Залить в бак бензин. ");
    }

    @Override
    public void zapusk() {
        System.out.println("Повернуть ключ. Нажать на тормоз. Нажать сцепление. Включить передачу. Отпустить тормоз. Отпустить сцепление.");
    }

    public String getPrivod() {
        return privod;
    }


}
