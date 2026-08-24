package school.sptech;

public class CalculoRenda {

    public static void main(String[] args) {

        Integer filhos0_3 = 2;
        Integer filhos4_16 = 1;
        Integer filhos17_18 = 1;

        Integer totalFilhos = filhos0_3 + filhos4_16 + filhos17_18;

        Double valor0_3 = 25.12;
        Double valor4_16 = 15.88;
        Double valor17_18 = 12.44;

        Double bolsaTotal = (filhos0_3 * valor0_3) + (filhos4_16 * valor4_16) + (filhos17_18 * valor17_18);

        /*
        ESTRUTURAS DE REPETIÇÃO
        for (int i = 0; i < filhos0_3; i++) {
            bolsaTotal += valor0_3;
        }

        for (int i = 0; i < filhos4_16; i++) {
            bolsaTotal += valor4_16;
        }

        for (int i = 0; i < filhos17_18; i++) {
            bolsaTotal += valor17_18;
        }
         */

        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, bolsaTotal);
    }
}
