package com.ik.service.miniprogram.service.impl;

import java.util.Date;
import java.util.Objects;

import org.mybatis.extend.generic.service.impl.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.ik.service.miniprogram.constants.ErrorCode;
import com.ik.service.miniprogram.mapper.EnrollInfoMapper;
import com.ik.service.miniprogram.model.EnrollInfo;
import com.ik.service.miniprogram.service.EnrollInfoService;

/**
 * ServiceImpl: EnrollInfoServiceImpl
 * Mapper : EnrollInfoMapper
 * Model  : EnrollInfo
 *
 * This ServiceImpl generated by MyBatis Generator Extend at 2019-04-13 10:21:18
 */
@Service
@Transactional
public class EnrollInfoServiceImpl extends GenericServiceImpl<EnrollInfo, Integer, EnrollInfoMapper>
        implements EnrollInfoService {
    @Autowired
    private EnrollInfoMapper enrollInfoMapper;

    @Override
    public EnrollInfoMapper getGenericMapper() {
        return enrollInfoMapper;
    }

    @Override
    public JSONObject saveEnrollInfo(JSONObject params) {
        JSONObject data = new JSONObject();
        EnrollInfo enrollInfo = new EnrollInfo();
        enrollInfo.setPhone(params.getString("phone"));
        enrollInfo = enrollInfoMapper.selectOne(enrollInfo);
        if (Objects.isNull(enrollInfo)) {
            data.put("error", ErrorCode.ALREADY_ENROLL);
            return data;
        }
        enrollInfo = params.toJavaObject(EnrollInfo.class);
        enrollInfo.setCreatedAt(new Date());
        enrollInfo.setUpdatedAt(new Date());
        enrollInfoMapper.insertSelective(enrollInfo);
        return data;
    }
}