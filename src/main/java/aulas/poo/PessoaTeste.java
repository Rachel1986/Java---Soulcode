package aulas.poo;
// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rachel";
        pessoa1.sobrenome = "Guzman Valencio";
        pessoa1.idade = 36;
        pessoa1.peso = 70.0;
        pessoa1.altura = 1.74;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

//abaixo uma maneira mais direta de fazer:
        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);
        pessoa4.dizOla();
        pessoa4.mostrarIMC();
        double imcPessoa4 = pessoa4.calculaIMC();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

        // Exemplo pessoas

        Pessoa pedro = new Pessoa("Pedro", "José",29, 1.8, 80);

        Pessoa joao = new Pessoa("João", "Carlos", 30, 1.75, 90);


        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
        pedro.comer("Batata");
    }
}
