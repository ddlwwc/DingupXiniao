package com.dingup.provider.mapper;



import com.dingup.api.model.TsWxUserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TsWxUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TsWxUserInfo record);

    int insertSelective(TsWxUserInfo record);

    TsWxUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TsWxUserInfo record);

    int updateByPrimaryKey(TsWxUserInfo record);

    TsWxUserInfo selectByOpenId(String openId);
}