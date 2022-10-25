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
public class MatematikaCanggih {
    int tambah(int nilai1,int nilai2){
        int hasil = nilai1 + nilai2;
        return hasil;
    }
    int kurang(int nilai1,int nilai2){
        int hasil = nilai1 - nilai2;
        return hasil;
    }
    int kali(int nilai1,int nilai2){
        int hasil = nilai1 * nilai2;
        return hasil;
    }
    double bagi(double nilai1,double nilai2){
        double hasil = nilai1 / nilai2;
        return hasil;
    }
    //double
                void tambah(double a,double b,double c){
        System.out.println(a + " + " +b+ " + " +c+ " + "+(a+b+c));
    }
                void kurang(double a,double b,double c){
        System.out.println(a + " - " +b+ " - " +c+ " - "+(a-b-c));
        }
                void kali(double a,double b,double c){
        System.out.println(a + " * " +b+ " * " +c+ " * "+(a*b*c));
            }
                void bagi(double a,double b,double c){
        System.out.println(a + " / " +b+ " / " +c+ " / "+(a/b/c));
                }
                void modulus(double a,double b,double c){
        System.out.println(a + " % " +b+ " % " +c+" = "+(a%b%c));
   
    }
    
}
