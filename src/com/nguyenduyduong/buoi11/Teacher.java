package com.nguyenduyduong.buoi11;

public class Teacher {
    public static void main(String[] args) {
        Student student = new Student("SV01", "Hoàng Hải Anh");
        System.out.println(student.getMaSinhVien());
        System.out.println(student.getHoVaTen());
        // student.displayInfo();
        // student.maSinhVien = "SV02";
        student.setMaSinhVien("SV02");
        System.out.println(student.getMaSinhVien());
        System.out.println(student.tuoi);
        student.tuoi = 22;
        System.out.println(student.tuoi);
        student.displayInfo();
        student.queQuan = "Thành phố Huế";
        System.out.println(student.getQueQuan());
    }
}
