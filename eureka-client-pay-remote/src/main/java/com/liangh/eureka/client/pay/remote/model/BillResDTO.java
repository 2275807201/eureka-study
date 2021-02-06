package com.liangh.eureka.client.pay.remote.model;

import lombok.Data;

@Data
public class BillResDTO {

	/**
	 * 账单编号
	 */
	private String billNo;


	/**
	 * 账单金额
	 */
	private Long billAmount;
}
