package com.forest.propertymanagement.mapper;

import com.forest.propertymanagement.entity.Forest_cartype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface Forest_cartypeMapper {
    /**
     * 查询车位区域
     * @return
     */
    List<Forest_cartype> selectEmployee();
}
