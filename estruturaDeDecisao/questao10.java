package estruturaDeDecisao;
/*

Faça um Programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

 */

import java.util.Locale;
import java.util.Scanner;

public class questao10 {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String turno;

        System.out.printf("Digite o turno que voce esta estudando!\n\nM-matutino\nV-Vespertino\nN- Noturno\n\n");
        turno = sc.nextLine();

        switch(turno){
            case "M":
            System.out.println("Bom Dia!");
            break;
            case "V":
            System.out.println("Boa Tarde!");
            break;
            case "N":
            System.out.println("Boa Noite!");
            break;
            default:
            System.out.println("Valor Inválido!");
            break;
        }
        sc.close();
    }
}
