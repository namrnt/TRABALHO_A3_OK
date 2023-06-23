//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
//usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;
import java.util.Locale;

public class questao12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float altura;

        System.out.printf("Digite a altura: ");
        altura = sc.nextFloat();

        System.out.printf("Peso ideal = %.2f Kg.", (72.7 * altura) - 58);
        sc.close();
    }
}
