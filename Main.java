public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(7.2);

        System.out.println("Umfang vom Kreis: " + kreis.berechneUmfang());
        System.out.println("Fläche vom Kreis: " + kreis.berechneFläche());
    }
}
