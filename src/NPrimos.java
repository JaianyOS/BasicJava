import java.util.Scanner;

public class NPrimos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result = 0;

        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0) {
                result++;
            }
        }
        if (result == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
