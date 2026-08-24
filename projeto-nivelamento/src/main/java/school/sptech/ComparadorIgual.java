package school.sptech;

public class ComparadorIgual {

    public static void main(String[] args) {
        Integer numeroA = 128;
        Integer numeroB = 128;

        if (numeroA.equals(numeroB)) {
            System.out.println("Números iguais!");
        } else {
            System.out.println("Números diferentes!");
        }


        // String textoA = new String("teste");
        // String textoB = new String("teste");

        String textoA = null;
        String textoB = null;

        // Para comparar tipos wrapper usamos .equals e para tipos primitivos usamos ==
        // Para comparar nulo, sempre usamos ==
        if (textoA != null && textoA.equals(textoB)) {
            System.out.println("Iguais!");
        } else {
            System.out.println("Diferentes!");
        }

        String nome = "Lucas";
        String nome2 = "lucas";

        if (nome.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais!");
        } else {
            System.out.println("Nomes diferentes!");
        }

        int a = 0;
        int b = 0;

        boolean valor = a == b ? true : false;
        System.out.println(valor);
    }
}
