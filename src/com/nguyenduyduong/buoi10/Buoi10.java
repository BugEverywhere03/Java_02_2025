package com.nguyenduyduong.buoi10;

public class Buoi10 {
    public static void main(String[] args) {
        // OOP
        /* Đối tượng : thì một thực thể ngoài thế giới thực mà có các thuộc tính và hành vi(hành động)
          Tập hợp các đối tượng mà có cùng các thuộc tính và hành thì thì được gọi chung là một lớp
          Hay là một class
          Vì vậy class được xem là bản thiết kế cho đối tượng
          Sở dĩ nói vậy là vì class là nơi quy định các thuộc tình và hành vi/phương thức của các đối
          tượng trong lớp đó
          Một class thì có thể có nhiều đối tượng khác nhau
          Vì mỗi đối tượng sẽ có thuộc tính/đặc điểm  biểu diễn cho thuộc tính đó khác nhau
          Ví dụ:
          An và Bình thuộc lớp Nam Giói
          An cao 1m50
          Bình cao 1m65
          -> An và Bình 2 đối tượng khác nhau của lớp Nam Giới
          -> Nhưng mà thuộc tính chiều cao của 2 đối tượng này là khác nhau
          Một đối tượng được tạo của class cũng được là 1 instance ( tức là một thể hiển cho các thuộc tính)

          Cách khai báo class
          <access modify> class <Tên class> { }
          Ví dụ khai báo class Car
          public/private class Car {
          }
          2 thành phần quan trọng nhất trong 1 class là thuộc tính và phương thức/hành vi
          Thuộc tính là các đặc điểm thuộc về đối tượng đó
          -> Trong Java thì thuộc tính được quy định trong lớp thì mọi đối tượng của lớp đó sẽ có thuộc tính đó
          Thuộc tính trong lớp được xem như là một biến (biến thể hiện)
          Khai báo thuộc tính trong lớp
          Cú pháp:
          <access modify/phạm vi hiển thị đối với gói hoặc class khác> <Kiểu dữ liệu> <Tên thuộc tính>;
          #Note: Đa số trường hợp là khi khai báo thuộc tính của đối tượng thì thường không khởi tạo giá trị
          Ví dụ: Cho lớp Phone có thuộc tính Đang Bật;
          Thì ta khai báo:
          public class Phone {
                private boolean isOn;
          }
          Phương thức trong lớp:
          Thì phương thức trong lớp là các hành vi thuộc về đối tượng
          Vi dụ:
          Điện thoại có các hành vi: Báo thức, Hẹn Giờ, Phát Nhạc, ...
          Phương thức trong class thực chất là một hàm thực hiện hành vi cụ thể nào đó của đội tượng
          Cách khai báo một phương thức
          <access modify> <Kiểu trả về của hàm> <Tên phương thức> (<Danh sách tham số>){
                <Khối lệnh của phương thức/hàm>;
          }
          Ví dụ: Khai báo phương thức listenMusic cho lớp Phone
           public class Phone {
                private boolean isOn;
                public void listenMusic(){
                    System.out.println("Phát nhạc cho người dùng nghe")'
                }
          }
          Cách để tạo đối tượng cho class
          Thì tạo đối tượng cho class thông qua từ khóa và constructor
          Cú pháp:
          <Tên lớp> <Tên biến tham chiếu> = new <Tên hàm constructor>();
          Từ khóa new khi kết hợp cùng với constructor của 1 class thì sẽ khởi tạo ra một đối tượng mới
          cho class đó
          Tìm hiểu về constructor
          Khái niệm: Hàm constructor là hàm khởi tạo của lớp. Hàm này có nhiệm vụ tạo ra đối tượng thuộc vè
          lớp chức constructor đó
          Đặc điểm:
            + Hàm constructor có cùng tên với tên của class của nó
            + Hàm không có kiểu trả về
            + Hàm constructor có thể có tham số hoặc không có tham số
          Các khai báo hàm khởi tạo
          <access modify> <Tên Lớp>(<Tham số/Không có tham số>)
          Ví dụ: Tạo hai hàm khởi tọa cho lớp  Phone
          #Note: Tên Class luôn phải viết hoa chữ cái đầu tiền và
          tên class phải cùng tên với file chứa class đó
          #Note: Đa số các trường hợp thì hàm khởi tạo đều được khai báo là public
          public class Phone {
               private boolean isOn;
               public Phone(){
                    this.super();
               }
               public Phone(boolean isOn) {
                    this.phone = isOn;
               }
          }
         Java cung cấp mặc định một hàm khởi tạo không tham số khi ta định nghĩa hàm
         Nếu trong class có khai báo hàm khởi tạo có tham số thì
         nếu không khai báo hàm khởi tạo không tham só thì không dùng được -> nếu dùng thì phải khai báo
         Ví dụ
         Tìm hiều về cách truy cập các thuộc tính trong và phương thức trong lớp
         Cách truy cập hoặc là sử dụng các thuộc tính trong lớp
         Cách thuộc tính có thể được truy cập thông qua tên hoặc là từ khóa this.<tên thuộc tính> của thuộc tính đó trong các hàm
         Ví dụ:
         Các thuộc tính thì được truy cập ở bất cứ đâu trong class
         // Các các phương thức được truy cập
         Thì tương tự ta có thể dùng gọi tên hàm hoặc sử dụng this.<Tên hàm/tên phương thức> để sử dụng
         phương thức đó trong class
         Cách sử dụng đối tượng để truy cập vào thuộc tính hoặc phương thức của đối tượng có access modify là public
         nếu truy cập từ bên ngoài lớp
         Đối với thuộc tính
         <Tên đối tượng>.<Tên thuộc tính>
         Đối với thuộc tính
         <Tên đối tượng>.<Tên phương thức>()
         Từ khóa This được sử dụng để thay thế đối tương hiện tại trong phương thức của lớp
         Tức this -> từ khóa mà chấm đến phương thức đó
         @Thuộc tính static và phương thức static trong lớp
         Biến static được định nghĩa là một biến thuộc về lớp -> Tức là các đối tượng chia sẻ chung
         cái thuộc tính này -> Thuộc tính này đối với mọi đối tượng đều giống
         Thuôc tính static thì nên gán gía trị khi mà khởi tạo
         Vì vậy khi mà một đối tượng thay đổi thuộc tính static thì thuộc tính này bị thay đổi và anh hưởng đến tất cả
         các đối tượng khác
         Phương thức static gọi là phương thức lớp
         Thì phương thức static thì chỉ gọi được các phương thức static và sử dụng được các biến static
         Lý do:
         Thì cả biến static và phương thức static đều được truy cập bên ngoài lớp thông qua tên lớp thay
         vì phải khởi tạo đối tượng ->
         #Note: trong phương thức static thì từ khóa this không dùng đươc -> Tại vì this đại điện cho đối tượng
         Còn phương thức static thì đại diện là hàm nên không sử dụng được
         -> Phương thức thuộc về lớp -> Thuộc về đối tượng -> Cũng có thể dùng đối tượng để truy cập phương thức đó
         */
    }
}
