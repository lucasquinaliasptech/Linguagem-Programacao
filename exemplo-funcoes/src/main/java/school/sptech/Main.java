package school.sptech;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Double resultado = calculadora.somar(23.0, 73.0);
        System.out.println(resultado);

        calculadora.verificarMaioridade(20);

        // Minha versão
        Integer[] lista1 = new Integer[] {20, 30, 50};
        calculadora.somar(lista1);

        // Versão do professor
        Double[] lista2 = new Double[] {20.0, 30.0, 50.0};
        Double resultadoSomaVetor = calculadora.somar(lista2);
        System.out.println("Resultado soma vetor: " + resultadoSomaVetor);

        Double resultadoMedia = calculadora.calcularMedia(lista2);
        System.out.println("Resultado média vetor: " + resultadoMedia);
    }
}
