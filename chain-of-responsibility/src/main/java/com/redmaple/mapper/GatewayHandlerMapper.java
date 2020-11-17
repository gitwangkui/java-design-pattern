package com.redmaple.mapper;

import com.redmaple.model.GatewayHandlerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Description:
 * date: 2020/11/16 21:55
 *
 * @author 若成风
 */
@Mapper
public interface GatewayHandlerMapper {
    /**
     * 获取第一个GatewayHandler
     *
     * @return
     */
    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid  FROM gateway_handler WHERE  prev_handler_id is null")
    public GatewayHandlerEntity getFirstGatewayHandler();

    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid   FROM gateway_handler WHERE  handler_id=#{handlerId}")
    public GatewayHandlerEntity getByHandler(String handlerId);

}
