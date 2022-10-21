package aulas.exercicios;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("José", "Carlos", 5000);
        System.out.println(empregado1.salarioAnual());
        System.out.println(empregado1.aumentarSalario(1000));
        System.out.println(empregado1.nomeCompleto());
    }
}
