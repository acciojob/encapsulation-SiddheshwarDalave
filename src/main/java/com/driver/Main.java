package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly rw=new RWOnly();
      //System.out.println(rw.name);
      //ava: name has private access in com.driver.RWOnly
      rw.setName("Person");
      String output=rw.getName();
      System.out.println(output);
  }
}