//2) Crie uma classe Empregado que possui:
//	* Atributos: nome, sobrenome, salario
//	* Construtores:
//		- Cria empregados com base nos parâmetros nome, sobrenome e salario;
//	* Métodos:
//		- calcularSalarioAnual() => deve retornar double
//		- aumentarSalario(double aumento) => aumenta o valor do salário
//		- nomeCompleto() => deve retornar a concatenação do nome e sobrenome

package aulas.exercicios;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double salarioAnual(){
       return this.salario * 12;
    }

    double aumentarSalario(double aumento){
        return this.salario += aumento;
    }

    String nomeCompleto() {
        return this.nome + " " +  this.sobrenome;
    }




}

