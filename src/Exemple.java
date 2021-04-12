import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemple {
    public static void main(String[] args) {
        ArrayList<Integer> maList = new ArrayList<Integer>();
        maList.add(1);
        maList.add(145);
        maList.add(789);
        System.out.println(maList);
        System.out.println(maList.size());
        System.out.println(maList.get(2));
        maList.sort(Exemple::compare);
        maList.forEach(Exemple::doSomethingWithNumber);
        maList.forEach(number -> {
            System.out.println(number);
        });
        System.out.println(maList.indexOf(1));
        System.out.println(maList.stream().filter(Exemple::keepPos).collect(Collectors.toList()));
        maList.stream().map(number -> number * 2);

        Integer[] monTableau = {1,2,3,4,5,6};
        List<Integer> newList = Arrays.asList((monTableau));
        Integer[] monNouveauTableau =  newList.toArray(new  Integer[newList.size()]);
    }

    static int compare(int a, int b) {
        return a-b;
    }

    static boolean keepPos(int a){
        return a>=0;
    }

    static void doSomethingWithNumber(int a) {
        System.out.println(a);
    }
}
