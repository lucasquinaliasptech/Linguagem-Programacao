package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete() {
        Double frete = 0.0;

        if (tamanho.equals("P")) {
            frete = valorProduto * 0.01;
        } else if (tamanho.equals("M")) {
            frete = valorProduto * 0.03;
        } else if (tamanho.equals("G")) {
            frete = valorProduto * 0.05;
        } else {
            System.out.println("Tamanho inválido");
            return 0.0;
        }

        if (distancia == null || distancia <= 0) {
            return 0.0;
        } else if (distancia <= 50) {
            frete += 3;
        } else if (distancia <= 200) {
            frete += 5;
        } else {
            frete += 7;
        }

        return frete;
    }

    void aplicarCupomDeDesconto(Integer desconto) {
        valorProduto -= valorProduto * (desconto / 100.0);
    }

    Double valorTotalDaEncomenda() {
        return valorProduto + calcularFrete();
    }
}