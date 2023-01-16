public class Main {
    public static void main(String[] args) {
        Lada zhiguli = new Lada();
        Toyota raum = new Toyota();
        Electro el = new Electro();

        zhiguli.setTitle("жигули");
        zhiguli.setColor("зеленый");
        raum.setTitle("раум");
        raum.setColor("синий");
        el.setTitle("eлектрокар");
        el.setColor("белый");


        zhiguli.obAvto();
        zhiguli.fullLenth(0.05, 30);
        System.out.println("Другие характеристики:");
        System.out.print("Привод - ");
        System.out.println(zhiguli.getPrivod());
        System.out.print("Для того, чтобы поехать: ");
        zhiguli.zapravka();
        zhiguli.zapusk();

        System.out.println();
        raum.obAvto();
        raum.fullLenth(0.1, 40);
        System.out.println("Другие характеристики:");
        System.out.print("Не замерзает в -30 - ");
        System.out.println(raum.getRabotaVHolod());
        System.out.print("Для того, чтобы поехать: ");
        raum.zapravka();
        raum.zapusk();

        System.out.println();
        el.obAvto();
        el.fullLenth(5, 700);
        System.out.println("Другие характеристики:");
        System.out.print("Вид топлива - ");
        System.out.println(el.getTipTopliva());
        System.out.print("Для того, чтобы поехать: ");
        el.zapravka();
        el.zapusk();


    }
}