/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt;

import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class hangtonkho implements Serializable {
    private String macc ;
    private String tenloaicay ;
    private int soluong ;

    public hangtonkho() {
    }


    public hangtonkho(String macc, String tenloaicay, int soluong) {
        this.macc = macc;
        this.tenloaicay = tenloaicay;
        this.soluong = soluong;
    }

    public String getMacc() {
        return macc;
    }

    public void setMacc(String macc) {
        this.macc = macc;
    }

    public String getTenloaicay() {
        return tenloaicay;
    }

    public void setTenloaicay(String tenloaicay) {
        this.tenloaicay = tenloaicay;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
  
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ma cay : ");
        macc = input.nextLine();
         System.out.println("nhap vao ten laoi cay : ");
        tenloaicay = input.nextLine();
         System.out.println("nhap vao so luong : ");
        soluong = input.nextInt();
        
    }
    public void xuat()
    {
        System.out.println("ma cay :  "+ getMacc() +" ten loai cay : "+  getTenloaicay()
                + "so luong " + getSoluong() );
    }
}
