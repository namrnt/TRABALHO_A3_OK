//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;
import java.util.Locale;

public class questao7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        float lado;

        System.out.printf("Digite o tamanho do lado do quadrado: ");
        lado = sc.nextFloat();

        System.out.printf("O dobro da área do quadrado é igual a %.2f.", Math.pow(lado, 2) * 2 );
        sc.close();
        
    }
}
