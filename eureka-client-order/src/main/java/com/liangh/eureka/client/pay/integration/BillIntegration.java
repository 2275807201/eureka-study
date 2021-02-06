package com.liangh.eureka.client.pay.integration;

import com.liangh.eureka.client.pay.remote.BillRemote;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "eureka-client-pay")
public interface BillIntegration extends BillRemote {
}
