package com.nguyenduyduong.buoi10;

public class Phone {
    private static boolean isNew = true;
    private String tenDienThoai;
    private String mauDienThoai;
    private double chieuDai;
    private double chieuRong;
    private int gia;

    public Phone(String tenDienThoai, String mauDienThoai, double chieuDai, double chieuRong, int gia) {
        System.out.println("Địa chỉ đối tượng được khởi tạo trong hàm khởi tạo " + this);
        this.tenDienThoai = tenDienThoai;
        this.mauDienThoai = mauDienThoai;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.gia = gia;
        System.out.println(this.gia + " VND");
    }

    public Phone(){
    }

    public static void nhanNutNguon(){
        System.out.println("Nhấn nút nguồn");
    }
    public static void turnOn(){
        nhanNutNguon();
        System.out.println("Máy đang khởi động. Vui lòng chờ trong giây lát!");
        System.out.println("Khởi động thành công");

    }
    public void bocSell(){
        this.turnOn();
        System.out.println("Khui máy mới thành công");
    }

    public static void main(String[] args) {
        Phone cucGachNokia = new Phone();
        Phone iphone17 = new Phone("Iphone 17 Pro Max 256GB", "Iphone", 20.5, 8.5, 100000000);
//        System.out.println(cucGachNokia);
//        System.out.println(iphone17);
        System.out.println("Địa chỉ của đối tượng iphone17 là " + iphone17);
        iphone17.bocSell();
        System.out.println(iphone17.tenDienThoai);
        System.out.println(cucGachNokia.isNew);
        System.out.println(iphone17.isNew);
        iphone17.isNew = false;
        System.out.println(cucGachNokia.isNew);
    }

}
