package com.njw.vip.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@TableName  //默认表名与类名相同
@Data
public class User extends BasePojo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5495851856467825390L;
	private Integer userid;
	private String username;
	private Integer userstate;
	private Integer useradmin;
	
	
}
