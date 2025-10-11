package com.nguyenduyduong.buoi4;

public class Buoi4 {
    public static void main(String[] args) {
        // Các hàm trong class Math - Cấu trúc If, If-Else, Switch
        // Đầu tiên class Math là lớp cung cấp các hàm(phương thức/chức năng) liên quan đến toán học
        // Ví dụ hàm tính căn bậc 2, hàm lũy thừa, hàm random, min, max
        // Hàm trị tuyệt đối
        // Hàm trị tuyệt đối tên là abs
        // Khi mà truyền vào một số trả về trị tuyệt đối của theo kiểu dữ liệu của giá trị truyền vào đó
        // Cách dùng
        double triTuyetDoi = Math.abs(-8.5);
        int triTuyetDoi2 = Math.abs(5);
        System.out.println(triTuyetDoi);
        System.out.println(triTuyetDoi2);
        // Hàm làm tròn trên
        // Giả sử như số 3.5 khi làm tròn trên -> 4.0
        // Hàm làm tròn trên trong Java thì có tên ceil
        // Hàm này trả về cái số thực gần nhất lớn hơn số hiện tại được làm tròn
        // Cách dùng
        double lamTronTren = Math.ceil(8.0);
        System.out.println(lamTronTren);
        // Làm tròn dưới
        // Gỉa sử như là số 9.99 -> 9.0
        // Hàm làm tròn về số thực gần nhất mà bé hơn số hiện tại được làm tròn
        // Hàm này có tên là floor
        // Cách dùng
        double lamTronDuoi = Math.floor(9.99);
        System.out.println(lamTronDuoi);
        // Hàm max
        // Hàm này trả về giá trị lớn nhất trong 2 giá trị được truyền vào hàm
        // Cách dùng
        int giaTriLonHon = Math.max(5, 4);
        System.out.println(giaTriLonHon);
        // Hàm Min
        // Hàm này trả về cái trị nhỏ nhất trong 2 giá trị truyền vào hàm
        // Cách dùng
        double giaTriBeHon = Math.min(5.8, 5.2);
        System.out.println(giaTriBeHon);
        // Hàm làm tròn theo phần thập phân
        // Tức là phần thập phân >= 0.5 thì làm tròn lên số thực gần nhất
        // <0.5 thì làm tròn xuống số thực gần nhất
        // Ví dụ: 5.5 -> 6.0
        // 4.3 -> 4.0
        // Cách dùng
        double lamTron = Math.round(5.13);
        System.out.println(lamTron);
        // Hàm random
        // Sinh ra số thực ngẫu nhiên trong khoảng từ 0 -> 1.0
        // 0.01 -> 0.1
        // 0.1 -> 0.2
        //   ||
        // 0.9 -> 1.0
        // Cách dùng
        double soNgauNhien = Math.random();
        System.out.println(soNgauNhien);
        // Tiếp theo hàm pow
        // Hàm lũy thừa
        // Hàm trả giá trị thực là lũy thừa của một cơ sô với ố mũ được truyền vào
        double luyThuaCua2Mu3 = Math.pow(2, 3);
        System.out.println(luyThuaCua2Mu3);
        // Hàm lấy căn bậc hai (sqrt)
        // Hàm này cũng trả về giá trị thực là căn bậc hai của số truyền vào
        // Cách dùng
        double canBacHai = Math.sqrt(9);
        System.out.println(canBacHai);
        // --------------------------------------------------------------
        // Ngắn mạch trong Java
        // Ngắn mạch được áp dụng để ngắt các biểu thức điều kiện
        // Trong toán tử && Thì ngắn mạch sẽ kết thúc biểu thức khi mà gặp biểu thức sai đâu tiền
        // Trong toán tử || thì kết thúc khi gặp điều kiện đúng đầu tiên
        // Ngắn mạch chỉ áp dụng trên các giá trị boolean
        boolean nganMachVa = (2 < 3)  && ( 3 > 4) && (3 <= 3);
        System.out.println(nganMachVa);
        boolean nganMachHoac = (2 == 3) || (3 < 2) || (4 == 4);
        System.out.println(nganMachHoac);
        // Áp dụng ngan mach tranh các trường hợp sai
        // Gỉa sử cho bài toán người dùng nhập vào 2 số
        // Lấy giá trị của phép chia của số thứ nhất cho số thứ 2
        // So thư nhất lớn hơn  0
        int soThuNhat  = 10;
        int soThuHai = 0;
        if (soThuHai != 0 && soThuNhat > 0){
            System.out.println(soThuNhat / soThuHai);
        }
//        int result = soThuNhat / soThuHai;
//        System.out.println(result);
        // Ép kiểu dữ liệu
        // Mục đích của việc ép kiểu là đưa dữ liệu mà ta  thao tác về kiểu dữ liệu phù hợp với bài toán(Yêu cầu)
        // Trong java có các lọai ép kiểu
        // Ép kiểu từ kiểu dữ liệu có kích thước lớn hơn về kiểu nhở hơn (Ép kiểu thu hẹp)
        // Ép kiểu từ kiểu có kích thưóc nhỏ hơn thành kiểu lớn hơn (ép kiểu mở rộng)
        // Ép kiểu từ String về số và ngược lại (Ép kiểu khác)
        // Ép  kiểu thu hẹp
        // Ép kiểu thu hẹp bắt buộc phải chỉ định kiểu cụ thể mà muốn ép về
        double bienBiEpKieu = 3.123234242424244D;
        int epKieuThuHep = (int) bienBiEpKieu;
        System.out.println(epKieuThuHep);
        // Ép kiểu mở rộng
        // Thì kiểu ép kiểu mở rộng được Java tự thực hiện
        int number1 = 40;
        double numberDouble = number1;
        System.out.println(numberDouble);
        // Ép kiểu khác
        // Ép kiểu từ số về String
        // Trong lớp Sting thì cung cấp/có sẵn 1 chức năng/ hàm chuyển đổi một số về String
        // này có tên là valueOf
        // Cách sử dụng
        int soNguyen = 1999;
        String str = String.valueOf(soNguyen);
        System.out.println(str);
        System.out.println(String.valueOf(18.3));
        // Ép kiểu từ String sang số
        // Ép kiểu này cần lưu ý
        // Trong chuỗi cần chuyển thanh số thì không được chứa ký tự nào khác số
        // Giả sử chuỗi "12a4" -> khi chuyển kiểu thành số bị báo lỗi
        // Để chuyển đổi được thì bắt buộc phải sử dụng các lớp của các kiểu nguyên thủy
        // Gọi là wrapper class
        // int -> Integer
        // Long -> Long
        // double -> Double
        // float  -> Float
        // boolean -> Boolean
        // char -> Character
        // mỗi lớp wrapper class đều có hàm/chức năng có tên là parse
        String strNumber = "123456";
        strNumber += 876544;
        System.out.println(strNumber);
        long soString = Long.parseLong(strNumber);
        System.out.println(soString);
        soString += 876544;
        System.out.println(soString);//
        //
        String congChuoiVoiSo = "abc" + 123 + "def";
        System.out.println(congChuoiVoiSo);
    }
}
