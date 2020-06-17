/**
 * 
 */
package com.njw.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.njw.vip.mapper.UserMapper;
import com.njw.vip.pojo.User;
import com.njw.vip.service.UserService;
import com.njw.vip.vo.PageObject;

/**
 * @author Administrator
 *
 */

@Service
public class UserServcieImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public PageObject findUsers(int pageCurrent, int pageSize, int pageCount) {
		QueryWrapper<User>queryWrapper=new QueryWrapper<>();
		queryWrapper.orderByDesc("lastjointime");
		userMapper.selectList(queryWrapper);
		return null;
	}

	
}
