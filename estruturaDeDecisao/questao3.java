package estruturaDeDecisao;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
// F - Feminino, M - Masculino, Sexo Inválido.
import java.util.Scanner;
import java.util.Locale;

public class questao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String sexo;

        System.out.println("Escreva a letra referente ao sexo: ");
        sexo = sc.nextLine();

        switch(sexo){

            case "F":
            System.out.println("Feminino!");
            break;

            case "M": 
            System.out.println("Masculino!");
            break;

            default:
            System.out.println("Sexo Invalido!");
            break;
            
        }
        sc.close();
    }
}
