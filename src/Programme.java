public class Programme {
    public static void main(String[] args) {
        Conducteur moi = new Conducteur("Le Roi", "Sandra");
        Voiture maVoiture = new Voiture("Blue", "H3ll");
        Moto maMoto = new Moto("Red","B4RB13", moi);
    }
}
