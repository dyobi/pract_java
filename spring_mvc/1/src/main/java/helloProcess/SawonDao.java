package helloProcess;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SawonDao {

    private ArrayList<Object> arr;
    private JdbcTemplate jt;

    public JdbcTemplate getJdbcTemplate() {
        return jt;
    }

    public void setJdbcTemplate(JdbcTemplate jt) {
        this.jt = jt;
    }

    public  ArrayList<Object> selectAll() {
        StringBuffer sb = new StringBuffer();//문자열의 변화가 많을때
        sb.append("select name, tel from teltable");//jt.query(sql, new RowMapper())

        arr = (ArrayList<Object>)getJdbcTemplate().query(sb.toString(), new RowMapper<Object>() {
            public Object mapRow(ResultSet rs, int jool) throws SQLException {
                SawonVO sv = new SawonVO();
                System.out.println("줄번호 = " + jool);
                sv.setName(rs.getString("name"));
                sv.setTel(rs.getString("tel"));
                return sv;
            }
        });
        System.out.println("자료 총갯수는 " + kajacnt());
        return arr;
    }

    public int kajacnt() {
        int soo = jt.queryForObject("select count(name) from  teltable", Integer.class);
        return soo;
    }

}
