package in.co.rays.doa;

import java.sql.JDBCType;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.co.rays.dto.UserDTO;

@Repository
public class UserDAOJDBCImpl implements UserDAOInt {

	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public long add(UserDTO dto) {
		// TODO Auto-generated method stub

		String sql = "insert into user values(?,?,?,?,?,?)";

		int pk = jdbcTemplate.update(sql, dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getLogin(),
				dto.getPassword(), dto.getAddress());
		return pk;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub

		String sql = "update user set id = ? first_name = ?, last_name = ?, login = ?, password = ? where id = ?";

		int i = jdbcTemplate.update(sql, dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getLogin(),
				dto.getPassword(), dto.getAddress());

	}

	public void delete(long id) {
		// TODO Auto-generated method stub

		String sql = "delete from user where id = ?";

		Object[] params = { id };
		int i = jdbcTemplate.update(sql, params);

	}

	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub

		String sql = "select id, first_name, last_name, login, password, address from user where login = ?";

		Object[] params = { login };
		UserDTO user = jdbcTemplate.queryForObject(sql, params, new UserMapper());
		return user;

	}

	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		try {
			String sql = "select id, first_name, last_name, login, password, address from user where login = ? and password = ?";
			Object[] params = { login, password };
			UserDTO user = jdbcTemplate.queryForObject(sql, params, new UserMapper());
			return user;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		String sql = "select id, first_name, last_name, login, password, address from user where id = ?";

		Object[] params = { pk };
		List list = jdbcTemplate.query(sql, params, new UserMapper());

		UserDTO dto = null;

		if (list.size() > 0) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}

	public List search(UserDTO dto) {
		// TODO Auto-generated method stub
		String sql = "select id, first_name, last_name, login, password, address from user";
		List l = jdbcTemplate.query(sql, new UserMapper());
		return l;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		String sql = "select id, first_name, last_name, login, password, address from user limit " + pageNo + "," + pageSize;
		List l = jdbcTemplate.query(sql, new UserMapper());
		return l;
	}

}
