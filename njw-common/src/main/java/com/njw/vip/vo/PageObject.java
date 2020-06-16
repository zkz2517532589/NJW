/**
 * 
 */
package com.njw.vip.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageObject {
	/**
	 * 
	 */
	private Integer pageCurrent;
	private Integer pageCount;
	private Integer pageSize;
	private List data;
}
