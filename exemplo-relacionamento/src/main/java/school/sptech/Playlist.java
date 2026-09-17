package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<Musica> musicas;
    private Usuario usuario;

    public Playlist(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = new ArrayList<>();
    }

    public void AdicionarMusica(Musica novaMusica) {
        this.musicas.add(novaMusica);
    }

    public void RemoverMusica(Musica novaMusica) {
        this.musicas.remove(novaMusica);
    }

    public Integer calcularDuracaoTotal() {
        Integer duracaoTotal = 0;

        for (Musica musica : this.musicas) {
            duracaoTotal += musica.getDuracaoSeg();
        }

        return duracaoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", musicas=" + musicas +
                ", usuario=" + usuario +
                '}';
    }
}
