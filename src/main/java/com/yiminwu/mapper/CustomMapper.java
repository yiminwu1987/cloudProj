package com.yiminwu.mapper;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

public interface CustomMapper<T, PK extends Serializable> {
   /**
    * 分页查询数据
    * @return
    */
   Page<T> getList(@Param(value="name") String name);

   /**
    * 删除多个
    * @param ids
    */
   int batchDelete(PK[] ids);
   
   List<T> selectByName(@Param(value="name") String name);
}
