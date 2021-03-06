package cn.heweiming.ssm.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.heweiming.ssm.mapper.UserMapper;
import cn.heweiming.ssm.model.User;
import cn.heweiming.ssm.model.UserExample;
import cn.heweiming.ssm.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, UserMapper> implements UserService {

	@Override
	@Cacheable(value = "user")
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return super.selectByPrimaryKey(id);
	}

}
