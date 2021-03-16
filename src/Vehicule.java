public abstract class Vehicule {
    public static int nbRoues;
    public String couleur;
    public String immatriculation;
    public int kilometrage;
    public Conducteur conducteur;

    public Vehicule(String couleur, String immatriculation, Conducteur conducteur) {
        this.couleur = couleur;
        this.immatriculation = immatriculation;
        this.kilometrage = 0;
        this.conducteur = conducteur;
    }

    public void rouler(int longTrajet) {
        kilometrage =+ longTrajet;
    }

    public boolean rouler() {
        kilometrage =+ 500;
        return true;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public Vehicule setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
        return this;
    }
}
