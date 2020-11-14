/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan49.biayaemaskawin;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program Ini Menampilkan Biaya Emas Kawin
 */
class Emas {
    private double harga, berat;
    
    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double getBerat() {
        return berat;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public double totalHarga() {
        return harga * berat;
    }
    
}
