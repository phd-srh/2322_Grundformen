public class Main {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(7.2);
        Quadrat quadrat = new Quadrat(5);

        ausgabeUmfangUndFläche("Kreis", kreis);
        ausgabeUmfangUndFläche("Quadrat", quadrat);
    }

    private static void ausgabeUmfangUndFläche(String formArt, Grundform form) {
        System.out.println("Umfang vom " + formArt + ": " + form.berechneUmfang());
        System.out.println("Fläche vom " + formArt + ": " + form.berechneFläche());
    }
}
