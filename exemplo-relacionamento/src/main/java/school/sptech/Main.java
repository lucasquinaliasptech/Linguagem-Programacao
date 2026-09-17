package school.sptech;

public class Main {

    public static void main(String[] args) {

        Usuario usuario01 = new Usuario("Lucas", "lucas@gmail.com", "11988887777");

        System.out.println(usuario01);

        Musica musica01 = new Musica("Billie Jean", "Pop", "Thriller", 200, "Michael Jackson");
        Musica musica02 = new Musica("Boate Azul", "Sertanejo", "desconhecido", 250, "Bruno e Marrone");
        Musica musica03 = new Musica("Preciso me encontrar", "MPB", "me encontrando", 300, "Cartola");

        Playlist playlist01 = new Playlist("As mais top do 1CCOB", usuario01);
        System.out.println(playlist01);

        playlist01.AdicionarMusica(musica01);
        playlist01.AdicionarMusica(musica02);
        playlist01.AdicionarMusica(musica03);

        System.out.println(playlist01);

        System.out.println("Duração total: " + playlist01.calcularDuracaoTotal());
    }
}
