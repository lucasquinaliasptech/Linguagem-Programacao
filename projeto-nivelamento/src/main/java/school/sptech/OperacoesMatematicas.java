package school.sptech;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        // +, -, *, /, %, **

        // Underline não afeta o número, somente ajuda na visualização
        Double teste = 100_000_000.0;

        Double numeroA = 10.0;
        Double numeroB = 5.0;

        System.out.println("Adição: " + (numeroA + numeroB));
        System.out.println("Subtração: " + (numeroA - numeroB));
        System.out.println("Multiplicação: " + (numeroA * numeroB));
        System.out.println("Divisão: " + (numeroA / numeroB));
        System.out.println("Resto da divisão: " + (numeroA % numeroB));
        // Não temos ** para potenciação no Java
        System.out.println("Potência: " + (Math.pow(numeroA, numeroB)));

        // Tomar cuidado com divisão de inteiros
        // Inteiro por inteiro sempre vai dar inteiro
        Integer n1 = 5;
        Double n2 = 10.0;
        System.out.println("Resultado: " + (n1 / n2));
    }
}
