package school.sptech;

import java.util.ArrayList;

public class Calculadora {

    Double somar(Double numeroA, Double numeroB) {
        Double resultado = numeroA + numeroB;
        System.out.println("Soma: " + resultado);
        return resultado;
    }

    void verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return;
        }
        System.out.println("Menor de idade");
    }

    // Minha versão
    Integer[] somar(Integer[] lista) {
        Integer[] retorno = new Integer[lista.length];

        for (int i = 0; i < lista.length - 1; i++) {
            Integer soma = lista[i] +  lista[i + 1];
            System.out.printf("A soma de %d e %d é %d\n",  lista[i], lista[i + 1], soma);

            retorno[i] = soma;
        }

        return retorno;
    }

    // Versão do professor
    Double somar(Double[] lista) {
        Double resultado = 0.0;
        for (Double numero : lista) {
            resultado += numero;
        }
        return resultado;
    }

    // Média do professor
    Double calcularMedia(Double[] lista) {
        if (lista.length == 0) {
            return 0.0;
        }

        Double soma = somar(lista);

        return soma / lista.length;
    }
}
