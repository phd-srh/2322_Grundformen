public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(7.2);
        Quadrat quadrat = new Quadrat(5);

        ausgabeUmfangUndFläche(kreis);
        ausgabeUmfangUndFläche(quadrat);
    }

    private static void ausgabeUmfangUndFläche(Grundform form) {
        String formArt = form.getClass().getName();
        System.out.println("Umfang vom " + formArt + ": " + form.berechneUmfang());
        System.out.println("Fläche vom " + formArt + ": " + form.berechneFläche());
    }
}
