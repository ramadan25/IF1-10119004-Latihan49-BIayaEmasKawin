/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan49.biayaemaskawin;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program Ini Menampilkan Biaya Emas Kawin
 */
public class IF110119004Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emasKawin = new Emas();
        emasKawin.setBerat(15.7);
        emasKawin.setHarga(570000);
        
        
        DecimalFormat kurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp. ");
        symbol.setGroupingSeparator('.');
        
        kurs.setDecimalFormatSymbols(symbol);
        System.out.println("===Perhitungan Biaya Emas Kawin===");
        System.out.println("Berat Emas : " + emasKawin.getBerat() + " gram");
        System.out.println("Harga Emas : ".concat(kurs.format(emasKawin.getHarga())).replaceAll(",00", "").concat(" / gram / bulan Oktober"));
        System.out.println("\nTotal biaya : ".concat(kurs.format(emasKawin.totalHarga())).replaceAll(",00", ""));
    }
    
}
