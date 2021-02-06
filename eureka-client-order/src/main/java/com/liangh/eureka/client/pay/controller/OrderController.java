package com.liangh.eureka.client.pay.controller;

import com.liangh.eureka.client.pay.model.OrderReqDTO;
import com.liangh.eureka.client.pay.model.OrderResDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

	@RequestMapping("get")
	public OrderResDTO getBill(@RequestBody OrderReqDTO reqDTO){

		// 构建返回对象
		OrderResDTO resDTO = new OrderResDTO();
		resDTO.setBillNo(reqDTO.getOrderNo());
		resDTO.setBillAmount(100L);

		return resDTO;
	}


}
