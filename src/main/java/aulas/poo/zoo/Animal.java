package aulas.poo.zoo;

// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que "herda" deve implementar estes métodos

public interface Animal {
    void dormir(); // definição do método apenas
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")) {
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");

        }
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm có có " + comida);
    }

    public void botarOvo() {
        System.out.println("botou ovo!");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");


        // Interface não consigo criar um objeto
        // Animal novoAnimal = new Animal();// não consigo criar uma instância pois é Interface.
    }
}