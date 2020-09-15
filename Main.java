/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

/**
 * Contoh Latihan
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        /*overloading pada constructor*/
        Player player1 = new Player("Nova");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Jenny");
        
        player1.show();
        player2.show();
        player3.show();
        player4.show();
        
        /*overloading methods*/
        int a = Mtk.tambah(1, 20);
        System.out.println(a);
        double b = Mtk.tambah(1, 0.90);
        System.out.println(b);
    }
}
