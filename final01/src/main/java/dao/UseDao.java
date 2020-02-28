package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import util.DBUtil;

//object/relation mapping框架
public class UseDao {
	public List<User> findAll() throws Exception{
		List<User> users = new ArrayList<>();
		Connection conn = null;
		try {
			
			conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM t_user");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("pssword"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			DBUtil.close(conn);
		}
		return users;
	}
	
	public static void main(String[] args) throws Exception {
		UseDao dao = new UseDao();
		List<User> list = dao.findAll();
		for(User i : list) {
			System.out.println(i);
		}
	}
}
