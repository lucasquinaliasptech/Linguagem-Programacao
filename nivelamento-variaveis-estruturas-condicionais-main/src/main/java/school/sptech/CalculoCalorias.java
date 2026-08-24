package school.sptech;

public class CalculoCalorias {

    public static void main(String[] args) {

        Integer tempoAquecimento = 5;
        Integer tempoAerobicos = 20;
        Integer tempoMusculacao = 20;

        Integer tempoTotal = tempoAquecimento + tempoAerobicos + tempoMusculacao;

        Integer caloriasAquecimento = 12;
        Integer caloriasAerobicos = 20;
        Integer caloriasMusculacao = 25;

        Integer caloriasTotais = (tempoAquecimento * caloriasAquecimento) + (tempoAerobicos * caloriasAerobicos) + (tempoMusculacao * caloriasMusculacao);

        /*
        ESTRUTURAS DE REPETIÇÃO
        for (int i = 0; i < tempoAquecimento; i++) {
            caloriasTotais += caloriasAquecimento;
        }

        for (int i = 0; i < tempoAerobicos; i++) {
            caloriasTotais += caloriasAerobicos;
        }

        for (int i = 0; i < tempoMusculacao; i++) {
            caloriasTotais += caloriasMusculacao;
        }
         */

        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", tempoTotal, caloriasTotais);
    }
}
