package com.yiminwu.service;

import java.io.Serializable;
import com.yiminwu.common.PageInfo;

public interface BaseService<T, PK extends Serializable> {

   public PageInfo<T> getList(String name);

   public void delete(PK id);

   public void batchDelete(PK[] ids);

   public void addOrUpdate(PK id, T object);
   
   public boolean checkNameExists(String name, PK id);
   
   public T getById(PK id);
}
