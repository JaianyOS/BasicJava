import java.util.Scanner;

public class BinarioPDecimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o binario: ");
        String binario = scanner.nextLine();


        int decimal = 0;
        int comp = binario.length(); //le de tras pra frente

        for (int i = 0; i < comp; i++){
            char digito = binario.charAt(comp -1 -i );
            int valor = Character.getNumericValue(digito);
            //converte para inteiro o caractere na posição i

            decimal += valor * Math.pow(2, i); //soma todos os decimais
        }
        System.out.println(""+decimal);
    }
    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
