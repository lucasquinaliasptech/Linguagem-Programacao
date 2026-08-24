package school.sptech;

public class CalculoTroco {

    public static void main(String[] args) {

        Double valorProduto = 29.99;
        Integer quantidadeVendida = 3;
        Double valorPago = 100.0;

        Double troco = ((valorProduto * quantidadeVendida) - valorPago) * -1;

        System.out.printf("Seu troco será de R$ %.2f", troco);
    }
}
