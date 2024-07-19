import java.util.Scanner;

public class palindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        String numeroStr = Integer.toString(numero); //converte de int para string

        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();
        //inverte a str de tras pra frente

        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);
        //de str de volta pra int

       //System.out.println(""+numeroInvertido);

        if (numero == numeroInvertido) {
            System.out.println("true"); //compara o valor inciado com o invertido
        } else {
            System.out.println("false");
        }

    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
