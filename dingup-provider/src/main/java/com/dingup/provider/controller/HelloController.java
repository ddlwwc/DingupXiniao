package com.dingup.provider.controller;


import com.dingup.api.model.TsWxUserInfo;
import com.dingup.provider.service.WxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wancheng on 2018/7/5.
 */
@RestController
public class HelloController {

    @Autowired
    WxInfoService wxInfoService;


    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public String tes(@PathVariable("id") String id){
        return id;
    }

    @RequestMapping(value = "/wx/{id}",method = RequestMethod.GET)
    public TsWxUserInfo get(@PathVariable("id") Integer id){
        return wxInfoService.get(id);
    }
}
