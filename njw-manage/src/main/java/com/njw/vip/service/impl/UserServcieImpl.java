/**
 * 
 */
package com.njw.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njw.vip.mapper.UserMapper;
import com.njw.vip.pojo.User;
import com.njw.vip.service.UserService;
import com.njw.vip.vo.EasyUI;


/**
 * @author Administrator
 *
 */

@Service
public class UserServcieImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public EasyUI findUsers(int page,int rows) {
		IPage<User>ipage=new Page<User>();
		QueryWrapper<User>queryWrapper=new QueryWrapper<>();
		queryWrapper.orderByDesc("lastjointime");
		ipage=userMapper.selectPage(ipage, queryWrapper);
		List<User>users=ipage.getRecords();
		int totels=(int)ipage.getTotal();
		return new EasyUI(totels, users);
	}

	
}
