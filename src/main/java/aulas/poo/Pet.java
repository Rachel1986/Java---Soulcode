package aulas.poo;

// super classe
public class Pet {
    private String nome;
    private int idade;
    protected double peso;
    //nas subclasses o atributo/método private não é acessível.
    //protected => permite acesso direto nas subclasses.

    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("...");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir() {
        System.out.println("zzzzzzzzzzzz");
    }

    public void brincar() {
        System.out.println("Estou brincando...");
    }

    public double getPeso(){ // apenas leitura do pso
        return this.peso;
    }

    public void setPeso(double novoPeso) { // possível alterar o peso - SET sempre terá um parâmetro
        this.peso = novoPeso;
    }
}
