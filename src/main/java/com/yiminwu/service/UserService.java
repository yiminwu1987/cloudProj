package com.yiminwu.service;

import com.yiminwu.model.User;
import com.yiminwu.model.UserProfile;

public interface UserService extends BaseService<User, Integer> {
   
   public User getUserByPhone(String phone);
   
   public User getUserByName(String name);
   
   public User matchUser(String nameOrPhone, String passward);
   
   public String getUserCode();
   
   public boolean checkPhoneExists(String phone, Integer id);
   
   public UserProfile getUserProfileByUserId(Integer userId);
   
   public void addOrUpdateProfile(Integer id, UserProfile profile);

}
