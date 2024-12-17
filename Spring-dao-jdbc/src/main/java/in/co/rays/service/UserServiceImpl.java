package in.co.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.doa.UserDAOInt;
import in.co.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao = null;

	/**
	 *
	 */

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		// TODO Auto-generated method stub

		long pk = dao.add(dto);
		/*
		 * if (dto.getLogin().equals("admin")) { throw new
		 * RuntimeException("User with login 'admin' not allowed."); }
		 */
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		// TODO Auto-generated method stub

		dao.update(dto);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		// TODO Auto-generated method stub

		dao.delete(id);

	}

	@Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return dao.findByLogin(login);
	}

	@Transactional(readOnly = true)
	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub

		return dao.findByPK(pk);
	}

	@Transactional(readOnly = true)
	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		UserDTO user = dao.authenticate(login, password);
		return user;
	}

	@Transactional(readOnly = true)
	public List search(UserDTO dto) {
		// TODO Auto-generated method stub

		return dao.search(dto);
	}

	/*
	 * ise public List search(UserDTO dto, int pageNo, int pageSize) ese bhi return
	 * karwa sakte hai
	 */
//	public List search(UserDTO dto, int pageNo, int pageSize) {
//		// TODO Auto-generated method stub
//		UserDTO user = (UserDTO) dao.search(dto, pageNo, pageSize);
//		return (List) user;
//	}

	@Transactional(readOnly = true)
	public List search(UserDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}

}
