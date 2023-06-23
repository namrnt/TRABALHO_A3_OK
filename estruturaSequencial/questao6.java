//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;
import java.util.Locale;

public class questao6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, area;

        System.out.printf("Digite o raio do circulo: ");
        raio = sc.nextFloat();

        area = Math.pow(raio, 2) * Math.PI;

        System.out.printf("Valor da area do circulo = %.5f.", area);
        sc.close();
    }
}
