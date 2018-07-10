package com.yiminwu;

import java.util.Vector;

interface RegisterPrototype extends Cloneable{
   public Object clone();
}

class ConcreteRegisterPrototype implements RegisterPrototype{
   public synchronized Object clone(){
    RegisterPrototype temp =  null;
    try {
     temp =  (RegisterPrototype) super.clone();
     return temp;
    } catch (CloneNotSupportedException e) {
     System.out.println("Clone failed!");
    }
    return temp;
   }
  }

class RegisterPrototypeMagager {
   private Vector objects = new Vector();
   public void add(RegisterPrototype prototype){
    objects.add(prototype);
   }
   public RegisterPrototype get(int i){
    return (RegisterPrototype)objects.get(i);
   }
   
   public int getSize(){
    return objects.size();
   }
  }
   

public class Hello {

   private static RegisterPrototypeMagager manager = new RegisterPrototypeMagager();
   private static RegisterPrototype prototype;
   public static void main(String args[]){
    prototype = new ConcreteRegisterPrototype();
    RegisterPrototype copytype = (RegisterPrototype) prototype.clone();
    manager.add(copytype);
    System.out.println(manager.getSize()); 
    System.out.println(manager.get(0).getClass()==prototype.getClass()); 
    System.out.println(manager.get(0)==prototype); 
    System.out.println(manager.get(0)==copytype); 
   }
}
