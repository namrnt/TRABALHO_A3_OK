package estruturaClasses;

import java.util.Scanner;

public class Retangulo {

    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValorComprimento(float novoComprimento) {
        this.comprimento = novoComprimento;
    }

    public void mudarValorLargura(float novaLargura) {
        this.largura = novaLargura;
    }

    public void retornarValorLados() {
        System.out.println(comprimento + "cm, " + largura + "cm");
    }

    public float calcularArea() {
        float area = largura * comprimento;
        System.out.println();
        System.out.println(area + " metros quadrados de área.");
        return area;
    }

    public float calcularPerimetro() {
        float perimetro = 2 * largura + 2 * comprimento;
        System.out.println();
        System.out.println(perimetro + " metros de perimetro.");
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do local: ");
        float comprimentoLocal = sc.nextFloat();

        System.out.print("Digite a largura do local: ");
        float larguraLocal = sc.nextFloat();

        Retangulo local = new Retangulo(comprimentoLocal, larguraLocal);

        System.out.printf("\nSerão necessários %.2f metros quadrados de piso e  %.2f metros de rodapés para  o local.\n\n", local.calcularArea(), local.calcularPerimetro()); 

        sc.close();
    }
}