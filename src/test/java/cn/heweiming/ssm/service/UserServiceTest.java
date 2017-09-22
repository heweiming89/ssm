package cn.heweiming.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.heweiming.ssm.SSMApplicationTest;
import cn.heweiming.ssm.model.User;

public class UserServiceTest extends SSMApplicationTest {

	@Autowired
	private UserService userService;

	@Test
	public void testSelectByPrimaryKey() {
		try {
			User user = userService.selectByPrimaryKey(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
