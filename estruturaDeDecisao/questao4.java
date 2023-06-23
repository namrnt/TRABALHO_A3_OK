package estruturaDeDecisao;
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
import java.util.Scanner;
import java.util.Locale;

public class questao4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.printf("Digite uma letra: ");
        letra = sc.nextLine();
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra e uma vogal!");
                break;
            default:
                System.out.println("A letra e uma consoante!");
                break;
        }
        sc.close();
    }
}
