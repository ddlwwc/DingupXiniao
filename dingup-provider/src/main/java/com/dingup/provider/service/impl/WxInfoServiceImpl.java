package com.dingup.provider.service.impl;


import com.dingup.api.model.TsWxUserInfo;
import com.dingup.provider.mapper.TsWxUserInfoMapper;
import com.dingup.provider.service.WxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wancheng on 2018/7/5.
 */
@Service
public class WxInfoServiceImpl implements WxInfoService {

    @Autowired
    TsWxUserInfoMapper tsWxUserInfoMapper;

    @Override
    public TsWxUserInfo get(Integer id) {
        return tsWxUserInfoMapper.selectByPrimaryKey(id);
    }
}
