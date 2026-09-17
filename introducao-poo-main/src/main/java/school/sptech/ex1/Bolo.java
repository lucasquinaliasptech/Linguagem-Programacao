package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer qtdDesejada) {
        if (qtdDesejada == null || qtdDesejada <= 0) {
            System.out.println("Quantidade desejada inválida");
            return;
        }

        if (qtdDesejada > quantidadeEmEstoque) {
            System.out.println("Quantidade de estoque insuficiente");
            return;
        }

        quantidadeVendida += qtdDesejada;
        quantidadeEmEstoque -= qtdDesejada;
    }

    void aumentarEstoque(Integer qtdAdicionada) {
        if (qtdAdicionada == null || qtdAdicionada <= 0) {
            System.out.println("Quantidade adicionada inválida");
            return;
        }

        quantidadeEmEstoque += qtdAdicionada;
    }

    Integer quantidadeDisponivel() {
        return quantidadeEmEstoque;
    }

    Double totalVendido() {
        return quantidadeVendida * valor;
    }
}