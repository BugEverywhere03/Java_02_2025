package com.nguyenduyduong.buoi9;

import java.util.Arrays;

public class Buoi9 {
    public static void main(String[] args) {
        // Các thao tác trong Arrays, StringBuilder
        // Mảng là thực chất đối tượng của mảng java.utils.Arrays
        // Nên đối tượng sẽ có các phương thức để đối tượng thao tác
        // Phương thức copyOf
        // Gíup tạo một mảng mới có các phần tử giống với mảng cần copy
        int[] arrayToCopy = {1, 2, 3, 4, 5, 6};
        int[] arrayCopy;
        // Cách sử dụng phương thức copyOf
        // Phương thức copyOf là một phương thúc static của lớp Arrays
        // Phương thức này cần 2 tham số là mảng mục tiêu và độ dài muốn có của mảng copy
        // Trả về một mảng mới chứa các phần tử trong mảng mục tiêu
        arrayCopy = Arrays.copyOf(arrayToCopy, arrayToCopy.length);
        for (int number : arrayCopy) {
            System.out.println(number);
        }
        // Phương thức equals so giá tất cả các phần bên trong 2 mảng
        // Nếu mà tất cả phần tử ở 2 mảng là giống nhau thì trả  vể true ngược lại thì false
        System.out.println(Arrays.equals(arrayToCopy, arrayCopy));
        // So sánh 2 mảng từ trái sang phải
        // Nếu mà 2 mảng có chiều dài và có các phần tử con giống nhau thì trả về 0
        // Nếu 2 mảng giống nhau về các phần tử và có chiều khác nhau thì mảng có chiều dài nhỏ thì sẽ nhỏ hơn
        // Nếu hai mảng khác nhau thì vị trí nào thì so sánh 2 phần tử tại vị trí đó
        int[] array3 = {1, 2, 3, 8};
        System.out.println(Arrays.compare(array3, arrayToCopy));
        // Phương thức sort -> Sắp xếp một mảng theo chiều tăng dần
        // Truyền vào một đối số là một mảng
        int[] arrayToSort = {2, 1, 0, 3, 8, 5};
        Arrays.sort(arrayToSort);
        System.out.println("Mảng sau khi được sắp xếp: ");
        for (int number : arrayToSort) {
            System.out.print(number + "\t");
        }
        // Phương thức toString -> Chuyển mảng thành một chuỗi
        // Chuỗi in ra có dạng [<Các phần tử trong mảng ngăn cách nhau bởi dấu,>]
        String arrayToString = Arrays.toString(arrayToSort);
        System.out.println(arrayToString);
        // Phương thức fill -> Đặt một giá trị cho toàn bộ phần tử trong mảng
        // Phương thức này cần 2 đối số là mảng cần điền giá trị , giá trị cho toàn bộ mảng
        int[] arrayToFill = new int[10];
        Arrays.fill(arrayToFill, 111);
        for (int number : arrayToFill) {
            System.out.print(number + "\t");
        }
        System.out.println();
        // Mảng là kích thước sau khi khai báo là không thể được nữa
        // Độ dài bao nhiêu lúc khai báo thì mảng chỉ có thể chứa được bấy nhiêu phần tử mà không thể mở rộng ra
        // không thể chèn, xóa phần tử mà không gây ra sử thay đổi vị trí cho phần tử khác
        // Mảng 2 chiều
        // Thì là mảng có hàng và cột như một bảng
        // Mỗi hàng là mỗi mảng
        // Cách khai báo mảng 2 chiều
        // <Kiểu dữ liệu của mảng>[][] <Tên mảng> = new <Kiểu của mảng>[Số hàng][Số phần tử ở mỗi hàng]
        //int[][] mang2Chieu = new int[2][2];
        // Số phần tử trong mảng là bằng số hàng nhân với số phần tử trong mỗi hàng
        // Các truy cập vào một phần tử trong mảng hai chiều
        // Thì sử dụng index của hàng và cột trong mảng
        // index hàng và cột đều chạy từ 0 -> chiều dài hàng/cột - 1
        // 1 | 2
        // -----
        // 3 | 4
        int[][] mang2Chieu = {
                {1, 2},
                {3, 4}};
        mang2Chieu[0][0] = 1;
        mang2Chieu[0][1] = 2;
        mang2Chieu[1][0] = 3;
        mang2Chieu[1][1] = 4;
        // Cách lặp qua các phần tử trong mảng 2 chiều
//        for (int i = 0; i < mang2Chieu.length; i++) {
//            for (int j = 0; j < mang2Chieu[i].length; j++) {
//                System.out.print(mang2Chieu[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int[] array : mang2Chieu){
//            for (int number : array) {
//                System.out.print(number + "\t");
//            }
//            System.out.println();
//        }
        // StringBuilder là lớp cho phép thao tác trên chuỗi có thể thay đổi -> chèn, thêm ký tự, xóa, thay thế trực tiếp trên chuỗi
        // Cú pháp khai báo một StringBuilder
        // StringBuilder <Tên biến> = new StringBuilder(<Giá trị khởi tạo>);
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(System.identityHashCode(stringBuilder1));
        // Các phương thức thưởng dùng trong lớp này
        // Phương thức append -> Thêm chuỗi vào cuối chuỗi StringBuilder hiện tại
        StringBuilder temp = stringBuilder1.append("Hello");
        System.out.println(System.identityHashCode(temp));
        // toString -> Trả một String
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.toString());
        // Phương thức delete
        // Phương thức này là sẽ xóa chuỗi từ vị trí start -> end - 1
        stringBuilder1.delete(2, 4);
        System.out.println(stringBuilder1);
        // Phương thức insert -> Chèn một chuỗi vào StringBuilder hiện tại
        stringBuilder1.insert(1,  "123");
        System.out.println(stringBuilder1);
        // Phương thức replace -> Thay thế một ký tự/hoặc một chuỗi
        // Yêu truyền vị trí muốn thay thế
        // Tính từ start -> end - 1
        stringBuilder1.replace(1, 4, "abc");
        System.out.println(stringBuilder1);
    }
}
