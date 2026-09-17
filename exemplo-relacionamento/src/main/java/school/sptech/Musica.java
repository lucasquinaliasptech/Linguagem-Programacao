package school.sptech;

public class Musica {

    private String nome;
    private String genero;
    private String album;
    private Integer duracaoSeg;
    private String artista;

    public Musica(String nome, String genero, String album, Integer duracaoSeg, String artista) {
        this.nome = nome;
        this.genero = genero;
        this.album = album;
        this.duracaoSeg = duracaoSeg;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuracaoSeg() {
        return duracaoSeg;
    }

    public void setDuracaoSeg(Integer duracaoSeg) {
        this.duracaoSeg = duracaoSeg;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", album='" + album + '\'' +
                ", duracaoSeg=" + duracaoSeg +
                ", artista='" + artista + '\'' +
                '}';
    }
}
