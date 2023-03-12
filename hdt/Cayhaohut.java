/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author ADMIN
 */
public class Cayhaohut    {
    
    private int ngaykiemtra ;
    private String tenloaicay ;  
    private String macc ;
    private int soluonghaohut ;
    private int soluongconlai ;
  
   

    public Cayhaohut() {
    }

    public Cayhaohut(String macc, int soluonghaohut, int soluongconlai, String tenlaoicay, int ngaykiemtra) {
        this.macc = macc;
        this.soluonghaohut = soluonghaohut;
        this.soluongconlai = soluongconlai;
        this.tenloaicay = tenlaoicay;
        this.ngaykiemtra = ngaykiemtra;
    }

    public String getMacc() {
        return macc;
    }

    public void setMacc(String macc) {
        this.macc = macc;
    }

    public int getSoluonghaohut() {
        return soluonghaohut;
    }

    public void setSoluonghaohut(int soluonghaohut) {
        this.soluonghaohut = soluonghaohut;
    }

    public int getSoluongconlai() {
        return soluongconlai;
    }

    public void setSoluongconlai(int soluongconlai) {
        this.soluongconlai = soluongconlai;
    }

    public String getTenloaicay() {
        return tenloaicay;
    }

    public void setTenlaoicay(String tenlaoicay) {
        this.tenloaicay = tenlaoicay;
    }

    public int getNgaykiemtra() {
        return ngaykiemtra;
    }

    public void setNgaykiemtra(int ngaykiemtra) {
        this.ngaykiemtra = ngaykiemtra;
    }

    /*@Override
    public String toString() {
        return "Cayhaohut{" + "macc=" + macc + ", soluonghaohut=" + soluonghaohut + 
                ", soluongconlai=" + soluongconlai + ", tenlaoicay=" + tenloaicay +
                ", ngaykiemtra=" + ngaykiemtra + '}';
    }*/
    
     public void nhap()
    {
        Scanner input = new Scanner(System.in );
        System.out.println("nhap vao ngay kiem tra : ");
        ngaykiemtra = input.nextInt(); 
        System.out.println("nhap vao ten loai cay : ");
        tenloaicay = input.nextLine(); 
        System.out.println("nhap vap ma cay : ");
        macc = input.nextLine(); 
        System.out.println("nhap vao so luong cay hao hut : ");
        soluonghaohut = input.nextInt(); 
        System.out.println("nhap vao so luong con lai : ");
        soluongconlai = input.nextInt(); 
     }
    public void xuat()
    {
        System.out.println("ma cay :  "+ getMacc() +" ten loai cay : "+  getTenloaicay()
                +" ngay kiem tra : "+ getNgaykiemtra()  +" so luong hao hut : "+ getSoluonghaohut ()+
                 "so luong con lai : "+ getSoluongconlai ()) ;
                        
    }
}
class main{
    public static void main(String[] args) {
        
        Cayhaohut x=new Cayhaohut();
        xuatcay a = new xuatcay();
        hangtonkho b= new hangtonkho("hoa","qua", 3);
        
      
        b.xuat();
        x.setMacc("mcc1");
        x.xuat();
    }
}

     


 