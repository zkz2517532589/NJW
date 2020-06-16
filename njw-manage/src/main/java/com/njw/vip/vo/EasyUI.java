/**
 * 
 */
package com.njw.vip.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EasyUI implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8296978691790021902L;
	private int totels;
	private Object data;
}
