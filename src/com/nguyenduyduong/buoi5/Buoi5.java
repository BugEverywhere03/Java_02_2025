package com.nguyenduyduong.buoi5;

import java.util.Scanner;

public class Buoi5 {
    public static void main(String[] args) {
        // If, If-else, Switch
        // 3 Cấu trúc này được gọi là cấu trúc rẽ nhánh
        // Cấu trúc rẽ nhánh là cấu trúc là thực hiện các khối lệnh khi dựa trên điều kiện đúng hoặc sai
        // Cấu trúc if
        // if (<Điều kiện>) {
        //      <Khối lệnh>;
        // }
        // Cấu trúc if được sử dụng để kiểm tra một điều kiện logic nếu đúng thì thực hiện các khối lệnh tương ứng
        // Điều kiện để vào trong khối lệnh if là biểu thức có giá trị đúng/sai
        // Giả sử: Đủ 18 tuổi thì pháp luật mới cho phép uông rựu bia
        int age = 19;
        // Nếu biến age >= 18 sẽ in ra "Bạn được uống rựu bia"
        if ( age >= 18 ) {
           System.out.println(age);
        }
        // Nếu ... đúng thì sẽ làm các hành động abcxyz
        // Cấu trúc if-else
        /* if (<Điều kiện) {
            // Khối lệnh tương ứng với điều kiện đúng
            <Khối lệnh>
           } else {
                // Khối lệnh tương ứng với điều kiện sai
                <Khối lệnh>;
            }
        */
        // Ý nghĩa: Nếu đúng thì làm ... nếu không thì làm ...
        // Giả sử đi học thể chất
        // Nếu điểm trung bình từ 4.0 trở lên thì được coi là đạt nếu không thì rớt
        double diemTrungBinh = 4.0;
        // Điểm điều kiện là điểm làm mốc để xét xem đạt hay không đạt
        double diemDieuKien = 4.0;
        if (diemTrungBinh >= diemDieuKien){
            System.out.println("Đạt");
        } else {
            System.out.println("Không đạt");
        }
        // Cấu trúc switch
        // Cấu trúc có cú pháp:
        /* switch (<Giá trị muốn so sánh>) {
            // Trong switch có thể có nhiều case
            case <Trường hợp/ Giá trị mặc định xảy ra >:
                <Khối lệnh>
                break;
            // Trường hợp mặc đinh nằm ngoài các trường hợp case
            default:
                <Khối lệnh>
                break;
        }
        */
        // Từ khóa break có nhiệm thoát hỏi vòng lặp/ cấu trúc switch
        // Khi các câu lệnh được viết ở dưới break trong một phạm vi (scope) thì sẽ không được thực hiện
        // Có thể hiểu switch-case là một dạng đặc biệt
        // Ở đây giá trị truyền vào không phải là điều kiện
        // Cấu trúc này hoạt động bằng cách là tra đi so sánh giá trị truyền với các case(trường hợp) biết trước
        // Cấu trúc này thường được dùng với khi ta cần so với với các giá trị biết trước
        // Giả sử : Bài toán yêu cầu là in ra giờ của giá trị h truyền vào switch
        // 0 -> 23
        // Biến hour là hiện tại
        // Số nguyên, String, char
//        Scanner scanner = new Scanner(System.in);
//        int hour = scanner.nextInt();
//        switch (hour){
//            case 10:
//                System.out.println("Bây giờ là 10 giờ");
//                break;
//            case 8:
//                System.out.println("Bây giờ là 8 giờ");
//                break;
//            default:
//                System.out.println("Giờ không hợp lệ");
//                break;
//        }
//        scanner.close();
        // Lớp Scanner là lớp giúp nhận đầu vào người dùng nhập từ cửa sổ console
        // Đầu tiền để sử dụng thì phải khởi tạo một đối tượng bằng cú pháp
        // Scanner <tên biến> =  new Scanner(System.in);
        // Khởi tạo một đối tượng Scanner
        Scanner userInput = new Scanner(System.in);
        // Đối tượng Scanner này cho cho phép nhập các giá trị như là số, Chuỗi, boolean
        // Tùy theo cách mà ta muốn nhận đầu vào
        // Nếu muốn nhận số nguyên
        // Dùng phương thức/ hàm của đối tượng scanner
//        System.out.print("Nhập số nguyên từ bàn phím: ");
//        int soNguyen = userInput.nextInt();
//        System.out.println("Số được người dùng nhập là: " + soNguyen);
        // Nhập số thực
//        System.out.print("Nhập số thực từ bàn phím: ");
//        double soThuc = userInput.nextDouble();
//        System.out.println("Số được người dùng nhập là: " + soThuc);
        // Nhập String
//        System.out.println("Nhập chuỗi từ bàn phím: ");
//        String chuoi = userInput.nextLine();
//        System.out.println("Chuỗi được nhập là" + " " + chuoi);
        // Nhập giá trị boolean
//        System.out.println("Nhâp giá trị boolean từ bàn phím ");
//        boolean giaTriLogic = userInput.nextBoolean();
//        System.out.println("Giả trị boolean được nhập là" + " " + giaTriLogic);
        // Function: Hàm
        // Chức năng của hàm là gom nhóm các câu lệnh được sử thường xuyên thành một cái khối lệnh để hạn chế
        // dư thừa lặp lại mã
        // Giả sử cần nhập nhiều và in ra nhiều giá trị ở nhiều nơi trong chương trình
        // Cấu trúc hàm:
        /* <Kiểu dữ liệu trả về> <Tên hàm>(<Các tham số>){
                <Khối lệnh>
           }
        * */
        // Hàm thực chất là một chương trình con ( các câu lệnh được gom nhóm lại với mục đích thực hiện một hành động)
        // Hàm chia làm 2 loại là hàm có trả về giá trị và hàm không trả về giá trị
        // Hàm có thể có hoặc không có tham số
        // Hàm có trả về về giá trị
        // Muốn đoạn chương trình để thực hiện ra random ra một số ngẫu nhiên trong đoạn từ 0 -> 100 và trả về số đó
        // Hàm có trả về giá trị bắt buộc phải sử dụng từ khóa return
        // Từ khóa return có nhiệm vụ trả về giá trị và thóat khỏi hàm ( tức các câu lệnh sau return trong hàm sẽ
        // khônng được thực thi)
        // Hàm chỉ thực các câu lệnh được định nghĩa trong hàm khi được gọi
        // Cú pháp gọi hàm
        // <Tên hàm>(Tham trị);
        // Hàm có trả về giá trị thì cần nơi để lưu trữ giá trị trả về => khởi tạo biến chứa giá trị trả về
        int random = randomNumber();
        System.out.println(random);
        // Hàm không trả về giá trị thì kiểu trả về là void
        displayMessage();
        // Tham số là tên của biến được sử dụng trong hàm
        // Giả sử việt một hàm cộng 2 số nguyên
        // Giá trị truyền cho biến trong hàm/tham số được gọi là tham trị
        // Tham số tên gọi của biến lúc khai báo hàm
        // Tham trị là giá trị truyền vào các tham số lúc gọi hàm
        // Các tham sô phải ngăn cách nhau bỏi dấu phẩy
        // Các khai báo các tham số
        // <Kiểu tham số> <Tên tham số>
        tong2So(10, 20);
    }

    public static int randomNumber(){
        // Bản thân random từ 0 -> 1.0
        // 0.00 -> 0,09 => 0 -> 9
        // 0.10 -> 0.19 => 10 -> 19
        //   ||
        // 0.90 -> 1.00 => 90 -> 100
        return (int) (Math.random() * 100);
    }
    public static void displayMessage(){
        System.out.println("Tôi yêu Việt Nam");
    }
    public static void tong2So(int number1, int number2){
        // Bản thân của number 1 và number 2 thực chất 2 biến
        // 2 biến này chỉ sử dụng được ở trong hàm có 2 tham số này
        // 2 biến này khi được truyền giá trị lúc hàm được gọi thì sẽ nhận giá trị đó
        // thì biến number1 = 10 và number2 = 20
        int tong = number1 + number2;
        System.out.println(tong);
    }
}
