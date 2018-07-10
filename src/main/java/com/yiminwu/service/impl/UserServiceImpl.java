package com.yiminwu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.mapper.UserMapper;
import com.yiminwu.mapper.UserMapperCustom;
import com.yiminwu.mapper.UserProfileMapper;
import com.yiminwu.model.User;
import com.yiminwu.model.UserProfile;
import com.yiminwu.repository.UserRepository;
import com.yiminwu.service.UserService;
import com.yiminwu.util.CommonUtil;
import com.yiminwu.util.StringUtil;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer> 
   implements UserService {

   @Autowired
   private UserMapper userMapper;
   
   @Autowired
   private UserProfileMapper userProfileMapper;
   
   @Autowired
   private UserMapperCustom userMapperCustom;
   
   @Autowired
   private UserRepository userRepository;


   @Override
   protected BaseMapper<User, Integer> getMapper() {
      return userMapper;
   }

   @Override
   protected CustomMapper<User, Integer> getCustomMapper() {
      return userMapperCustom;
   }

   @Override
   public User getUserByPhone(String phone) {
      return userRepository.findByPhone(phone);
   }

   @Override
   public User getUserByName(String name) {
      return userRepository.findByName(name);
   }

   @Override
   public User matchUser(String nameOrPhone, String passward) {
      if (StringUtil.isEmpty(passward)) {
         return null;
      }
      User user = getUserByPhone(nameOrPhone);
      if (user == null) {
         user = getUserByName(nameOrPhone);
      }
      if (user != null && StringUtil.safeEquals(CommonUtil.encodePassword(passward), user.getPassward())) {
         return user;
      }
      return null;
   }
   
   public String getUserCode() {
      String code = StringUtil.getUserCode();
      User user  = userRepository.findByCode(code);
      while (StringUtil.isEmpty(code) || user != null) {
         code = StringUtil.getUserCode();
         user  = userRepository.findByCode(code);
      }
      return code;
   }

   @Override
   public boolean checkPhoneExists(String phone, Integer id) {
      User user = userRepository.findByPhone(phone);
      if (user != null) {
         if (id == null) {
            return true;
         } 
         if (!id.equals(user.getId())) {
            return true;
         } 
         return false;
      }
      return false;
   }
   
   @Override
   public UserProfile getUserProfileByUserId(Integer userId) {
      return userProfileMapper.selectByPrimaryKey(userId);
   }

   @Override
   public void addOrUpdateProfile(Integer id, UserProfile profile) {
      profile.setId(id);
      UserProfile oldProfile = getUserProfileByUserId(id);
      if (oldProfile == null) { 
         userProfileMapper.insert(profile);
      } else {
         userProfileMapper.updateByPrimaryKey(profile);
      }
      
   }
   
}
