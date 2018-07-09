package com.dingup.consumer.service;


import com.dingup.api.model.TsWxUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wancheng on 2018/7/5.
 */
@Component
@FeignClient(value = "provider1") //这里的name对应调用服务的spring.applicatoin.name
public interface ServiceAFeignClient {

    @RequestMapping("/wx/{id}")
    public TsWxUserInfo get(@PathVariable("id") Integer id);
}
