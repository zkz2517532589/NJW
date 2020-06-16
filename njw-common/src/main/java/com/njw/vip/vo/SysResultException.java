/**
 * 
 */
package com.njw.vip.vo;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 *
 */
@RestControllerAdvice
@Slf4j
public class SysResultException {
	@ExceptionHandler(RuntimeException.class)
	public Object handlerException(Exception e) {
		
		log.error(e.getMessage());
		e.printStackTrace();
		return SysRresult.faile();
	};
}
