package estruturaClasses;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int anos) {
        this.idade += anos;
        if (this.idade < 21) crescer(0.05 * anos);
    }

    public void engordar(double kilos) {
        this.peso += kilos;
    }

    public void emagrecer(double kilosPerdidos) {
        this.peso -= kilosPerdidos;
    }

    public void crescer(double altura) {
        this.altura += altura;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
    }

    public static void main(String[] args) {
        Pessoa brunna = new Pessoa("Brunna", 20, 60, 1.59);
        brunna.apresentar();

        brunna.envelhecer(1);
        
        brunna.engordar(10);

        brunna.apresentar();

        brunna.emagrecer(15);

        brunna.apresentar();
    }
}