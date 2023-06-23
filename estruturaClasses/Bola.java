package estruturaClasses;

public class Bola {

    private String cor, material;
    private double circunferencia;

    public void trocaCor(String cor) {
        this.cor = cor;
    }

    public void mostraCor() {
        System.out.println("COR: "+cor);
    }

    public void material(String material) {
        this.material = material;
    }

    public void mostraMaterial() {
        System.out.println("MATERIAL: "+material);
    }

    public void circunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public void mostraCircunferencia() {
        System.out.printf("CIRCUNFERENCIA: %.2fcm", circunferencia);
    }

    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.trocaCor("Amarelo");
        bola.material("Poliuretano");
        bola.circunferencia(69.85);
        bola.mostraCor();
        bola.mostraMaterial();
        bola.mostraCircunferencia();
    }
}