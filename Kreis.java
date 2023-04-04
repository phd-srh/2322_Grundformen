public class Kreis extends Grundform {

    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
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
