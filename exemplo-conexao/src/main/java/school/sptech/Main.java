package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate template = new JdbcTemplate(conexao.getConexao());

        template.execute("DROP TABLE PESSOA IF EXISTS");

        template.execute("CREATE TABLE PESSOA " +
                "(id int primary key auto_increment, " +
                "nome varchar(50)," +
                "data_nascimento DATE," +
                "isAdmin bit)");

        // UPDATE, QUERY

        System.out.println("INSERT");
        template.update("INSERT INTO PESSOA VALUES " +
                "(DEFAULT, ?, ?, ?)", "Lucas", "2005-06-21", 1);
        List<Pessoa> pessoas = template.query("SELECT * FROM PESSOA", new BeanPropertyRowMapper<>(Pessoa.class));
        System.out.println(pessoas);

        System.out.println("UPDATE");
        template.update("UPDATE PESSOA SET nome = ? WHERE id = ?", "Lucas Raphael", 1);
        pessoas = template.query("SELECT * FROM PESSOA", new BeanPropertyRowMapper<>(Pessoa.class));
        System.out.println(pessoas);

        System.out.println("DELETE");
        template.update("DELETE FROM PESSOA WHERE id = ?", 1);
        pessoas = template.query("SELECT * FROM PESSOA", new BeanPropertyRowMapper<>(Pessoa.class));
        System.out.println(pessoas);

        //queryForObject
        template.update("INSERT INTO PESSOA VALUES " +
                "(DEFAULT, ?, ?, ?)", "Marcos", "2005-06-21", 1);
        template.update("INSERT INTO PESSOA VALUES " +
                "(DEFAULT, ?, ?, ?)", "Fernando", "2005-06-21", 1);

        Pessoa pessoa = template.queryForObject("SELECT * FROM PESSOA WHERE id = ?", new BeanPropertyRowMapper<>(Pessoa.class), 2);

        System.out.println(pessoa);
    }
}
