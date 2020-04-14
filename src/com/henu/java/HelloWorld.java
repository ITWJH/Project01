package com.henu.java;


import com.henu.rjxy.Customers;

import java.util.ArrayList;

public class HelloWorld {
//    模板六 prsf:可以生成private static final  alt+enter依赖的添加
    private static final Customers cust = new Customers();
//    同类型1:psf
    public static final int NUM = 1;
//    同类型2:psfi
    public static final int NUM2 = 2;

    
//    模板一:psvm
    public static void main(String[] args) {

//        模板二:sout
        System.out.println();
//        变形: souf soutm
        System.out.printf("");
        System.out.println("HelloWorld.main");


//        模板三fori
        String []string=new String[]{"tom","jreey","jack","theshy"};
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
//        变形iter
        for (String s : string) {
            System.out.println(s);
        }
//        变形itar
        for (int i = 0; i < string.length; i++) {
            System.out.printf(string[i]);
        }

//        模板四list.for
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("the first item");
        arrayList.add("the sec");
        arrayList.add("the third item");
        for (String s : arrayList) {
            System.out.printf(s);
        }
//        变形: list.fori
        for (int i = 0; i < arrayList.size(); i++) {

        }
//        变形: lsit.forr  倒序遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {

        }



    }

    public void method(){

        ArrayList<String> list = new ArrayList<>();
        list.add("the first item");
        list.add("the sec");
        list.add("the third item");
//      模板五 ifn
        if (list == null) {

        }
//        变形inn
        if (list != null) {

        }
//        变形xxx.nn /xx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

 public void testMethod(){

 }
}
