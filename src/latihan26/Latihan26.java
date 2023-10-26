/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author Lenovo
 Nama :Ma'rifatu Khirzah
 NIM :22205025
 Prodi :Teknik Informatika
 Deskripsi :Membuat program menampilkan waktu saat ini sesuai dengan lokasi kita berada saat ini.
 */
public class Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dapatkan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        Locale locale = new Locale("id", "ID");
        
        // format waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", locale);
        
        // Tampilkan waktu
        System.out.println("Hari ini adalah hari : " + formatter.format(waktuSaatIni));
        
    }
    
}
