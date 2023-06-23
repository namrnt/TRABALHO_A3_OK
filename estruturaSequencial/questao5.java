//Faça um Programa que converta metros para centímetros.
import java.util.Scanner;
import java.util.Locale;

public class questao5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float metros;

        System.out.println("Escreva o valor em metros: ");
        metros = sc.nextFloat();

        System.out.printf("Valor em centimetros = %.2f cm.", metros * 100);
        sc.close();

    }
}
