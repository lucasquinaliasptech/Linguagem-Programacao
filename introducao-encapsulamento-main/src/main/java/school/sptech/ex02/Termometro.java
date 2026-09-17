package school.sptech.ex02;

public class Termometro {

    private Double temperaturaAtual;
    private Double temperaturaMaxRegistrada;
    private Double temperaturaMinRegistrada;

    public Termometro(Double temperaturaInicial) {
        this.temperaturaAtual = temperaturaInicial;
        this.temperaturaMaxRegistrada = temperaturaInicial;
        this.temperaturaMinRegistrada = temperaturaInicial;
    }

    public void alterarTemperatura(Double novaTemperatura) {
        if (novaTemperatura == null) {
            return;
        }

        if (novaTemperatura > temperaturaMaxRegistrada) {
            temperaturaMaxRegistrada = novaTemperatura;
        }

        if (novaTemperatura < temperaturaMinRegistrada) {
            temperaturaMinRegistrada = novaTemperatura;
        }

        this.temperaturaAtual = novaTemperatura;
    }

    public Double converterParaKelvin() {
        return temperaturaAtual + 273.15;
    }

    public Double converterParaFahrenheit() {
        return (temperaturaAtual * 1.8) + 32;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }
}
