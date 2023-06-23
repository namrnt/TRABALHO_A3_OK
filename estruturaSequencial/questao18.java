/*

Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet
(em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

*/
import java.util.Scanner;
import java.util.Locale;


public class questao18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double tamArquivo, velocidade, tempo, minutos;

        System.out.printf("Digite o tamanho do arquivo para download (em MB): ");
        tamArquivo = sc.nextDouble();
        System.out.printf("Digite agora a velocidade da sua internet: ");
        velocidade = sc.nextFloat();

        velocidade = velocidade / 8;
        tempo = tamArquivo / velocidade;
        minutos = (int) Math.round(((double)tempo/60)+0.5d);

        System.out.printf("O tempo de download do arquivo em minutos é de aproximadamente %.0f.", minutos);
        sc.close();
        
    }
}
