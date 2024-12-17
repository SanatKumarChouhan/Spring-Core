package in.co.rays.doa;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.co.rays.dto.UserDTO;

public class UserMapper implements RowMapper<UserDTO> {

	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		UserDTO user = new UserDTO();
		
		user.setId(rs.getLong(1));
		user.setFirstName(rs.getString(2));
		user.setLastName(rs.getString(3));
		user.setLogin(rs.getString(4));
		user.setPassword(rs.getString(5));
		user.setAddress(rs.getString(6));
		return user;
	}
	
	
	}
