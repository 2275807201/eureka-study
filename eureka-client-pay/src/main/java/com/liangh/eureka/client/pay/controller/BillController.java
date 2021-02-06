package com.liangh.eureka.client.pay.controller;

import com.liangh.eureka.client.pay.remote.BillRemote;
import com.liangh.eureka.client.pay.remote.model.BillReqDTO;
import com.liangh.eureka.client.pay.remote.model.BillResDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bill")
public class BillController implements BillRemote {

	@Override
	@RequestMapping("get")
	public BillResDTO getBill(@RequestBody BillReqDTO reqDTO){

		// 构建返回对象
		BillResDTO resDTO = new BillResDTO();
		resDTO.setBillNo(reqDTO.getBillNo());
		resDTO.setBillAmount(100L);

		return resDTO;
	}


}
