package com.liangh.eureka.client.pay.controller;

import com.liangh.eureka.client.pay.integration.BillIntegration;
import com.liangh.eureka.client.pay.model.OrderReqDTO;
import com.liangh.eureka.client.pay.model.OrderResDTO;
import com.liangh.eureka.client.pay.remote.model.BillReqDTO;
import com.liangh.eureka.client.pay.remote.model.BillResDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private BillIntegration billIntegration;

	@RequestMapping("get")
	public OrderResDTO getOrder(@RequestBody OrderReqDTO reqDTO){

		// 构建返回对象
		OrderResDTO resDTO = new OrderResDTO();
		resDTO.setOrderNo(reqDTO.getOrderNo());
		resDTO.setOrderAmount(150L);
		resDTO.setBody("买包子的钱");

		// rpc请求账单信息
		BillReqDTO billReqDTO = new BillReqDTO();
		billReqDTO.setBillNo(reqDTO.getOrderNo());
		BillResDTO bill = billIntegration.getBill(billReqDTO);

		// 填充账单信息
		resDTO.setBillNo(bill.getBillNo());
		resDTO.setBillAmount(bill.getBillAmount());

		return resDTO;
	}


}
