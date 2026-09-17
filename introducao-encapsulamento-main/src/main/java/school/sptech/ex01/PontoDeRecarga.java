package school.sptech.ex01;

public class PontoDeRecarga {

    private Integer qtdConsultasRealizadas;
    private Integer qtdRecargasRealizadas;

    public Double consultarSaldo(BilheteUnico bilhete) {
        if (bilhete == null) {
            return 0.0;
        }

        if (bilhete.getBloqueado()) {
            System.out.println("bilhete único bloqueado");
            return 0.0;
        }

        qtdConsultasRealizadas++;
        return bilhete.getSaldo();
    }

    public void recarregar(BilheteUnico bilhete, Double valor) {
        if (bilhete == null || valor == null) {
            return;
        }

        if (valor < 5) {
            System.out.println("Valor mínimo de recarga não atingido");
            return;
        }

        if (bilhete.getBloqueado()) {
            System.out.println("bilhete único bloqueado");
            return;
        }

        bilhete.setSaldo(bilhete.getSaldo() + valor);
        qtdRecargasRealizadas++;
    }

    public void bloquear(BilheteUnico bilhete) {
        if (bilhete == null) {
            return;
        }

        bilhete.setBloqueado(true);
    }

    public Integer getQtdConsultasRealizadas() {
        return qtdConsultasRealizadas;
    }

    public Integer getQtdRecargasRealizadas() {
        return qtdRecargasRealizadas;
    }
}
