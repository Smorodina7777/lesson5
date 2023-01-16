public abstract class Vehicle {
    private double rashNaKm;
    private String color;
    private double kolTopliva;
    private String title;


    public void zapravka() {
        System.out.println("Залить в бак топливо");
    }

    public double fullLenth(double rashNaKm, double kolTopliva) {
        double fLenth = kolTopliva / rashNaKm;
        System.out.println(fLenth + "км");
        return fLenth;
    }

    public void zapusk() {
        System.out.println("Повернуть ключ. Нажать на тормоз. Включить передачу. Отпустить тормоз");
    }

    public void obAvto() {
        if (color == null) {
            System.out.println(title + "  цвет еще не выбран на полной заправке может проехать:");
        } else {
            System.out.println(title + " имеет цвет " + color + " на полной заправке может проехать:");
        }
    }

    public void setColor(String color) {
        if (color == "белый" || color == "черный" || color == "серый" || color == "голубой" || color == "синий") {
            this.color = color;
        } else {
            System.out.println("Для " + title + " выбери белый, черный, серый, синий или голубой цвет");
            System.out.println();
        }
    }

    public String getColor() {
        return color;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
