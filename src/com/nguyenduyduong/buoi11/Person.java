package com.nguyenduyduong.buoi11;

public class Person {
    protected boolean gioiTinh;

    protected Person(boolean gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    protected boolean getGioiTinh() {
        return this.gioiTinh;
    }
}
