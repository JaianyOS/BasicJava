import java.util.Scanner;

public class MultiplosDumNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o numero: ");
        int n = scanner.nextInt();

        System.out.println("Ele dev multiplicar até: ");
        int m = scanner.nextInt();
        int i = 1;

        while (n * i <= m){
            System.out.println(" "+n*i);

            if (n*(i+1) <= m){
            }
            i++;
        }


    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
