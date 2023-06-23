/*

Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é
vendida em latas de 18 litros,que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

 */
import java.util.Scanner;
import java.util.Locale;

public class questao17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float tamanho, quantTinta, preco;

        System.out.printf("Digite o tamanho da area a ser pintada em metros quadrados: ");
        tamanho = sc.nextFloat();

        quantTinta = (float) (1.1 * (tamanho / 6));
        int latas = (int) Math.round(((double)quantTinta/18)+0.5d);
        preco = latas * 80;
        System.out.printf("Comprando apenas latas de tinta = R$ %.2f.\n", preco);

        int galoes = (int) Math.round(((double)quantTinta/3.6)+0.5d);
        preco = galoes * 25;
        System.out.printf("Comprando apenas galoes de tinta = R$ %.2f.\n", preco);

        int lata = (int) (quantTinta / 18);
        float resto = (int) (quantTinta % 18);
        int galao = (int) Math.round(((double)resto/3.6)+0.5d);

        float gasto = (lata * 80) + (galao * 25);
        System.out.printf("Misturando latas e galoes = R$ %.2f.", gasto);
        sc.close();
    }
}
