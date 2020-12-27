package com.forest.propertymanagement.mapper;

import com.forest.propertymanagement.entity.Forest_projectmanage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Forest_projectmanageMapper {
    /**
     * 查询收费项
     * @param model
     * @return
     */
    List<Forest_projectmanage> selectEmployee(Forest_projectmanage model);
}
