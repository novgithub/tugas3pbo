/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

/**
 *
 * @author User
 */
public class Bio {
    
    String name;
    String country;
    int age;
    
    /*overloadoing pada constructor*/
   public Bio(){
      this.name = "trainee";
      this.country = "";
      this.age = 0;
   }
    
   public Bio(String name , String country , int age){
      this.name = name;
      this.country = country;
      this.age = age;
   }

   void show(){
       System.out.println("Name : " + this.name);
       System.out.println("Country : " + this.country);
       System.out.println("Age : " + this.age);
   }
}
