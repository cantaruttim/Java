public class Main {
    public static void main(String[] args) {
        System.out.print("Bem-vindo(a) à Calculadora JAVA!");

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


        // Sum
        sum(x, y);

        // Subtraction
        sub(x, y);



    }

    static void sum(int x, int y) {

        System.out.println(x + y);

    }

    static void sub(int x, int y) {

        System.out.println(x - y);

    }


}