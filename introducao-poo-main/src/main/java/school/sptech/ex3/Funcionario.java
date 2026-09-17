package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer porcentagem) {
        salario += salario * (porcentagem / 100.0);
    }

    Double calcularValorHora() {
        return salario / 220;
    }

    Double calcularHoraExtra(Integer horasExtras, Integer percentualNoturno) {
        return (((calcularValorHora() * (100.0 + percentualNoturno)) / 100) * horasExtras);
    }

    Double calcularBonificacaoAnual() {
        Double bonificacao = 0.0;

        if (salario == null || salario <= 0) {
            return 0.0;
        } else if (salario <= 2500) {
            bonificacao = salario * 0.15;
        } else if (salario <= 6000) {
            bonificacao = salario * 0.10;
        } else {
            bonificacao = salario * 0.05;
        }

        return bonificacao;
    }
}