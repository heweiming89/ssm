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
		for (int i = 0; i < 10; i++) {
			User user = userService.selectByPrimaryKey(1);
			System.out.println(user);
		}
	}

}
