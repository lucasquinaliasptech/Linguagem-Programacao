package school.sptech.ex4;

public class Turma {
    String turma;
    Integer capacidadeMaxima;
    Integer quantidadeAlunosMatriculados;

    void matricularAluno(Integer qtd) {
        if (qtd == null || qtd <= 0) {
            return;
        }

        if ((quantidadeAlunosMatriculados + qtd) > capacidadeMaxima) {
            return;
        }

        quantidadeAlunosMatriculados += qtd;
    }

    Double encontrarMaiorNota(Double[] notas) {
        Integer indice = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notas[indice]) {
                indice = i;
            }
        }

        return notas[indice];
    }

    Double calcularMediaTurma(Double[] notas) {
        Double soma = 0.0;

        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    Integer contarAprovados(Double[] notas) {
        Integer aprovados = 0;

        for (Double nota : notas) {
            if (nota >= 6.0) {
                aprovados++;
            }
        }

        return aprovados;
    }

    Boolean validarQuantidadeNotas(Double[] notas) {
        if (notas.length == quantidadeAlunosMatriculados) return true;

        return false;
    }

    Double encontrarNotaMaisProximaDaMedia(Double[] notas) {
        Double media = calcularMediaTurma(notas);

        Integer menor = 0;

        for (int i = 0; i < notas.length; i++) {
            Double nota = notas[i] - media;
            Double comparativo = notas[menor] - media;

            if (nota < 0) {
                nota *= -1;
            }

            if (comparativo < 0) {
                comparativo *= -1;
            }

            if (nota < comparativo) {
                menor = i;
            }
        }

        return notas[menor];
    }
}