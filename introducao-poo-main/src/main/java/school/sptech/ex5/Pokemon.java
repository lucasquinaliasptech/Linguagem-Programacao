package school.sptech.ex5;

public class Pokemon {
    String nome;
    String tipo;
    Integer vida;
    Integer ataque;
    Integer experiencia;

    void receberAtaque(Integer dano) {
        if (dano > vida) {
            vida = 0;
        } else if (dano > 0) {
            vida -= dano;
        }
    }

    void recuperarVida(Integer vidaRecuperada) {
        if (vidaRecuperada > 0) {
            vida += vidaRecuperada;
        }

        if (vida > 100) {
            vida = 100;
        }
    }

    void ganharExperiencia(Integer experienciaRecebida) {
        if (experienciaRecebida > 0) {
            experiencia += experienciaRecebida;
        }
    }

    Integer calcularNivel() {
        return experiencia / 100;
    }

    Integer calcularPoderDeCombate() {
        return ataque + (calcularNivel() * 10) + vida;
    }

    void batalhar(Integer[] ataques, Integer[] curas) {
        for (int i = 0; i < ataques.length; i++) {
            receberAtaque(ataques[i]);

            if (vida == 0) {
                return;
            }

            recuperarVida(curas[i]);
        }
    }
}