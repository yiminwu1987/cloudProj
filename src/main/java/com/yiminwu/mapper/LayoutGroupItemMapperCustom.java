package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LayoutGroupItemMapperCustom {
   
   int batchDelete(@Param("groupId") Integer groupId, @Param("memberType") String memberType, @Param("ids") Long[] ids);
   
   int deleteAllByGroupId(Integer groupId);
   
   int deleteAllByGroupIdAndNoIncludeLinkType(@Param("groupId") Integer groupId, @Param("linkType") String linkType);
   
   int deleteAllByGroupIds(Integer[] groupIds);
   
   
}