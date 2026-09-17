package school.sptech.ex04;

public class EntradaCinema {

    private String nome;
    private Integer hora;
    private Integer sala;
    private Double valor;
    private Boolean[] assentosDisponiveis;

    public void aplicarDesconto(Integer idade, Boolean estudante) {
        if (idade == null || estudante == null || idade < 0) {
            return;
        }

        if (idade < 3) valor = 0.0;
        if (idade < 12) valor *= 0.5;

        if (idade >= 12 && idade <= 15 && estudante) valor *= 0.6;
        if (idade >= 16 && idade <= 20 && estudante) valor *= 0.7;
        if (idade > 20 && estudante) valor *= 0.8;
    }

    public void aplicarDescontoHorario() {
        if (hora < 16 && hora >= 0) valor *= 0.9;
    }

    public Boolean comprarIngresso(Integer indiceAssento, Double pagamento, Integer idade, Boolean estudante) {
        if (indiceAssento == null || pagamento == null || idade == null || estudante == null || pagamento < 0 || idade < 0) {
            return false;
        }

        Double valorOriginal = valor;

        aplicarDescontoHorario();
        aplicarDesconto(idade, estudante);

        if (assentosDisponiveis[indiceAssento] == false || pagamento < valor) {
            valor = valorOriginal;
            return false;
        }

        assentosDisponiveis[indiceAssento] = false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getSala() {
        return sala;
    }

    public Double getValor() {
        return valor;
    }

    public Boolean[] getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
}
