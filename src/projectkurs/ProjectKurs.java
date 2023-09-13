/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkurs;

/**
 *
 * @author USER
 */
public class ProjectKurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Header tabel
        System.out.println("+----------------+--------------+--------------+--------------+--------------+--------------+--------------+");
        System.out.println("| Mata Uang      | SR (Beli)    | SR (Jual)    | TTC (Beli)   | TTC (Jual)   | BN (Beli)    | BN (Jual)    |");
        System.out.println("+----------------+--------------+--------------+--------------+--------------+--------------+--------------+");

        // Data kurs
        String[] mataUang = {"AUD","CAD","CHF","CNY","DKK","EUR","GBP","HKD","JPY","MYR","NOK","NZD","SAR","SEK","SGD","THB","USD"};
        double[] srJual = {9.853,11.298,17.125,2.108,2.240,16.490,19.195,1.963,0.104,3.288,1.491,9.070,4.098,1.406,11.280,0.432,15.350};
        double[] srBeli = {9.834,11.276,17.185,2.095,2.177,16.461,19.163,1.955,0.104,3.276,1.388,9.051,4.082,1.357,11.258,0.428,15.330};
        double[] ttcBeli = {9.657,11.129,16.850,2.055,2.126,16.245,18.925,1.890,0.102,3.159,1.383,8.896,3.914,1.341,11.099,0.411,15.200};
        double[] ttcJual = {10.045,11.460,17.577,2.158,2.298,16.725,19.456,2.034,0.106,3.416,1.498,9.238,4.283,1.424,11.453,0.453,15.500};
        double[] bnBeli = {9.657,11.129,16.850,2.055,0,16.245,18.925,1.890,0.102,3.159,0,8.896,3.914,0,11.099,0,15.200};
        double[] bnJual = {10.045,11.460,17.577,2.158,0,16.725,19.456,2.034,106.49,3.416,0,9.238,4.283,0,11.453,0,15.500};
        
         //Menampilkan data dalam format tabel
        for (int i = 0; i < mataUang.length; i++) {
            System.out.printf("| %-14s | %-12.3f | %-12.3f | %-12.3f | %-12.3f | %-12.3f | %-12.3f |\n", mataUang[i], srJual[i], srBeli[i],ttcBeli[i],ttcJual[i],bnBeli[i],bnJual[i]);
        }

        // Footer tabel
        System.out.println("+----------------+--------------+--------------+--------------+--------------+--------------+--------------+");
          // Header tabel
//        System.out.println("+----------------+--------------+");
//        System.out.println("| Mata Uang      | Nilai Kurs   |");
//        System.out.println("+----------------+--------------+");
//
//        // Data kurs
//        String[] mataUang = {"AUD","CAD","CHF","CNY","DKK","EUR","GBP","HKD","JPY","MYR","NOK","NZD","SAR","SEK","SGD","THB","USD"};
//        double[] nilaiKurs = {9.853,11.298,17.125,2.108,2.240,16.490,19.195,1.963,104,3.288,1.491,9.070,4.098,1.406,11.280,432,15.350};
//
//        // Menampilkan data dalam format tabel
//        for (int i = 0; i < mataUang.length; i++) {
//            System.out.printf("| %-14s | %-12.2f |\n", mataUang[i], nilaiKurs[i]);
//        }
//
//        // Footer tabel
//        System.out.println("+----------------+--------------+");
    }
    
}
