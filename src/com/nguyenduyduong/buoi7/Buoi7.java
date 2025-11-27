package com.nguyenduyduong.buoi7;

public class Buoi7 {
    public static void main(String[] args) {
        // OOP basic và String
        // Trước tiên là class với object
        // Trong java thì class được định nghĩa một lớp
        // Lớp là được xem như một bản thiết kế cho các đổi tượng thuộc lớp đó
        // Lớp là tập hơp các đối tượng có chung một nhóm thuộc tính và hành vi nhất định
        // Tức là lớp định hình nên các thuộc tính và các hành vi cho đối tượng thuộc lớp đó
        // Đối tượng là các thể hiện của class hay nói cách khác là một một cái đối tượng thực có các
        // Thuộc tính và hành cụ thể tuân theo nhưng các định nghĩa trong class
        // Mỗi thuộc tính của đối lượng là khác nhau
        // Đầu tiên để khai báo 1 class thì dùng từ khóa
        // class <Tên Lớp>: Tên lớp trong Java luôn phải viết hoa chữ cái đầu
        // Lớp gồm 2 phần là các thuộc tính (biến instance)
        // Phương thức/ hành vi đối tượng
        // Cách hơi tạo một đối tượng cho lớp
        // Thì dùng từ khóa new <Hàm khởi tạo>
        // Hàm khởi tạo là hàm có cùng tên với lớp và không có kiểu trả về
        // Hàm khởi tạo thì có 2 loại
        // + Hàm có tham số
        // + Hàm không có tham số
        // Hàm khởi tạo có nhiệm vụ là tạo ra đối tượng(instance) cho lớp đó
        // Trong java thì khi mà không khai báo hàm khởi tạo có tham số
        // Thì Java mặc định luôn cung cấp cho mỗi class một hàm khởi tạo không tham số
        // Còn nếu trong lớp có khai báo hàm khởi tạo không tham số thì mà muốn sử dụng hàm khởi tạo có tham số
        // Thì bắt buộc phải khai báo thêm
        // Cách định đinh nghĩa các thuộc tính(biến instance)trong class cũng giống như cách định nghĩa biến
        // Nhưng mà có thêm các phần về access modify (Phạm phi truy cập -> liên quan tới các từ khóa public/private)
        // Ví dụ khai báo thuộc tính name cho class Human
        // public String name;
        // Các biến instance hay các biến thuộc tính thi khai báo trong phạm vi class nhưng mà không được năm trong hàm
        // Các khai báo các hàm trong class thì tương tự như các định nghĩa hàm
        // Trong java thì lớp lớn nhất là lớp Object
        // Tức là nó là cha của mọi lớp
        // Hàm super trong các constructor(hàm khởi tạo) chính là hàm khởi tạo của lớp Object
        // Từ khóa this trong hàm khởi tạo có tham số là đại diện cho đối tượng được khởi tạo
        // Khi mà sử dụng hàm khởi tạo có tham số thì Java tạo đối tượng trước
        // Sau đó mới khởi tạo thuộc tính cho đối tượng
        // Cú pháp khởi tạo đối tượng
        // <Tên lớp> <Tên biến đối tượng> = new <Hàm khởi tạo của lớp>;
        // Cách truy cập vào các thuộc tính trong các phương thức của lớp khi đang ở trong lớp
        // Dùng this.<Tên thuộc tính>
        // Các truy cập các phương thức của lớp
        // Nếu phương thức là phương thức static thì không cần phải khởi tạo đối tượng chỉ cần dùng
        // <Tên lớp>.<Tên phương thức>
        // Nếu hàm là hàm non static thì phải khởi tạo đối rồi dùng với cú pháp
        // <Tên biến đối tượng>.<Phương thức>
        // Khi mà khởi tạo đối tượng thì
        // Trong chương trình java. Khi chương trình chạy thì process( tiến trình ) được cấp vùng nhớ ở trong ram của máy tính
        // Thì JVM quản lí vùng nhớ chịu trách thu hồi rác (Các đối tượng không còn dùng trong chương trình)
        // Thì JVM chia vùng nhớ được hệ điều hành cấp thành 2 vùng nhớ:
        // Vùng nhớ stack (Ngăn xếp) : Vùng nhớ này có nhiệm vụ là lưu trữ các biến nguyên thủy và
        // các biến tham chiếu ( Biến giữ địa chỉ của của đối tượng)
        // Vùng nhớ Heap (Là nơi lưu trữ các đối tượng) tức là khi mà dùng từ khóa new + hàm constructor để khởi tạo đối tượng
        // Thì một đối tượng sẽ được tạo ra trong vùng nhớ heap của chương trình (mà đối tượng này nằm trên một ô nhớ trong ram )
        // Đối tượng này có 1 địa chỉ => Biến giữ đối tượng này chứa địa chỉ
        // String
        // String là một chuỗi văn bản trong Java, cho phép lưu trữ được nhiều ký tự
        // String là kiểu dữ liệu tham chiếu hay nói cách khác là String là một lớp và các chuỗi chính là các đối tượng của lớp này
        // Các khởi tạo String
        // Có 2 cách
        // Cách khởi tạo bằng dấu ""
        // Cú pháp:
        // String <Tên biến tham chiếu đến chuỗi> = "<Gía trị của chuỗi>";
        // ví dụ: Khai báo 1 String tên là Việt Nam
        String chuoiTenNuoc = "Việt Nam";
        System.out.println(chuoiTenNuoc);
        // Cách khởi tọa bằng từ khóa new
        // cú pháp
        // String <Tên biến tham chiếu> = new String("abc");
        // Ví dụ khai báo một String là Thành phố Huế
        String myHometown = new String("Thành phố Huế");
        System.out.println(myHometown);
        // Các phương thức của lớp String
        // Phương thức length: Đưa ra giá trị đồ dài của chuỗi (Số ký tự ở trong chuỗi);
        System.out.println(myHometown.length());
        // Tính chất của String
        // String trong Java là bất biến
        // Bất biến ở đây được hiểu là khi mà ta tạo ra một String
        // Rồi ta thực hiện các toán tử hay thay đổi gía trị String này thì thực chất là đang tạo ra một String mới
        // String khi được khởi tạo thì giá trị của chuỗi không thể bị thay đổi
        // Ví dụ: Tạo String "abc"
        // Sau đó + với chuỗi "def"
        String str1 = "abc";
        System.out.println(System.identityHashCode(str1));
        str1 += "def";
        System.out.println(System.identityHashCode(str1));
        // Lý do cho việc này chính là Java có một cơ chế gọi là String pool
        // String pool (Hồ String) các String được Java tạo ra để trách tọa dư thừa các chuỗi giống nhau và tái dụng chuỗi
        // String pool vùng nhớ nằm heap có mục đích chứa tất cả các đối tượng String mà được tạo trong lúc chương trình
        // thực thi
        // Cơ chế khi java tạo một đối tượng String mới bằng cách sử dụng cặp dấu ""
        // Đầu tiên Java vào String pool để kiểm tra xem giá trị của đối tượng cần được khởi tạo đã tồn tại chưa
        // Nếu chưa thì tạo đối tượng mới trong String pool
        // Nếu tồn tại thì trả tham chiếu (địa chỉ) của đối tượng String cần tạo
        // Ví dụ:
        String str2 = "Java";
        String str3 = "Java";
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        // Mình mà thay đổi biến str2 thành abcdef
        // Note: Có một ngoại lệ
        // Khi sử dụng từ khóa new String thì Java bỏ qua kiểm tra trong String pool mà tạo đối tượng ở ngoài vùng nhớ heap
        String str4 = new String("Java");
        System.out.println(System.identityHashCode(str4));
    }
}
