package aulas.exercicios;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(3);
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularCircunferencia());

        circulo1.mudarRaio(2);
        System.out.println(circulo1.getRaio());

    }
}
