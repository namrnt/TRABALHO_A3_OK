//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;
import java.util.Locale;

public class questao4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        System.out.println("Escreva as 4 notas abaixo: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        nota4 = sc.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Media = %.2f", media);
        sc.close();
    }
}
