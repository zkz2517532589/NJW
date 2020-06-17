/**
 * 
 */
package com.njw.vip.service;

import java.util.List;

import com.njw.vip.pojo.User;
import com.njw.vip.vo.PageObject;

/**
*@autor zhangtao
*@下午2:55:54
*/
public interface UserService {
	PageObject findUsers(int pageCurrent,int pageSize,int pageCount);
}
