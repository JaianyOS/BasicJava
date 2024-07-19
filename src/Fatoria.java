import java.util.Scanner;

public class Fatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fatorial;


        fatorial = 1;

        while (n > 0) {
            fatorial *= n;
            n--;
        }
        System.out.println(""+n);


    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
