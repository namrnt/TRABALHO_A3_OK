//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
import java.util.Scanner;
import java.util.Locale;

public class questao9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float temperatura, temperaturaCelsius;

        System.out.printf("Digite a temperatura em graus Fahrenheit: ");
        temperatura = sc.nextFloat();

        temperaturaCelsius = 5 * ((temperatura - 32) / 9);

        System.out.printf("A temperatura em graus Celsius é equivalente a aproximadamente %.0f ºC.", temperaturaCelsius);
        sc.close();
    }
}
