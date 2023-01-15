public class Toyota extends Vehicle {
    private String rabotaVHolod = "Да";


    @Override
    public void zapravka() {
        System.out.print("Залить в бак бензин. ");
    }

    public String getRabotaVHolod() {
        return rabotaVHolod;
    }


}
