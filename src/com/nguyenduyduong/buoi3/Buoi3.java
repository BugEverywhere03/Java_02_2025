package com.nguyenduyduong.buoi3;

public class Buoi3 {
    public static void main(String[] args) {
        // Trong Java thì có 3 loại toán tử là
        // Toán tử số học: +, -, *, /, %
        // Toán tử so sánh
        // Toán tử logic
        // 1 Toán tử số học: Giúp thao với các kiểu dữ liệu
        // Toán tử +:
        // Trong Java toán tử cộng trên số
        // Ví dụ cộng 2 số nguyên
        int tong2So = 2 + 5;
        System.out.println(tong2So);
        double tong2SoThuc = 2.5 + 7.5;
        System.out.println(tong2SoThuc);
        // Kiểu dữ liệu chuỗi trong Java
        // Hôm trước học về kiểu ký  tự (char) thì sử dụng '' và kiểu ký tự chỉ chứa được 1 ký tự
        // Trong java kiểu String sinh ra để cho phép ta có kiểu dữ liệu có thể chứa được nhiều ký đó là String
        // Cách sử dụng String thì  các ký tự phải được sử dụng trong " "
        // Ví dụ khai báo 1 String
        // String là kiểu dữ liệu tham chiếu ( kiểu dữ liệu là đối tượng và địa chỉ)
        String chuoiViDu = "Chuỗi ví dụ";
        System.out.println(chuoiViDu);
        // Trong Java cho phép sử dụng toán tử + lên kiểu String
        // Khi ta sử dụng toán tử cộng lên 2 String thực chất là ta đang nối chuỗi lại với nhau
        String str1 = "abc";
        String str2 = "def";
        String str3 =  str2 + str1;
        System.out.println(str3);
        // Toán tử trừ
        // Trừ hai số nguyên
        int hieu2So = 6 - 7;
        System.out.println(hieu2So);
        // Toán tử nhân *
        double tich2So = 5.3 * 2.8;
        System.out.println(tich2So);
        // Chia 2 số
        // Phép chi lấy phân nguyên
        // Sử dụng toán tử /
        int chiaLayNguyen  = 8 / 3;
        System.out.println(chiaLayNguyen);
        // Chia lấy dư
        // Sử dụng toán %
        int chiaLayDu = 10 % 3;
        System.out.println(chiaLayDu);
        // Toán tử so sánh
        // Bao gồm các toán tử là == , != , < , > , <= , >=
        // Các toán tử so sánh thì cho ra kết quả kiểu boolean true/false
        // Toán tử so sánh bằng :
        // Khi so sánh các giá trị thuộc kiểu dữ liệu nguyên thủy
        // Việc sử dụng dấu == là so sánh mặt giá trị
        System.out.println( 5 == 5);
        // Khi so sánh với kiểu dữ liệu tham chiếu hay ( Hay kiểu đối tượng)
        // Thì việc sử dụng toán tử == là so sánh mặt địa chỉ của đối tượng
        String str4 = "abc";
        String str5 = new String("abc");
        System.out.println(str4 == str5);
        // Toán tử khác
        // Kiểu nguyên thủy thì so sánh giá trị / kiểu dữ liệu đối tượng thì so sánh địa chỉ
        double so1 = 5.0;
        double so2 = 5.0;
        System.out.println(so1 != so2);
        // So sánh trên 2 đối tượng
        System.out.println(str4 != str5);
        // toán <, > , <= , >=
        System.out.println(2 < 3); // true
        System.out.println(3 > 4);// false
        System.out.println(4 <= 4); // true
        System.out.println(5 >= 3 ); // true
        // Toán tử logic
        // Toán tử logic thì bào gồm các toán tử sau: && , || , !
        // Toán tử logic để thực hiện các phép logic trên các giá trị logic (true/false)
        // Đầu tiên là toán tử && ( Toán tử và )
        // Kết hợp từ 2 gía trị logic trở lên -> trả về về gía trị đúng nếu tất cả các giá trị đều dúng
        // Ngược lại thì tồn 1 giá trị sai thì trả về giá trị sai
        // Phép và tìm giá trị đầu tiên là false dừng điều kiện lại
        System.out.println((2 < 3 )  && (3 > 4) && (3 <=3));
        // Khi mình viết chương trình thì có thể áp dụng tính chất này để hạn chế lỗi
        // Cơ chế này gọi ngắn mạch
        // Note
        // Tiếp theo toán ||
        // Trả về giá trị đúng đầu tiên
        // Chỉ cần 2 giá trị đúng trong tất cả các điều kiện thì trả về luôn
        System.out.println( (2 > 3) || (3 < 4) || (3 <= 3));
        // Toán tư ! (phủ định/ not)
        // Khi sử dụng toán tử not trên giá trị true -> false
        // Khi sử dụng toán tử not trên giá trị false-> true
        System.out.println(!(2 == 2));
        System.out.println(!false);
        // Tiền tố và hậu tố
        // Được sử dụng với biến thuộc kiểu dữ liệu là số
        // Tiền tố ++/-- với biến
        // Khai báo 1 biến int
        // Tăng gía trị của biến lên 1 đơn vị / giảm đi 1 đơn vị
        // Cách java thực hiện là tăng giá trị của biến lên sau đó là gán lại lại giá trị cho biến
        // Khi thực phép gán thì vế phải thực xong có giá rồi mới gán cho về trái
        int a = 2 ;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // Hậu tố ++/--
        // Nhưng sử dụng phía sau cảu biến
        // Cách Java thực hiện hậu tố
        // Tạo bản sao giá trị của biến , tăng biến lên , trả về giá trị bản sao của biến
        // Tạo ra trong bộ nhớ giá trị temp = 5 giá trị của biến c =  5
        // Tăng giá trị biến c lên thành 6
        // Trả về giá trị sao bản sao
        int c = 5;
        int d = c++;
        int e =  c;
        System.out.println(d);
        System.out.println(e);
        // Toán tử rút gọn
        // Bao gồm các toán tủ += , -= , *=, /=, %=
        // a  = a + b => a += b
        ///
        int soTest = 10;
        soTest += 10;
        System.out.println(soTest); // 20
        soTest -= 5;
        System.out.println(soTest); // 15
        soTest *= 2;
        System.out.println(soTest); // 30
        soTest /= 3;
        System.out.println(soTest); // 10
        soTest %= 5;
        System.out.println(soTest);// 0
    }
}
