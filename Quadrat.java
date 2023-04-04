public class Quadrat extends Grundform {
    private double seitenlänge;

    public Quadrat(double seitenlänge) {
        this.seitenlänge = seitenlänge;
    }

    @Override
    public double berechneFläche() {
        return seitenlänge * seitenlänge;
    }

    @Override
    public double berechneUmfang() {
        return 4 * seitenlänge;
    }
}
