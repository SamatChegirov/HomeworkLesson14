public class Color extends Dye {
    String name;
    String small;

    public void colorPaint() {
        System.out.println("Paint dye. ");
    }

    public void colorWash() {
        System.out.println("Wash of the paint. ");
    }

    public Color(String dye, String name, String small) {
        super(dye);
        this.name = name;
        this.small = small;
    }

    @Override
    public String toString() {
        return "Dye " + "name: " + name + " small: " + small + "color: " + dye;
    }
}
