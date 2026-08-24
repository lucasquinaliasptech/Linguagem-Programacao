package school.sptech;

public class Main {

    // function dizerBomDia() {
    // (...)
    //}

    public static void main(String[] args) {
        // Integer numero = 0;
        Auxiliar auxiliar = new Auxiliar();
        auxiliar.dizerBomDia();
        auxiliar.dizerBomDia("Lucas");
        auxiliar.dizerBomDia(5);
        auxiliar.dizerBomDia("Lucas", "Sao Paulo");

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.somar(10.0,15.5);
        Double resultado2 = calculadora.somar(resultado, 10.0);
        System.out.println("Resultado final: " + resultado2);

        calculadora.verificarMaioridade(20);

        Double[] numeros = {10.0, 20.0, 30.0};
        Double resultadoSomaVetor = calculadora.somar(numeros);
        System.out.println("Resultado soma vetor: " + resultadoSomaVetor);

        Double resultadoMedia = calculadora.calcularMedia(numeros);
        System.out.println("Media: " + resultadoMedia);
    }
}
