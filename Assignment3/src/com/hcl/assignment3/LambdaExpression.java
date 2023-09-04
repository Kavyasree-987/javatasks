package com.hcl.assignment3;
interface Add{  
    int add(int a,int b);  
}  
  
public class LambdaExpression{
	
    public static void main(String[] args) {  
          
       
        Add ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        
        Add ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
        
        
    }  
}  