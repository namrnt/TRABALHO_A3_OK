//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite dois números inteiros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.printf("Soma = %d\n", num1 + num2);
        sc.close();
    }
}
