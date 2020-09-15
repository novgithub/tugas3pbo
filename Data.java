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
public class Data {
     public static void main(String[] args) {
        /*overloading pada constructor*/
        Bio bio1 = new Bio();
        Bio bio2 = new Bio("Jake","Australian-Korean",19);
        Bio bio3 = new Bio("Jay","American-Korean",20);
        
        bio1.show();
        bio2.show();
        bio3.show();
        
    }
}
