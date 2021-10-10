package nextstep.helloworld;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Dao - 쿼리를 메서드에 매핑하여 메서드를 통해 DB에 접근할 수 있게 해줌
@Repository
public class HelloDao {
    private JdbcTemplate jdbcTemplate;

    public HelloDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(String name){
        String SQL = "insert into HELLO (name) values (?)";
        jdbcTemplate.update(SQL, new Object[]{name});
    }

    public int countByName(String name){
        String sql = "select count(1) from HELLO where name=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, name);
    }
}
