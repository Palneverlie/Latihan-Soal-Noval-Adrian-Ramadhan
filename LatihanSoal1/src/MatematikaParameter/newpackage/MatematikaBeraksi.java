/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatematikaParameter.newpackage;

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        
        int a = mtk.tambah(20,20);
        System.out.println(a);
        
        a = mtk.kurang(10,5);
        System.out.println(a);
        
        a = mtk.kali(10, 20);
        System.out.println(a);
        
        double b = mtk.bagi(21, 2);
        System.out.println(b);

    
       MatematikaCanggih mc = new MatematikaCanggih();
       mc.tambah(12.5, 28.7, 14.2);
       mc.tambah(12, 28, 14);
       mc.tambah(23, 34);
       // mc.tambah(3.4,4.9);
}
}
