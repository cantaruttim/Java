package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;;

public class Program {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Matheus");
        list.add("Gabriella");
        list.add("Noah");
        list.add("Maite");
        list.add(2, "Marco");

        // list.removeIf(x -> x.charAt(0) == 'M');
        

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("Tamanho lista? : " + list.size());
        System.out.println("Index do Matheus : " + list.indexOf("Matheus"));


        System.out.println("-------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        System.out.println("Nova lista filtrada :   " + result);


        System.out.println("-------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);


        sc.close();
    }
}
