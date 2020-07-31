package com.icom.order.feign;

import java.util.UUID;

import com.icom.order.feign.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("iproduct")
public interface IProductFeignClient {
	
	@RequestMapping(path = "/product/{productId}", method = RequestMethod.GET, produces = "application/json")
    ProductDTO findById(@PathVariable UUID productId);
}
