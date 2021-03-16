public class Moto extends Vehicule {
    public static int nbRoues = 2;

    public Moto (String couleur, String immatriculation, Conducteur conducteur) {
        super(couleur, immatriculation, conducteur);
    }

    public void rouler(int longTrajet) {
        kilometrage =+ longTrajet;
        System.out.println("Je me casse ! à : " + kilometrage);
    }
}
