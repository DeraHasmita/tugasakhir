/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasakhir;
import java.util.Scanner;
/**
 *
 * @author DERA HASMITA
 */
public class Tugasakhir {

    public static void main(String[] args) {
        
        Scanner masuk=new Scanner (System.in);
        
        System.out.print("Jumlah Mahasiswa : ");
        int jumlahmaha=masuk.nextInt();
        
        String datamaha[][] = new String[jumlahmaha][3];

        for(int i= 0; i<jumlahmaha; i++)
        {
            System.out.println("");
            System.out.println("Data Mahasiswa ke "+(i+1));

            for(int j=0;j<3;j++)
            {      
                if (j == 0)
                    System.out.print("NIM     :");
                else if (j == 1)
                    System.out.print("Nama    : ");
                else
                    System.out.print("Jurusan : ");
                
                System.out.print("");
                datamaha[i][j] = masuk.nextLine();
            }
        }

        System.out.println("Data Mahasiswa yang dimasukan");
        System.out.println("-----------------------------");
        System.out.println("NIM \t\t\t  NAMA \t\t  JURUSAN \t");
        
        for(int i=0;i<jumlahmaha;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(datamaha[i][j]+"\t\t");
            }
        System.out.println();
        }
    }
}