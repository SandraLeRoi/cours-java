public class Programme {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("red");
        Voiture maDeuxiemeVoiture = new Voiture("yellow");
        Voiture maTroisiemeVoiture = new Voiture("black", "F4ll1N",69);
        maVoiture.rouler(105);
        maDeuxiemeVoiture.rouler(1000);
        System.out.println(maVoiture.immatriculation + maVoiture.couleur + maVoiture.kilometrage);
        System.out.println(Voiture.nbRoue);
        System.out.printf(String.valueOf(maVoiture.nbRoue));
        System.out.println(Voiture.getNbRoue());

        Conducteur moi = new Conducteur("Le Roi", "Sandra");
        Voiture maQuatrieme = new Voiture("blue","B4RB13",42, moi);
        System.out.println(maQuatrieme.getConducteur().getNom());

    }
}
