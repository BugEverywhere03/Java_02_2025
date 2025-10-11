package com.nguyenduyduong.buoi2;

public class Buoi2 {
    public static void main(String[] args) {
        // System.out.println
        // Để in màn hình console một văn bản/ giá trị số
        // Sau khi in ra thì tự chèn dòng mới (Xuống dòng mới)
//        System.out.println("Helo World");
//        System.out.println(2);
        // System.out.print
        // Cũng để in ra màn hình console nhưng sau khi in ra thì không xuống dòng mới
        /*
        System.out.print("Dòng 1");
        System.out.println("Dòng 2");
        */
        // Biến trong java
        // Biến là thành phần nhỏ nhất để mà lưu trữ giá trị
        // Mục đích sử dụng biến là tái sử dụng và giúp viết mã nhanh hơn
        // Cách khai báo biến
        // <Kiểu dũ liệu> <Tên biến>;
        int number;
        // Khai báo và khởi tạo giá trị cho biến
        int numberTwo = 2;
        System.out.println(numberTwo);
        // Quy tắc đặt tên biến
        // Coding convention: Tiêu chuẩn biết mã mà lập trình viên Java nên tuân thủ
        // Quy tắc mình đặt tên:
        // Đặt tên biến theo quy tắc camel case
        // Từ đầu tiên thì mình viết hường tất cả kể từ thứ thì viết hoa viết hoa chữ cái đầu cảu từ
        String myName = "Nguyễn Duy Dương";
        // Biến được chứa các ký tự chữ cái, số, dấu gạch dưới
        int number3 = 3;
        int number_3 = 4;
        // Những ký tự đặc biêt: !@, khoảng trăng
        // Tên biến không được bắt đầu bằng số
        // Trong Java thì chia thành 2 kiểu dữ liệu
        // Kiểu dữ liệu nguyên thủy ( primitive types ) và Kiểu dữ liệu tham chiếu (Reference types)
        // Kiểu dữ nguyên thủy là các kiểu dữ liệu là số , lý tự, giá trị true/false
        // Kiểu dữ liệu nguyên thủy thì được lưu trữ trên stack
        // bộ nhớ của một chương trình java chia làm 2 phần là vùng nhớ stack và vùng nhớ heap
        // Các kiểu dữ liệu trong kiểu dữ liệu nguyên thủy
        // bit đâu cảu kiểu dữ liệu số thì dùng để xác định dấu của số đó

        byte byteDataType = 127;
        short shortDataType = 5000;
        int intDataTypes = 1000000000;
        System.out.println(byteDataType);
        System.out.println(shortDataType);
        System.out.println(intDataTypes);
        long longDataTypes = 100000000000L;
        // Khi sử dụng thì mình phải thêm ký tự L/l để Java nhận diện đây kiểu dũ liệu thuộc kiểu long
        System.out.println(longDataTypes);
        // Kiểu dữ liệu số thực
        // Kiểu float
        // Khi mà sử dụng kiểu float thì  phải thêm F/f ở cuối
        float floatNumber = 1.2222222f;
        System.out.println(floatNumber);
        double doubleNumber = 3.14554345345435354354;
        System.out.println(doubleNumber);
        // Kiểu dữ liệu ký tự
        // Ký tự phải nằm trong dấu nháy đơn
        char characterDataType = '!';
        System.out.println(characterDataType);
        // Kiểu giá đúng sai
        boolean booleanDataType = false;
        System.out.println(booleanDataType);
    }
}
