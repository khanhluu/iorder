package com.icom.order.feign;

import java.util.UUID;

import com.icom.order.feign.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("icustomer")
public interface ICustomerFeignClient {
	
	@RequestMapping(path = "/api/customer/{customerId}", method = RequestMethod.GET, produces = "application/json")
    CustomerDTO findById(@PathVariable UUID customerId);
}
