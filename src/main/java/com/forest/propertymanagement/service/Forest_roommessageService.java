package com.forest.propertymanagement.service;

import com.forest.propertymanagement.entity.Forest_roommessage;
import com.forest.propertymanagement.mapper.Forest_roommessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Forest_roommessageService {
    @Resource
    Forest_roommessageMapper forest_roommessageMapper;

    /**
     * 查询房间信息
     * @return
     */
    public List<Forest_roommessage> selectEmployee(){
        return forest_roommessageMapper.selectEmployee();
    }
    /**
     * 新增房间信息
     * @param forest_roommessage
     * @return
     */
   public int insertSelective(Forest_roommessage forest_roommessage){
       return  forest_roommessageMapper.insertSelective(forest_roommessage);
   }

    /**
     * 删除房间信息
     * @param forest_roommessage
     * @return
     */
   public int deleteByPrimaryKeys(Forest_roommessage forest_roommessage){
       return  forest_roommessageMapper.deleteByPrimaryKeys(forest_roommessage);
   }


}
