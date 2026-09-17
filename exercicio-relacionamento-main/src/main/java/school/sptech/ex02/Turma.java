package school.sptech.ex02;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public void matricular(Aluno aluno) {
        if (aluno.getNome() == null ||
                aluno.getNome().isBlank() ||
                aluno.getIdade() == null ||
                aluno.getIdade() < 0 ||
                aluno.getNotaProva() == null ||
                aluno.getNotaProva() > 10 ||
                aluno.getNotaProva() < 0 ||
                aluno.getNotaAtividade() == null ||
                aluno.getNotaAtividade() > 10 ||
                aluno.getNotaAtividade() < 0
        ) {
            return;
        }

        alunos.add(aluno);
    }

    public List<Aluno> buscarPorParteDoNome(String nome) {
        List<Aluno> alunosBuscados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if (aluno.getNome().toLowerCase().contains(nome.toLowerCase())) {
                alunosBuscados.add(aluno);
            }
        }

        return alunosBuscados;
    }

    public List<Aluno> buscarAprovados(Double notaMinima) {
        List<Aluno> alunosBuscados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if (Math.round(aluno.calcularNotaFinal()) >= notaMinima) {
                alunosBuscados.add(aluno);
            }
        }

        return alunosBuscados;
    }

    public Double calcularMediaTurma() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        Double mediaTurma = 0.0;

        for (Aluno aluno : alunos) {
            mediaTurma += aluno.calcularNotaFinal();
        }

        return mediaTurma / alunos.size();
    }

    public List<Aluno> buscarAcimaDaMedia() {
        List<Aluno> alunosAcima = new ArrayList<>();

        Double mediaTurma = calcularMediaTurma();

        for (Aluno aluno : alunos) {
            if (aluno.calcularNotaFinal() > mediaTurma) {
                alunosAcima.add(aluno);
            }
        }

        return alunosAcima;
    }

    public Aluno buscarMenorNota() {
        if (alunos.size() == 0) {
            return null;
        }

        Integer indice = 0;

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calcularNotaFinal() < alunos.get(indice).calcularNotaFinal()) {
                indice = i;
            }
        }

        return alunos.get(indice);
    }

    public Double calcularIdadeMedia() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        Double IdadeMedia = 0.0;

        for (Aluno aluno : alunos) {
            IdadeMedia += aluno.getIdade();
        }

        return IdadeMedia / alunos.size();
    }

    public Double calcularAmplitudeNotas() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        Double menorNota = buscarMenorNota().calcularNotaFinal();

        Integer indice = 0;

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calcularNotaFinal() > alunos.get(indice).calcularNotaFinal()) {
                indice = i;
            }
        }

        Double maiorNota = alunos.get(indice).calcularNotaFinal();

        return maiorNota - menorNota;
    }

    public List<Aluno> encontrarAlunosComMesmaNota() {
        List<Aluno> alunosEncontrados = new ArrayList<>();

        for (int i = 0; i < alunos.size(); i++) {
            for (int j = i + 1; j < alunos.size(); j++) {
                if (alunos.get(i).calcularNotaFinal().equals(alunos.get(j).calcularNotaFinal())) {
                    if (!alunosEncontrados.contains(alunos.get(i))) {
                        alunosEncontrados.add(alunos.get(i));
                    }

                    if (!alunosEncontrados.contains(alunos.get(j))) {
                        alunosEncontrados.add(alunos.get(j));
                    }
                }
            }
        }

        return alunosEncontrados;
    }
}
