/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo;

/**
 *
 * @author raidf
 */
public class TugasPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Mahasiswa mhs1 = new Mahasiswa("Khairi", 1, 3.8); // membuat objek mhs1 dengan nama Khairi, npm 1, dan ipk 3.8
        mhs1.tampilkanData(); // memanggil method tampilkanData
        mhs1.updateData("Test"); // memanggil method updateData dengan parameter "Test"
        mhs1.tampilkanData();
//        Mahasiswa[] mhsList = new Mahasiswa[10];
//        mhs1.tampilkanData(); 
    }
    
}
