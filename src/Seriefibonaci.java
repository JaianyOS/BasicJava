import java.util.Scanner;

public class Seriefibonaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de numeros: ");
        int n = scanner.nextInt();

        int p = 0, s = 1;

        for (int i = 0; i < n; i++){
            if (i == 0) {
                System.out.println(p);
            } else if (i == 1) {
                System.out.println(s);
            } else {
                int prox = p + s;
                System.out.println(prox);
                p = s;
                s = p;
            }
        }

    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
