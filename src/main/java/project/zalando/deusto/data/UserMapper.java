package project.zalando.deusto.data;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import project.zalando.deusto.vo.UserVO;

public interface UserMapper {

	@Select("SELECT EMAIL, USERNAME FROM USER WHERE username = #{username} AND password = #{password}")
	UserVO getUser(@Param("username") String username, @Param("password") String password);


//	UserVO getUser(String username, String password);
	void addUser(UserVO user);
	void dropUser(String email);

}