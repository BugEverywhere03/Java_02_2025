package com.nguyenduyduong.buoi7;

public class Computer {
    public String tenMayTinh;
    public String hangMayTinh;
    public int dungLuongRam;
    public int dungLuongOCung;

    // Hàm khởi tạo không có tham số
    public Computer() {
        super();
    }
    // Hàm khởi tạo có tham số
    public Computer(String tenMayTinh, String hangMayTinh, int dungLuongRam, int dungLuongOCung){
        this.tenMayTinh = tenMayTinh;
        this.hangMayTinh = hangMayTinh;
        this.dungLuongRam = dungLuongRam;
        this.dungLuongOCung = dungLuongOCung;
    }

    public void hienThiThongTin(){
        System.out.println("Tên máy: " + this.tenMayTinh);
        System.out.println("Tên hãng: " + this.hangMayTinh);
        System.out.println("Dung lượng ram: " + this.dungLuongRam + " GB");
        System.out.println("Dung lượng ổ cứng: " + this.dungLuongOCung + " GB");
    }

    public static void main(String[] args){
        Computer computer1 = new Computer("MSI Think 11SC", "MSI" ,
                8 , 512);
        System.out.println(new Computer());
        System.out.println(computer1);
        computer1.hienThiThongTin();

    }

}
