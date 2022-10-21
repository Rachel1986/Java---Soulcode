package aulas.poo.escola;

public class Aluno extends Pessoa {
    private double media;

    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // estou chamando um construtor de Pessoa
        this.media = media;
    }

    @Override
    public void seApresentar() { // na sobrescrita mudamos o comportamento (APENAS)
        super.seApresentar();
        System.out.println("Eu sou um aluno com média = " + this.media);
    }
}
