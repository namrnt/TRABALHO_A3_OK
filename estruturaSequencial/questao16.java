/*

Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

*/
import java.util.Scanner;
import java.util.Locale;

public class questao16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double tamanho, quantTinta, preco;

        System.out.printf("Digite o tamanho da área a ser pintada em metros quadrados: ");
        tamanho = sc.nextInt();

        quantTinta = tamanho / 3;
        int latas = (int) Math.round(((double)quantTinta/18)+0.5d);
        
        preco = latas * 80;

        System.out.printf("A quantidade de latas de tintas a serem compradas é %d.\nO preço total da compra é R$ %.2f.", latas, preco);
        System.out.println();
        sc.close();
    }
}
