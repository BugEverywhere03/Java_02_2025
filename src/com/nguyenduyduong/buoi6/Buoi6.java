package com.nguyenduyduong.buoi6;

import java.util.Scanner;

public class Buoi6 {
    static String message = "Buổi 6";
    public static void main(String[] args) {
        // Phạm vi của biến và vòng lặp
        // Phạm vi của biến là vùng mà giá trị của biến có thể truy xuất được
        // Biến có thể có các phạm vị sau đây:
        // Phạm vị trong một khối lệnh
        // Phạm vị trong một hàm
        // Phạm vi trong một lớp
        // Phạm vi trong một vòng lặp
        // Khi mà ra khỏi vi mà biến giá trị của biến thì không thể truy xuất giá trị của biến
        // # Phạm vi trong một khối lệnh
        // Ví dụ
        // Cho số a nếu lớn hơn 0 thì tạo ra một biến có tên là b có giá trị bằng giá trị của a * 10
//        int a = 20;
//        if (a > 0) {
//            int b = a * 10;
//            System.out.println(b);
//        }
        // Biến b không có phạm vi ở đây
        // System.out.println(b);
//        dienTichHinhTron(5);
        // Biến static (biến tĩnh) là biến thuộc về lớp
        // Có phạm vi sử dụng/truy xuất giá trị là ở trong class
        // Tức là có thể truy xuất giá trị ở bất cứ đâu trong class
        // Biến static chỉ sử dụng được trong các phương thức/hàm static
        // Các hàm hay biến static thì sử dụng tên của class để sử dụng biến hoặc là gọi hàm
        // Các phương thức/hàn mà trong lớp Math chính các phương thức tĩnh (hay là phương thức thuộc về lớp)
        // Math.round(), Math.random() -> Hàm static
        // cú pháp khai báo một biến hàm static
        // Khai báo biến static
        // static <Kiểu dữ liệu> <Tên biến>
        // Khai báo một hàm static
        // static <Kiểu trả về của hàm> <Tên hàm> (Các tham số){
        //}
//        System.out.println(message);
        // Vòng lặp là một cấu trúc cho phép lặp lại một số câu lệnh trong một bao nhiêu đó
        // Thì cấu trúc được sinh ra để lặp lại nhằm tránh lặp lại các câu lệnh có cú pháp tự nhau
        // ví dụ in ra các số từ 1 -> 10
        // Nếu không sử dụng vòng lặp thì phải viết lệnh system.out.println(10) lần từ 1-> 10
        /*
        Có 3 loại vòng lặp:
            + Vòng lặp for (Vòng lặp với số lần biết trước)
            + Vòng lặp while (Vòng lặp với số lần không biết trước/ tức là lặp cho đến khi đạt được gì đó)
            + Vòng lặp do-while(Vòng lặp mà luôn thực thi cái khối lệnh lặp ít nhất một lần)
        */
        /*  Vòng lặp luôn có 3 phần:
            + Biến lặp
            + Điều kiện lặp
            + Khối lệnh lặp
         */
        // # Vòng lặp for:
        // Cấu trúc:
        /* for (<Khởi tạo biến lặp; <Điều kiện lặp>; <Cập nhật biến lặp>){
            <khối lệnh>
           }
           Ví dụ sử dụng cấu trúc vòng lặp để in ra bảng cửu chương 5
        * */
//            for (int i = 1; i <= 10; i++){
//                System.out.println(i * 5);
//            }
        // Cách vòng lặp for hoạt động
        // B1 : Khởi tạo biến lặp -> câu lệnh này chỉ chạy 1 lần duy nhất
        // B2: Sau đó là kiểm tra điều kiện lặp
        // B2.1: Nếu điều kiện còn đúng thì thực hiện khối lệnh, sau đó là cập nhật biến lặp rồi quay lại B2
        //      Nếu sai thì dừng và thi các câu lệnh nối tiếp sau vòng lặp
        // Phạm vi của biến lặp/ hoặc phạm vi của các biến trong khối lệnh lặp của vòng lăp for chỉ có phạm vi
        // trong vòng lặp
        // # Vòng lặp while: Là vòng lặp với số lần không biết trước (Không tính tính được số lần lặp )
        // Cấu trúc :
        /*
            <Khai báo biến lặp> -> có thể có hoặc không
            while ( Điều kiện lặp )
            {
                <Khối lệnh>
                <Cập nhật biến lặp>
            }
        * */
        // Ví dụ bắt đầu với một số tiền nhất định
        // Mỗi ngày sẽ tiêu ngẫu nhiên một số tiền và in ra số tiền còn lại
        // Khi số tiền bé hơn hoặc bằng không thì không được tiêu và không in ra số tiền còn lại
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số tiền lúc bắt đầu: ");
//        int money = scanner.nextInt();
//        while (money > 0) {
//            int soTienTieuRandom = (int) Math.ceil((Math.random() * money));
//            System.out.println("Số tiền tiêu " + soTienTieuRandom);
//            System.out.println("Số tiền còn lại " + (money - soTienTieuRandom));
//            money -= soTienTieuRandom;
//        }
        // Cách vòng lặp while tương tự như vòng lặp for
        // Điểm khác biến lặp có phạm vi ngoài vòng lặp
        // Vòng lặp do while
        // Vòng lặp luôn thực hiện ít nhất một lần
        // Bài toán là chọn số may mắn
        // Đầu cho một số may mắn trước
        // Người chơi sẽ được  chọn một số trước
        // Nếu không đúng thì được chọn tiếp cho tới khi đoán được
        // CẤu trúc
        /*
            do {
                <Khối lệnh lặp>
            } while(<Điều kiện lặp>);
        * */
        int soMayMan = (int) (Math.random() * 10);
        int soLuaChon;
        do {
            soLuaChon = (int) (Math.random() * 10);
            System.out.println("Số người chơi chọn " + soLuaChon);
            System.out.println("Số may mắn là " + soMayMan);
        } while (soLuaChon != soMayMan);

        // Cách hoạt động thì đầu tiên là thực khối lệnh lặp 1 lần rồi mới kiểm tra điều kiện
        // Nếu điều kiện vẫn đúng thì cứ tiếp tục thực hiện khối lệnh lặp
    }
    // Cho ví dụ viết một hàm in ra diện tích của hình tròn có bán kính là số nguyên
    public static void dienTichHinhTron(int r){
        double dienTich = r*r*Math.PI;
        System.out.println(dienTich);
    }
}

/*
    class Math {
        public static double PI = 3.1455464;
        public static double round(int number){
            //
        }
     }
*/
