import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a base: ");
        int base = scanner.nextInt();

        System.out.println("Escreva o expoente");
        int expoente = scanner.nextInt();
        double resultado = 0; //usado pra potencia

        for (int i = 0; i <= expoente; i++){
            resultado = Math.pow(base, expoente); //eleva a base ao expoente
        }
        System.out.println("o resultado é "+resultado);

    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
