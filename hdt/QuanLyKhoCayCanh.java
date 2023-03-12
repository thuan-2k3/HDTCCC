/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhoCayCanh {
    
    static ArrayList<CayCanh> khoCayCanh = new ArrayList<CayCanh>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while(true) {
            System.out.println("1. Thêm cây cảnh");
            System.out.println("2. Xóa cây cảnh");
            System.out.println("3. Hiển thị kho cây cảnh");
            System.out.println("4. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
                themCayCanh();
                break;
            case 2:
                xoaCayCanh();
                break;
            case 3:
                hienThiKhoCayCanh();
                break;
            case 4:
                System.out.println("Chương trình đã thoát.");
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng chọn chức năng từ 1 đến 4.");
                break;
            }
        }
    }
    
    public static void themCayCanh() {
        System.out.print("Nhập tên cây cảnh: ");
        String tenCayCanh = scanner.nextLine();
        System.out.print("Nhập giá cây cảnh: ");
        int giaCayCanh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập mô tả cây cảnh: ");
        String moTaCayCanh = scanner.nextLine();
        
        CayCanh cayCanh = new CayCanh(tenCayCanh, giaCayCanh, moTaCayCanh);
        khoCayCanh.add(cayCanh);
        System.out.println("Cây cảnh đã được thêm vào kho.");
    }
    
    public static void xoaCayCanh() {
        System.out.print("Nhập tên cây cảnh cần xóa: ");
        String tenCayCanh = scanner.nextLine();
        
        for(CayCanh cayCanh : khoCayCanh) {
            if(cayCanh.getTenCayCanh().equals(tenCayCanh)) {
                khoCayCanh.remove(cayCanh);
                System.out.println("Cây cảnh đã được xóa khỏi kho.");
                return;
            }
        }
        
        System.out.println("Không tìm thấy cây cảnh có tên " + tenCayCanh + " trong kho.");
    }
    
    public static void hienThiKhoCayCanh() {
    if(khoCayCanh.isEmpty()) {
        System.out.println("Kho cây cảnh hiện đang trống.");
        return;
    } else {
        System.out.println("Danh sách các cây cảnh trong kho:");
        for(CayCanh cayCanh : khoCayCanh) {
            System.out.println("Tên cây cảnh: " + cayCanh.getTenCayCanh());
            System.out.println("Giá cây cảnh: " + cayCanh.getGiaCayCanh());
            System.out.println("Mô tả cây cảnh: " + cayCanh.getMoTaCayCanh());
            System.out.println("----------------------");
        }
    }
}
    public static class CayCanh {
    private String tenCayCanh;
    private int giaCayCanh;
    private String moTaCayCanh;
    
    public CayCanh(String tenCayCanh, int giaCayCanh, String moTaCayCanh) {
        this.tenCayCanh = tenCayCanh;
        this.giaCayCanh = giaCayCanh;
        this.moTaCayCanh = moTaCayCanh;
    }
    
    public String getTenCayCanh() {
        return tenCayCanh;
    }
    
    public void setTenCayCanh(String tenCayCanh) {
        this.tenCayCanh = tenCayCanh;
    }
    
    public int getGiaCayCanh() {
        return giaCayCanh;
    }
    
    public void setGiaCayCanh(int giaCayCanh) {
        this.giaCayCanh = giaCayCanh;
    }
    
    public String getMoTaCayCanh() {
        return moTaCayCanh;
    }
    
    public void setMoTaCayCanh(String moTaCayCanh) {
        this.moTaCayCanh = moTaCayCanh;
    }
}
}