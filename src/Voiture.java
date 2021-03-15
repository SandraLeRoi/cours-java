public class Voiture {
    public String couleur;
    public String immatriculation;
    public int kilometrage;
    public static int nbRoue = 4;
    private Conducteur conducteur;

    public Voiture (String couleur) {
        this.kilometrage = 0;
        this.couleur = couleur ;
        this.immatriculation = "H3LL";
    }

    public Voiture (String couleur, String immatriculation, int kilometrage) {
        this.kilometrage = kilometrage;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }

    public Voiture (String couleur, String immatriculation, int kilometrage, Conducteur conducteur) {
        this.kilometrage = kilometrage;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
        this.conducteur = conducteur;
    }


    public void rouler(int longTrajet) {
        kilometrage =+ longTrajet;
        System.out.println("Je me casse ! à : " + kilometrage);
    }

    public boolean rouler() {
        kilometrage =+ 500;
        return true;
    }

    public static int getNbRoue() {
        return nbRoue;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public static void setNbRoue(int nbRoue) {
        Voiture.nbRoue = nbRoue;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public int getKilometrage() {
        return kilometrage;
    }
}
