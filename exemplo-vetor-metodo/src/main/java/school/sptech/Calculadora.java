package school.sptech;

public class Calculadora {

    Double somar(Double numeroA, Double numeroB) {
        Double resultado = numeroA + numeroB;
        return resultado;
        // Depois do return, nada vai funcionar
        // Ele também para o método
        // System.out.println("");
    }

    void verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return;
        }
        System.out.println("Menor de idade");
    }

    // Ex: 1
    // somar -> array de numeros
    // [10, 20, 30] -> 60
    // [10,10] -> 20
    Double somar(Double[] numeros) {
        Double total = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            Double numeroDaVez = numeros[i];
            total = total + numeroDaVez;
        }
        return total;
    }

    // Ex: 2
    // media dos numeros do vetor
    // [10, 20, 10] -> 15
    // [6, 8] -> 7
    // [] -> 0
    Double calcularMedia(Double[] numeros) {
        if(numeros.length == 0) {
            return 0.0;
        }
        Double soma = somar(numeros);
        return soma / numeros.length;
    }
}
