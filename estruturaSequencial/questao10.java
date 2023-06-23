//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;
import java.util.Locale;

public class questao10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double temperatura, temperaturaFahrenheit;

        System.out.printf("Digite a temperatura em graus Celsius: ");
        temperatura = sc.nextFloat();

        temperaturaFahrenheit = (1.8 * temperatura) + 32;
        System.out.printf("A temperatura em graus Fahrenheit é equivalente a aproximadamente %.0f ºF.", temperaturaFahrenheit);
        sc.close();
    }
}
