public class Main {

    public static void main(String[] args) {
        System.out.print("Bem-vindo(a) à Calculadora JAVA!");

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


        if(args[0].equals("somar")) {
            // Sum
            sum(x, y);
        } else if (args[0].equals("subtrair")) {

            // Subtraction
            sub(x, y);
        } else if ( args[0].equals("multiplicar") ) {

            //multiply
            multiply(x, y);
        } else if (args[0].equals("dividir")) {

            //div
            div(x, y);

        } else {
            System.out.println("Nenhuma Instrução Definida");
        }


    }

    static void sum(int x, int y) {

        System.out.println(x + y);

    }

    static void sub(int x, int y) {

        System.out.println(x - y);

    }

    static void multiply(int x, int y) {

        System.out.println(x * y);

    }

    static void div(int x, int y) {

        System.out.println(x / y);

    }


}