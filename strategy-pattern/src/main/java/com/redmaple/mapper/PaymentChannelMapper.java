package com.redmaple.mapper;

import com.redmaple.model.PaymentChannelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentChannelMapper {
     @Select("SELECT  id as id ,CHANNEL_NAME as CHANNELNAME ,CHANNEL_ID as CHANNELID,strategy_bean_id AS strategybeanid\n" +
             "FROM payment_channel where CHANNEL_ID=#{payCode}")
     public PaymentChannelEntity getPaymentChannel(String payCode);
}