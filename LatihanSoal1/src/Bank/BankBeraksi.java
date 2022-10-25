/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import static java.lang.Integer.parseInt;

/**
 *
 * @author hp
 */
public class BankBeraksi {

    /**
     *
     */
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("selamat datang di bank abc");
        b.getSaldo();
        
        System.out.println("Simpan Uang : Rp. ");
        int input=parseInt(scanner.nextLine());
        b.simpanUang(input);
        
        System.out.println("Ambil Uang : Rp. ");
        input=parseInt(scanner.nextLine());
        b.ambilUang(input);
        
        
   
    }
    
}
