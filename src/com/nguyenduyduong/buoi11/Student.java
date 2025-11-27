package com.nguyenduyduong.buoi11;

public class Student extends Person{
    private String maSinhVien;
    private String hoVaTen;
    public int tuoi;
    String queQuan;

    public Student(String maSinhVien, String hoVaTen){
        super(true);
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
    }

    public void displayInfo(){
        System.out.println("Mã sinh viên " + this.maSinhVien + " Họ và tên: " + this.hienThiTen() + " Giới tính: " + this.getGioiTinh());
    }

    private String hienThiTen(){
        return this.hoVaTen;
    }

    public String getMaSinhVien(){
        return this.maSinhVien;
    }
    public String getHoVaTen(){
        return this.hoVaTen;
    }

    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    String getQueQuan() {
        return this.queQuan;
    }

    public static class Score{

    }
}
