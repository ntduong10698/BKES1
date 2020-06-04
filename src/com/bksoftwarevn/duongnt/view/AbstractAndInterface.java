package com.bksoftwarevn.duongnt.view;

//Quy định ghi đè

/**
 * + Ghi đề là khi phương thức lớp con phải cùng chữ ký với lớp cha.
 * + Không được phép ghi đè:
 *      - Các phương thức final trong lớp cha
 *      - Các phương thức static trong lớp cha
 *      - Các phương thức private trong lớp cha
 *      - Chỉ định quyền truy cập không được chặt hơn lớp cha
 */

//Tính trừ tượng

/**
 * + Tính trừu tượng là một tiến trình ẩn đi cài đặt chi tiết và chỉ hiện thị tính năng đến người dùng
 * + Có hai cách để đạt được sử trừu tượng trong java:
 *      - Sử dụng lớp abstract class
 *      - Sử dụng interface
 */

// Abstract (trừu tượng)

/**
 * + Một lớp được khai báo là abstract là lớp abstract. Lớp trừu tượng trong java có thể chứa các phương thức abstract và non abstract.
 * + Phương thức abstract: là một phương thức được khai báo là abstract và không được triển khai thì đó là phương thức trừu tượng
 *      - Cách định nghĩa:
 * + Phương thức non-abstract
 * + <truy cập> abstract <kiểu trả về> <tên phương thức>(danh sách ts); không có thân phương thức
 * + extends như class bình thường
 * + Lưu ý về lớp abstract
 *      - Không thể khởi tạo trực tiếp lớp abstract
 *      - Lớp con khi kế thừa phải cài đặt cụ thể cho các phương thức trừu tượng của lớp cha
 *      - Nếu một lớp chưa phương thức trừu tượng phải là trừu tượng.
 * + Nếu muốn một lớp chứa một phương thức cụ thể nhưng muốn triển khai phương thức đó quyết định ở lớp con, thì khai báo phương thức đó ở lớp cha.
 * + Ví dụ về lớp abstract
 *      -Tạo ra lớp abstract person có hàm action là abstract và hàm print là non abstract
 *      - Tạo ra lớp student kế thừa lớp person
 *      - Tạo ra lớp teacher kế thừ lớp person
 *      - Khởi tạo hàm main thực hiện khởi tạo lớp person
 */
//Interface
//do vấn đề về đa kế thừa trong java một đối tượng có nhiều thể hiện (lương nghĩa => nhưng trường hợp không lưỡng nghĩa
// sẽ được đa kế thừa).
/**
 * + Interface(giao diện) trong java chỉ có các phương thức trừu tượng là một kĩ thuật để trừu tượng hóa và đa kế thừa
 * trong java. (Không thể khởi tạo giống như lớp trừ tượng)
 * + Một interface trong java là một tập hợp các phương thức trừu tượng (100% phương thức abstract). Một class sẽ triển khai (implements )
 * một interface, do đó class kế thừa phương phương thức abstract của interface.
 * + Một interface không phải là một lớp. Lớp mô tả hành vi và thuộc tính, interface chỉ chứa các hành vi mà một class triển khai
 * + Một class khi implements một interface thì phải định nghĩa tất cả các phương thức abstract, hoặc lớp đó là lớp trừu tượng
 * + Một interface chỉ chưa các hành vi mà một class triển khai nên các trường của interface phải là (public static final), còn phương thức là
 * public abstract
 * + public interface <tên interface>
 * + Cứ pháp để implements trên java
 *      - <Lớp con> [extends <Lớp cha>] implements <Danh sách giao diện>
 *      - <Giao diện con> extends <Giao diện cha>
 * + Khi triển khai interface, có vài quy tắc sau:
 *      - Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm
 *      - Một lớp chỉ có thể kế thừa một lớp, nhưng được triển khai nhiều interface
 *      - Interface có tể kế thừa một giao diện khác.
 *  + Các ví dụ về kiến thức liên quan:
 *      - Tạo 2 interface
 *      - Tạo 1 class thực thi 2 interface
 *      - Tạo 1 interface kế thừ 2 interface
 *      - Tạo 1 class extends và implements
 * */
public class AbstractAndInterface {
}
