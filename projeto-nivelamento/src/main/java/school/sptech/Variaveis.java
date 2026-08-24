package school.sptech;

public class Variaveis {

    public static void main(String[] args) {
        // let idade = 10 (javascript)

        // Tipos primitivos
        // Não aceitam nulo
        // Não tem funções especiais, pois não são classes
        int idade = 21;
        long numeroGrande = 1000;

        float peso = 75.00F;
        double altura = 1.85;

        boolean temMoto = false;

        char letra = 'L';

        // Tipos Wrapper
        // Aceitam nulo
        // Possuem funções especiais, pois são classes
        String frase = "Bom dia!";
        String fraseMinuscula = frase.toLowerCase();

        Integer wrapperIdade = 21;
        Long wrapperNumeroGrande = 1000L;

        Float wrapperPeso = 75.00F;
        Double wrapperAltura = 1.85;

        Boolean wrapperTemMoto = false;

        Character wrapperLetra = 'L';

        // Toda variável precisa ser inicializada
        String mensagem = "";
        System.out.println("Mensagem: " + mensagem);
    }
}
