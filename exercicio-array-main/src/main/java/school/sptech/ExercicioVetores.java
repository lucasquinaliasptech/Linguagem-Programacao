package school.sptech;

public class ExercicioVetores {

    Integer somar(Integer[] vetor) {
        Integer soma = 0;
        for (Integer numero : vetor) {
            soma += numero;
        }

        return soma;
    }

    Double calcularMedia(Double[] notas) {
        Double media = 0.0;

        for (Double nota : notas) {
            media += nota;
        }

        return media / notas.length;
    }

    Integer buscarMaiorNumero(Integer[] vetor) {
        Integer indice = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[indice]) {
                indice = i;
            }
        }

        return vetor[indice];
    }

    Integer calcularDecimal(Integer[] binario) {
        Integer soma = 0;
        Integer indice = 0;

        for (int i = binario.length - 1; i >= 0; i--) {
            if (binario[i] != 0) {
                soma += ((int) Math.pow(2, indice));
            }
            indice++;
        }

        return soma;
    }

    Character[] inverter(Character[] vetor) {
        Character[] inverter = new Character[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            inverter[i] = vetor[vetor.length - 1 - i];
        }

        return inverter;
    }

    Integer[] mesclar(Integer[] vetor1, Integer[] vetor2) {
        Integer[] mesclar = new Integer[vetor1.length + vetor2.length];

        Integer ponteiro1 = 0;
        Integer ponteiro2 = 0;

        for (int i = 0; i < mesclar.length; i++) {
            if (ponteiro2 >= vetor2.length || (ponteiro1 < vetor1.length && vetor1[ponteiro1] <= vetor2[ponteiro2])) {
                mesclar[i] = vetor1[ponteiro1];
                ponteiro1++;
            } else {
                mesclar[i] = vetor2[ponteiro2];
                ponteiro2++;
            }
        }

        return mesclar;
    }

    Integer[] somarDois(Integer[] vetor, Integer alvo) {
        Integer[] indices = new Integer[2];

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length; j++) {
                if (vetor[i] + vetor[j] == alvo) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }

        return null;
    }
}