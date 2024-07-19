import java.util.Scanner;

public class ContagemDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cont = 0;

        while (n != 0) {
            n /=10;
            cont++;
        }
        System.out.println(""+cont);

    }
        public static Scanner scanner(String message) {
            System.out.println(message);
            return new Scanner(System.in);
        }
}
