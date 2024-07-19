import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++){
            soma += i;// System.out.println(""+i);
        }

        System.out.println(""+soma);
    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
        }
}