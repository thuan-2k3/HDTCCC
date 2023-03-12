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
public class xuatcay implements Serializable {
    private String macc ;
    private String tenloaicay ;
    private int ngayxuat ;
    private int soluongxuat ;

    public xuatcay() {
    }
    
    
    
    public xuatcay(String macc, String tenloaicay, int ngatxuat, int soluongxuat) {
        this.macc = macc;
        this.tenloaicay = tenloaicay;
        this.ngayxuat = ngatxuat;
        this.soluongxuat = soluongxuat;
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

    public int getNgayxuat() {
        return ngayxuat;
    }

    public void setNgatxuat(int ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public int getSoluongxuat() {
        return soluongxuat;
    }

    public void setSoluongxuat(int soluongxuat) {
        this.soluongxuat = soluongxuat;
    }
    
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ma cay : ");
        macc = input.nextLine();
        System.out.println("nhap vao ten loai cay  : ");
        tenloaicay = input.nextLine();
        System.out.println("nhap vao ngay xuat : ");
        ngayxuat = input.nextInt();
        System.out.println("nhap vao so luong xuat : ");
        soluongxuat = input.nextInt();
        
    }
    
    public void xuat()
    {
       System.out.println("ma cay :  "+ getMacc() +" ten loai cay : "+  getTenloaicay()
                +" ngay xuat " + getNgayxuat() + "so luong xuat " + getSoluongxuat());
       
    }
}
