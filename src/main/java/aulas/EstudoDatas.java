package aulas;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        // dia - mes - ano
        // LocalDate armazena qualquer data (dia, mês, ano)
        LocalDate hoje = LocalDate.now(); // pega a data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); // verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal)); //verifica se a data é antes da especificada

        int ano= hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear(); // subtrai o dia de natal pelo dia de hj

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + " dias para o Natal");
     }
}
