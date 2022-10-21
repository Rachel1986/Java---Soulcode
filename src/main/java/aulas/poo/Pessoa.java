package aulas.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pessoa {
    // Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();
    
    Pessoa() { // construtor da classe
        //this => representa o objeto
        this.nome = "Rachel";
        this.sobrenome = "Guzman Valencio";
        this.idade = 36;
        this.peso = 70.0;
        this.altura = 1.74;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Ações de uma Pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS) {}
    void dizOla() { // método que não retorna nada
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

void mostrarIMC() {
    double imc = this.peso / (this.altura * this.altura);
    System.out.println("O meu IMC é " + imc);
    }

    double calculaIMC() {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)) {
            this.addPessoaNova(pessoa);
            pessoa.conhecePessoa(this); //this é o objeto que chama cumprimento


    }

     }

    private void addPessoaNova(Pessoa pessoa) {
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }



    boolean conhecePessoa(Pessoa pessoa) {
        //se for true, a pessoa (this) conhece a outra pessoa
        // se for false, não conhece
        return this.conhecidos.contains(pessoa);
    }

}


