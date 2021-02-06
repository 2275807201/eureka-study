package com.liangh.eureka.client.pay.model;

import lombok.Data;

@Data
public class OrderResDTO {

	/**
	 * 账单编号
	 */
	private String orderNo;

	/**
	 * 订单金额
	 */
	private String orderAmount;

	/**
	 * 订单内容
	 */
	private String body;

	/**
	 * 账单编号
	 */
	private String billNo;


	/**
	 * 账单金额
	 */
	private Long billAmount;
}
