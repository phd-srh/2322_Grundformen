public class Kreis extends Grundform {

    private double radius;

    public Kreis(double radius) {
        super("Kreis");
        this.radius = radius;
    }

    @Override
    public double berechneFläche() {
        return radius * radius * Math.PI;
    }

    @Override
    public double berechneUmfang() {
        return 2 * radius * Math.PI;
    }
}
