package estruturaDeDecisao;
/*
 
Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir 
os demais valores, sendo encerrado;

Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;

Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;

Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

 */

import java.util.Locale;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite os valores de a, b e c respectivamente: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a == 0)
            System.out.println("A equacao nao e do segundo grau.");
        else {
            delta = (b * b) - (4 * a * c);

            if (delta < 0)
                System.out.println("O valor do delta calculado e negativo, portanto a equacao nao possui raizes reais.\n");

            else if (delta == 0) {
                x1 = -b / 2 * a;
                System.out.printf("Pelo valor de delta ser igual a zero, a equacao possui apenas um valor real que é %.2f.", x1);

            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("O delta e positivo, por isso a equacao possui duas raizes reais: %.2f e %.2f", x1,x2);
            }
        }

        sc.close();
    }
}
