package in.co.rays.doa;

import java.util.List;

import in.co.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long add(UserDTO dto);

	public void update(UserDTO dto);

	public void delete(long id);

	public UserDTO findByLogin(String login);

	public UserDTO authenticate(String login, String password);

	public UserDTO findByPK(long pk);

	public List search(UserDTO dto);

	public List search(UserDTO dto, int pageNo, int pageSize);

}
