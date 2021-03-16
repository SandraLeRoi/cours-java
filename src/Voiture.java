public class Voiture extends Vehicule {

    public static int nbRoue = 4;
    public int nbPortes;

    public Voiture (String couleur, String immatriculation, Conducteur conducteur) {
        super(couleur,immatriculation,conducteur);
    }

    public Voiture (String couleur, String immatriculation) {
        super(couleur, immatriculation, null);
    }

    public Voiture (String couleur, String immatriculation, int kilometrage) {
        super(couleur, immatriculation, null);
        this.kilometrage = kilometrage;
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

//    public void setConducteur(Conducteur conducteur) {
//        this.conducteur = conducteur;
//    }

    public int getKilometrage() {
        return kilometrage;
    }

    public String toString() {
        return "Une voiture " + couleur + " dont l'immatriculation est " + immatriculation;
    }
}
