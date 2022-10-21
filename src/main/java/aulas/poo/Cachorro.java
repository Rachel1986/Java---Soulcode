package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;


    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        // "super" representa a classe Pet
        super(nome, idade, peso); // chamando o construtor da superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // anotação = vamos sobrescrever a ação de fazer fazer som
    public void fazerSom() {
        System.out.println("Au auauauauauaau");
    }

    @Override
    public void brincar() {
        this.fazerSom(); // o cachorro late na hora de brincar
        super.brincar(); // está chamando o "brincar()" da superclasse Pet
    }

    @Override
    public void comer(String comida) { // customizando a forma de comer
        // verifica se é a comida favorita
        if(comida.equals(this.comidaFavorita)) {
            super.comer(comida);
            this.peso += 0.2; // this.peso = this.peso + 0.2
            //this.setPeso(this.getPeso() + 0.2); - Exemplo se caso "peso" fosse "private".
        } else {
            System.out.println("Não quero " + comida + "!");
        }
    }

    public void correrAtrasMoto() {
        this.fazerSom();
        System.out.println("Correndo atrás da moto.");
    }


    public static void main(String[] args) {
        // Testar a herança
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();
        System.out.println("============");

        Cachorro batata = new Cachorro("Rex", 5, 25, "Osso", "Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
        batata.correrAtrasMoto();
    }
}
