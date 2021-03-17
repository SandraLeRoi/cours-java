import java.nio.file.StandardCopyOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int monNombre = 12; // stocké sur 32 bits
//        // nombre est stocké 2 puissance 31 byte en positif et en négatif
//        char monCaractere = 'b';
//        boolean monBool = true;
//        float monChiffre = 2.3f;
//        double unAutreNombreAVirgule = 2.3;
//        byte monOctet = 1; // stocké sur un octet
//        short petitInteger = 2; // stocké sur 16 bits
//        long grandInteger = 468; // stocké sur 64 bits
//
//        // /!\ String est une classe pas un type primitif /!\
//        String maChaine = "bidule";
//
//        int[] monTableau = {1, 5, 9, 50};
//        int[][] monAutreTableau = {
//        {1,2},
//        {5,8},
//        {9, 50}};
//
//        int[] monTableau2 = new int[10]; // créer un tableau vide de 10 éléments
//
//        for (int i = 0; i < 10; i++) {
//            //cette instruction sera répétée 10x
//
//        }
//
//        int[] unTableau = {0,5,9,2};
//        for (int number: unTableau) {
//            //je peux faire ce que je veux avec un number
//        }
//
//        System.out.println("Hello world");
//
//        Scanner scann = new Scanner(System.in);
//        System.out.println("Tapez un nombre");
//        int input = scann.nextInt();
//        System.out.println("votre nombre : " + input);
        int[] tableau = {50,89,6985,123,68,4,456};
        Calculatrice calculatrice = new Calculatrice();
        System.out.println(calculatrice.average(tableau));
        System.out.println(calculatrice.max(tableau));
        System.out.println(Arrays.toString(tableau));
        System.out.println(Arrays.toString(calculatrice.sort(tableau)));

    }


}

