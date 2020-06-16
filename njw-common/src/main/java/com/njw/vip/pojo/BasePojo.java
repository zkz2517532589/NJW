package com.njw.vip.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BasePojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 795875360253277950L;
	private Date lastjointime;
	private Date createtime;
	
}
