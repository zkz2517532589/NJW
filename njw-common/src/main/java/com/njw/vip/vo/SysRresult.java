/**
 * 
 */
package com.njw.vip.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *返回状态信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRresult {
	private Integer status;
	private String message;	
	private Object data;
	
	public static SysRresult success(Object data) {
		return new SysRresult(200,"操作成功",data);
	}
	//没有数据的操作成功
	public static SysRresult success(String msg,Object data) {
		return new SysRresult(200,msg,null);
	}
	//没有数据的操作失败 
	public static SysRresult faile() {
		return new SysRresult(100,"操作失败",null);
	}
	

}
