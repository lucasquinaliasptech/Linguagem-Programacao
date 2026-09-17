package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MusicaDao {

    private final JdbcTemplate jdbcTemplate;

    public MusicaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Escreva os métodos abaixo */

    public List<Musica> findAll() {
        return jdbcTemplate.query("select * from musica", new BeanPropertyRowMapper<>(Musica.class));
    }

    public Musica findById(Integer id) {
        if (id == null || id <= 0) {
            return null;
        }

        List<Musica> musicas = jdbcTemplate.query("select * from musica where id = ?", new BeanPropertyRowMapper<>(Musica.class), id);

        return musicas.isEmpty() ? null : musicas.get(0);
    }

    public List<Musica> findByNomeLike(String nome) {
        if (nome == null) {
            return null;
        }

        nome = "%" + (nome.toLowerCase()) + "%";

        List<Musica> musicas = jdbcTemplate.query("select * from musica where lower(nome) like lower(?)", new BeanPropertyRowMapper<>(Musica.class), nome);

        return musicas;
    }

    public List<Musica> findByArtista(String artista) {
        if (artista == null) {
            return null;
        }

        List<Musica> musicas = jdbcTemplate.query("select * from musica where artista = ?", new BeanPropertyRowMapper<>(Musica.class), artista);

        return musicas;
    }

    public List<Musica> findByAlbum(String album) {
        if (album == null) {
            return null;
        }

        List<Musica> musicas = jdbcTemplate.query("select * from musica where album = ?", new BeanPropertyRowMapper<>(Musica.class), album);

        return musicas;
    }

    public List<Musica> findByDuracaoGreaterThan(Integer duracao) {
        if (duracao == null) {
            return null;
        }

        List<Musica> musicas = jdbcTemplate.query("select * from musica where duracao > ?", new BeanPropertyRowMapper<>(Musica.class), duracao);

        return musicas;
    }

    public List<Musica> findByAlbumAndNomeLike(String album, String nome) {
        if (album == null || nome == null) {
            return null;
        }

        nome = "%" + (nome.toLowerCase()) + "%";

        List<Musica> musicas = jdbcTemplate.query("select * from musica where album = ? and lower(nome) like lower(?)", new BeanPropertyRowMapper<>(Musica.class), album, nome);

        return musicas;
    }

    public void save(Musica musica) {
        List<Musica> musicas = jdbcTemplate.query("select * from musica where id = ?", new BeanPropertyRowMapper<>(Musica.class), musica.getId());

        if (musicas.isEmpty()) {
            jdbcTemplate.update("insert into musica (nome, artista, album, duracao) values (?, ?, ?, ?)", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao());
            return;
        }

        jdbcTemplate.update("update musica set nome = ?, artista = ?, album = ?, duracao = ? where id = ?", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao(), musica.getId());
    }

    public void deleteById(Integer id) {
        jdbcTemplate.update("delete from musica where id = ?", id);
    }
}
