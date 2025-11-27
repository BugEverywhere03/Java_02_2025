package com.nguyenduyduong.buoi8;

import java.sql.Array;
import java.util.Arrays;

public class Buoi8 {
    public static void main(String[] args) {
        // Các phương thức thường dùng trong String
        // Đầu tiên là index trong String
        // Thì trong Java thì mỗi tự trong một String thì đều có một chỉ sổ
        // Thông qua chỉ số đó thì ta có thể truy xuất được ký tự vị trí đó
        // ví dụ:
        String str = "abc";
        System.out.println(str);
        // Index của các ký tự bắt đầu từ 0
        // Ký tự đầu tiên có index là 0, các index tiếp theo thì có chỉ số tăng lần lượt theo
        // Phương thức charAt
        // Lấy ký tự tại index là i
        System.out.println(str.charAt(0));
        // Tiếp theo phương thức length
        // Trả về độ dài/ số ký tự trong String
        System.out.println(str.length());
        // Phương thức indexOf
        // Trả về vị trí đầu tiên mà chuỗi con liên tiếp xuất hiện trong chuỗi hiện tại(chuỗi cha)
        // Nếu mà không xuất hiện thì trả về -1
        // Chuỗi con liên tiếp là chuỗi mà có các ký liên tiếp là một phần hoặc toàn bộ chuỗi cha
        String stringParent = "abcdef";
        // d ở index 3
        String stringChild = "def";
        int index = stringParent.indexOf(stringChild);
        System.out.println(index);
        int index2 = stringParent.indexOf(stringChild, 4);
        System.out.println(index2);
        // Phương thức subString
        // Phương thức trả về một chuỗi con từ chuỗi cha
        String subStringFromParent = "adfk".substring(1);
        System.out.println(subStringFromParent);
        String subString2 = "0123456".substring(1, 3);
        // Sẽ lấy chuỗi con từ vị trí bắt đầu đến trí kết thúc - 1
        System.out.println(subString2);
        //  CharSequence subString3 = "0123456".subSequence(0, 6);
        // Phương thức replace
        // Phương thức thay thế một ký tự trong chuỗi thành một kú tự khác và trả về một string mới
        String newStr = "ab_d".replace('_', 'c');
        System.out.println(newStr);
        // Phương thức trim
        // Nếu String tồn tại các khoảng trắng ở đầu và cuối chuỗi
        // Thì phương thức này sẽ loại bỏ tất cả khoảng trắng ở đầu và cuối chuỗi
        String  spaceStr = "     1234     ";
        System.out.println(spaceStr);
        System.out.println(spaceStr.trim());
        // Phương thức split
        // Dùng để tách các String thành mảng String (Một cấu trúc quản lí được nhiều String)
        // Phương này sẽ tác các String bởi dấu ngăn cách giữa các String
        String exampleStr = "abc.def.ikl";
        String[] listStrs = exampleStr.split("\\.");
        for (String s:listStrs){
            System.out.println(s);
        }
        // Bản thân các kiểu dữ liệu tham chiếu thì không thể so sánh gía trị bằng bằng
        // vì bản thân các biến giữ địa chỉ chứ không phải giá trị thức như kiểu nguyên thủy
        // Phương thức equals trong String
        // Trả về true/false tùy vào việc 2 String có giống nhau về giá trị không
        String str10 = "abc";
        String str11 = "abcd";
        System.out.println(str10 == str11);
        System.out.println(str10.equals(str11));
        // Contains
        // Cũng trả về giá trị true/false nếu chuỗi 2 năm trong chuỗi 1
        System.out.println(str11.contains(str10));
        /* ------------------------------------------- */
        // Mảng
        // Mảng là một cấu trúc giúp lưu trữ các biến có cũng kiểu dữ liệu lại với nhau
        // Mảng là môt cũng là kiểu dữ liệu tham chiếu -> Tức là mảng là một đối tượng
        // Cú pháp khai báo một mảng
        // <Kiểu dữ liệu của các biến trong mảng>[] <Tên Mảng > = {Các biến };
        String[] friends = {"Quốc", "Huy", "Nam"};
        // Các phần tử trong mảng đều phải thuộc kiểu dữ liệu của array(Mảng)
        // Các khai báo khác
        // ví dụ
        int[] numbers = new int[5];
        System.out.println("Giá trị phần tử có index 0 trong mảng numbers là " + numbers[0]);
        numbers[0] = 10;
        System.out.println("Giá trị phần tử có index 0 trong mảng numbers là " + numbers[0]);
        // Mảng cũng giống String thì trong mảng cũng có index
        // Mỗi index ứng với một phần tử trong mảng
        // Index bắt đầu từ 0
        // Khác với String thì ở mảng có thể trực tiếp thao tác trên các phần tử của mảng (Thay đổi các phần tử một cách
        // trực tiếp
        // Các truy cập vào phân tử ở trong mảng
        // Cú pháp
        // <Tên mảng>[<index>]
        System.out.println(friends[0]);
        friends[0] = "Long";
        System.out.println(friends[0]);
        // Thuộc tính quan trong trong mảng
        // Trong mảng thì có thuộc tính length trả về kích thước (số phân tử trong mảng)
        System.out.println(friends.length);
        // Muốn truy cập thuộc tính của đối tượng
        // <Tên đối tượng>.<Tên thuộc tính>
        // Note: Dành cho cả String với Mảng là khi mà truy cập index nằm ngoài index cho phép
        // Báo lỗi hay là một ngoại lẹ (String/Array) + IndexOutOfBoundsException
        //System.out.println(friends[4]);
        // Vòng lặp for-each
        // Vòng lặp này thường được dùng ở trên mảng để lặp qua qua các phần tử trong cấu trúc dữ liệu
        // Cú pháp
        /* for (<Kiểu của phần tử> <Biến đại diện> : <Danh sách/mảng>){
                <Khối lệnh>;
            }
        * */
        String[] friends1 = {"Quốc", "Huy", "Nam"};
        for (String friend : friends1) {
            System.out.println(friend);
        }
    }
}
