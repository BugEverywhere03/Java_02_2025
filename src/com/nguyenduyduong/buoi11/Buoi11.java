package com.nguyenduyduong.buoi11;

import java.util.*;

public class Buoi11 {
    public static void main(String[] args) {
        // Access modifier (Công cụ sửa đổi truy cập)
        // Java thì access modifier quy định cách một lớp có thể truy cập vào một lớp khác, các thuộc tính
        // phương thức trong lớp đó
        // Access modifier có thể được áp dụng cho lớp, nested class, constructor, thuộc tính, phương thức
        // Có 4 mức độ access modifier
        /*
            + Private
            + Public
            + Protected
            + default (Package)
            Thì 4 từ khóa sửa đổi truy cập này áp dụng cho tất cả lớp, wrapper class, constructor, thuộc tính
            phương thức
            Lưu ý: Private và protected không sử dụng được cho class

        * */
        // # Private (Riêng tư):
        /* Thì khi sử dụng private thì các thành phần của class chỉ được truy cập bởi mã ở bên trong lớp đó.
            Mọi lớp bên ngoài không thể truy cập vào các thành phần bên trong class
            Ví dụ:
            Cho lớp student : Có các thuộc tính là: mã sinh viên, tên và hành vi: hiển thị thông tin
            Cho lớp Teacher sử dụng lớp sinh viên
            Accesstor (Phương thức getter và setter của lớp): là các phương thức được cung cấp để thao tác với
            các thuộc tính của lớp (thường được khai báo là private) khi ở bên ngoài lớp
            Đối với getter (Lấy giá trị) -> Là phương thức trả về kiểu của thuộc tính đó của đối tượng
            Đối với các phương thức getter thì tên thường là get+<Thuộc tính>
            Đối với setter (Thay đổi giá trị thuộc tính của đối tượng đó) -> Là phương thức void
            Đối với setter thì tên thường là set + <Thuộc tính của đối tượng>
            Phương thức setter cần có tham số là giá trị mà muốn thay đổi cho thuộc tính đó
        * */
        // Public
        // Phạm vi truy cập vào thuộc tính, constructor, nested class, phương thức thì mọi class đều có thể truy cập
        // từ bên ngoài class
        // Note: Trong lớp thì thường các thuộc tính được khai báo là private để đảm bảo tính chất đóng gói của lớp
        // Tiếp theo protected: Khi mà một thành phần ở của lớp được sử dụng protected thì nó chỉ có thể được truy cập
        // bởi các subclass (Lớp con)
        // Thì lớp con là lớp kế thừa thừa từ lớp hiện tại
        // Kế thừa là thừa hưởng lại toàn bộ những gì mà lớp cha có
        // Để kế thừa một class khác thì sử dụng từ khóa extends
        // default (Package-private)
        // Package (gói): Tập hợp các lớp có những chức năng liên quan đến nhau
        // Khi các thành phần của class được sử dụng default thì các class trong phạm vi cùng một package có
        // thể truy cập vào các thành phần của class đó
        // Đối với các class thuộc package khác thì không thể truy cập vào các thành phần này
    }
}
