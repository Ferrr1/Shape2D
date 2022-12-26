/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2d;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ferr
 */
public class Main extends JFrame{
    
    public static void main(String[] args) {
        Shape2D PersegiPanjang = new Segitiga();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Shape3D Kubus = new Shape3D();
        Balok balok = new Balok();
        Limas LimasSegitiga = new Limas();
        Prisma prismaSegitiga = new Prisma();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        Bola bola = new Bola();

        limasSegtigaSamaSisi limas = new limasSegtigaSamaSisi();

        System.out.println("-----------------------Bangun 2D----------------------");
        System.out.println("Luas Persegi Panjang : " + PersegiPanjang.Luas(12, 40));
        System.out.println("Keliling Persegi Panjang : " + PersegiPanjang.Keliling(12, 40));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Segitiga : " + segitiga.Luas(12, 4));
        System.out.println("------------------------------------------------------");
        System.out.println("Keliling Lingkaran : " + lingkaran.Keliling(5));
        System.out.println("Luas Lingkaran : " + lingkaran.Luas(5));
        System.out.println("------------------------------------------------------");
        System.out.println("\n-----------------------Bangun 3D----------------------");
        System.out.println("Luas Kubus : "+Kubus.Luas(6));
        System.out.println("Keliling Kubus : "+Kubus.Keliling(6));
        System.out.println("Volume Kubus : "+ Kubus.Volume(6));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Balok : "+ balok.Luas(5, 10, 4));
        System.out.println("Keliling Balok : "+ balok.Keliling(5, 10, 4));
        System.out.println("Volume Balok : "+ balok.Volume(5, 10, 4));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Limas Segitiga : "+ LimasSegitiga.Luas(10, 12, 4, 7, 7, 7, 8, 9));
        System.out.println("Volume Limas Segitiga : "+ LimasSegitiga.Volume(10, 12, 8));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Prisma Segitiga : "+ prismaSegitiga.Luas(23, 17, 14, 12, 43));
        System.out.println("Volume Prisma Segitiga : "+ prismaSegitiga.Volume(43, 23));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Tabung : "+ tabung.Luas(12, 24));
        System.out.println("Volume Tabung : "+ tabung.Volume(12, 24));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Kerucut : "+ kerucut.Luas(15, 15));
        System.out.println("Volume Kerucut : "+ kerucut.Volume(15, 10));
        System.out.println("------------------------------------------------------");
        System.out.println("Luas Bola : " + bola.Luas(20));
        System.out.println("Volume Bola : "+bola.Volume(20));
        System.out.println("\n\n-------------------------End--------------------------");
        System.out.println("Luas Limas Segitiga Sama Sisi : "+ limas.luas(12, 4, 10));
        System.out.println("Volume Limas Segitiga Sama Sisi : "+ limas.volume(12, 4, 10));
        
        
        Main frame = new Main();
        frame.setBounds(10, 10, 700, 700);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        
        JTextField alas = new JTextField();
        alas.setBounds(5, 5, 100, 50);
        alas.setText("");
        frame.add(alas);
        
        JTextField tinggi = new JTextField();
        tinggi.setBounds(5, 75, 100, 50);
        tinggi.setText("");
        frame.add(tinggi);
        
        JTextField Hasil = new JTextField();
        Hasil.setBounds(5, 145, 100, 50);
        Hasil.setText("");
        frame.add(Hasil);
        
        JButton hitung = new JButton("Hitung");
        hitung.setBounds(115, 5, 100, 50);
        frame.add(hitung);
        
        hitung.addActionListener((ActionEvent ae) -> {
            double Alas,Tinggi,Luas;
            Alas = Double.parseDouble(alas.getText());
            Tinggi = Double.parseDouble(tinggi.getText());
            Luas = 0.5*Alas*Tinggi;
            Hasil.setText(String.valueOf(Luas));
        });
        
    }
}
