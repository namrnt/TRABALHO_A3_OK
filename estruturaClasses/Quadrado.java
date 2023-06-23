package estruturaClasses;

public class Quadrado {
    private float lado;

    public Quadrado(float lado) {
        setLado(lado);
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getLado() {
        return lado;
    }
    public double calculaArea() {
        return lado * lado;
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        System.out.println(quadrado.calculaArea());

        quadrado.setLado(2);
        System.out.println(quadrado.calculaArea());
    }
}