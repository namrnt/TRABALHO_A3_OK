package estruturaDeDecisao;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
import java.util.Scanner;
import java.util.Locale;

public class questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float numero;
        System.out.printf("Digite um numero: ");
        numero = sc.nextFloat();

        if(numero > 0) System.out.println("Valor Positivo!");
        else System.out.println("Valor Negativo!");
        sc.close();
    }
}
