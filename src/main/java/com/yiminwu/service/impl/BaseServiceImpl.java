package com.yiminwu.service.impl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import com.yiminwu.common.PageInfo;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.model.BaseObject;
import com.yiminwu.service.BaseService;
import com.yiminwu.util.CollectionUtil;
import com.yiminwu.util.SQLUtil;

public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK>{
   
   protected abstract BaseMapper<T, PK> getMapper();
   
   protected abstract CustomMapper<T, PK> getCustomMapper();
   
   @Override
   public PageInfo<T> getList(String name) {
      return new PageInfo(getCustomMapper().getList(SQLUtil.buildRightLikeString(name)));
   }

   @Override
   public void delete(PK id) {
      getMapper().deleteByPrimaryKey(id);
      
   }

   @Override
   public void batchDelete(PK[] ids) {
      getCustomMapper().batchDelete(ids);
      
   }

   @Override
   public void addOrUpdate(PK id, T object) {
      if (id == null) {
         getMapper().insert(object);
      } else {
         getMapper().updateByPrimaryKey(object);
      }
      
   }

   @Override
   public boolean checkNameExists(String name, PK id) {
      List<T> list = getCustomMapper().selectByName(name);
      if (CollectionUtil.isNotEmpty(list)) {
         if (id == null) {
            return true;
         }
         for (Iterator<T> iter = list.iterator(); iter.hasNext();) {
            BaseObject obj = (BaseObject)iter.next();
            if (!id.equals(obj.getPK())) {
               return true;
            } 
         }
         return false;
      }
      return false;
   }

   @Override
   public T getById(PK id) {
      return getMapper().selectByPrimaryKey(id);
   }

}
