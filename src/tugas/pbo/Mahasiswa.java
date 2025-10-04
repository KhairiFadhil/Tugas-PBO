/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo;

/**
 *
 * @author raidf
 */
public class Mahasiswa {
      private String nama; //variable nama
      private double ipk; // variable ipk
      private int npm; // variable npm
      
      
      /*
        ini construction function gunanya sebagai code yang akan di eksekusi pertama ketika class di gunakan
        untuk construction tanpa parameter adalah non - argumen parameter
        construction ini akan berjalan ketika class mahasiswa di gunakan tanpa argumen
        secara default akan mengisi variable nama dengan value "Kosong", ipk dengan value 0.0, dan NPM dengan value 0
      
        contoh pemanggilan:
            Mahasiswa m1 = new Mahasiswa();
       */
      public Mahasiswa(){
          this.nama = "Kosong";
          this.ipk = 0.0;
          this.npm = 0;
          
      }
      
      /*
        parameterize constuction, construction ini akan berjalan ketika class di gunakan dengan paramter (string, npm, ipk)
        berbeda dengan yang tanpa parameter, onstructor ini akan mengisi value untuk variable nama, ipk, dan, npm sesuai dengan value di paramternya
        contoh pemanggilan:
            Mahasiswa m2 = new Mahasiswa("Raid", 2417052004, 3.85);
      */
      public Mahasiswa(String nama, int npm, double ipk){
          this.nama = nama;
          this.ipk = ipk;
          this.npm = npm;
      }
      
      /*
        fungsi ini berguna untuk mencetak informasi mahasiswa seperti nama, npm, dan ipk   
        menggunakan System.out.printf agar hasil tampilan lebih rapi.
        Format:
            %s = string
            %d = integer
            %.2f = float/double dengan 2 angka di belakang koma
      */
      public void tampilkanData(){
          System.out.println("===================");
          System.out.printf("Data Mahasiswa %s%n", this.nama);
          System.out.printf("Nama : %s%n", this.nama);
          System.out.printf("NPM : %d%n", this.npm);
          System.out.printf("IPK : %.2f%n", this.ipk);
      }
      
      /*
      update data ini untuk mengupdate value untuk variable ipk
        contoh pemanggilan:
            mhs.updateData(3.2);
      */
      public void updateData(double ipk){
          this.ipk = ipk;
          System.out.printf("Ipk %s di perbarui menjadi %.2f%n", this.nama, this.ipk);
      }
      
      /*
      versi lain dari updateData()
      updatedata ini untuk mengupdate value untuk variable nama
      contoh pemanggilan:
            mhs.updateData("Raid Khairi");
      */
      public void updateData(String nama){
          this.nama = nama;
          System.out.printf("Nama di perbarui menjadi %s", this.nama);
      }
      
}
