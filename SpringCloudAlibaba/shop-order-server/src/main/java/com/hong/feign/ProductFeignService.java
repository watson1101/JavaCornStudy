package com.hong.feign;

import com.hong.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hongw
 */
@FeignClient(name="product-service")
public interface ProductFeignService {
    @GetMapping("product/{pid}")
    Product findByPid(@PathVariable("pid") Long pid);
}
