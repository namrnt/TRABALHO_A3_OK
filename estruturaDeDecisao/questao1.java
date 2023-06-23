package estruturaDeDecisao;
// Faça um Programa que peça dois números e imprima o maior deles.
import java.util.Scanner;
import java.util.Locale;

public class questao1 {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.println("Digite dois números abaixo: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        if(num1 > num2) System.out.println(num1);
        else System.out.println(num2);
        sc.close();
   } 
}
