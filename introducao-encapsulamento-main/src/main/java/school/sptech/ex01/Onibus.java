package school.sptech.ex01;

public class Onibus {

    private Integer qtdPassageiros;
    private Double valorPassagem;

    public void cobrarPassagem(BilheteUnico bilhete) {
        if (bilhete == null) {
            return;
        }

        if (bilhete.getBloqueado()) {
            System.out.println("bilhete único bloqueado");
            return;
        }

        Double passagem = valorPassagem;

        if (bilhete.getEstudante()) {
            passagem = valorPassagem / 2;
        }

        if (bilhete.getSaldo() < passagem) {
            System.out.println("Não há saldo suficiente para realizar a operação");
            return;
        }

        bilhete.setSaldo(bilhete.getSaldo() - passagem);
        qtdPassageiros++;
    }

    public void cobrarPassagem(Double dinheiro) {
        if (dinheiro == null) {
            return;
        }

        if (dinheiro < valorPassagem) {
            System.out.println("Dinheiro insuficiente para realizar a operação");
            return;
        }

        qtdPassageiros++;
    }

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public Double getValorPassagem() {
        return valorPassagem;
    }
}
