package com.liangh.eureka.client.pay.remote;

import com.liangh.eureka.client.pay.remote.model.BillReqDTO;
import com.liangh.eureka.client.pay.remote.model.BillResDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("bill")
public interface BillRemote {

	/**
	 * 获取账单详情
	 * @param reqDTO
	 * @return
	 */
	@RequestMapping("get")
	BillResDTO getBill(@RequestBody BillReqDTO reqDTO);

}

