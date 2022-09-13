Câu 1 Annotation @Entity để làm gì?

B. Khai báo class là 1 entity để làm việc với DB

Câu 2 Annotation @Table để làm gì?

A. Khai báo map với tên bảng trong DB

Câu 3 Annotation @Repository để làm gì?

A. Khai báo class hiện tại là 1 repository để làm việc với DB

Câu 4 Thuộc tính nào trong @Column để khai báo cột đó không được nhận giá trị null?

A. nullable = false

Câu 5 Thuộc tính nào trong @Column để khai báo giá trị cột đó là duy nhất?

D. unique = true

Câu 6 Câu nào đúng về annotation @Id?

C. Khi tạo id cho entity, kiểu @GeneratedValue(strategy = GenerationType.AUTO) là kiểu tạo ra dữ liệu kiểu string do chúng ta tự custom

Câu 7 Giả sử có 1 class Employee với các fields sau {id, emailAddress, firstName, lastName}. Hãy viết các method trong interface EmployeeRespository để :

Tìm tất cả các Employee theo emailAddress

Tìm tất cả các Employee khác nhau theo firstName hoặc lastName

Câu 8 Trong những method sau, phương thức nào là sử dụng NamedQuery?

C. @Query("SELECT * FROM product WHERE product_name = 'Ô tô'", nativeQuery = true) List findDataToShow();

Câu 9 public class Category { ... @OneToMany(mapBy="category") private List products; } public class Product { ... @ManyToOne @JoinColumn(name = "category_id") private Category category; } Chọn mô tả đúng?

B. Đoạn code trên sẽ tạo ra 1 cột category_id trong bảng product

Câu 10 @Transaction dùng để làm gì?

C. Để toàn vẹn dữ liệu khi cập nhật dữ liệu (thêm, sửa xoá) vào Db

Câu 11 Câu nào đúng về quan hệ nhiều nhiều?

B. Quan hệ nhiều nhiều chỉ có thể dùng 2 annotation @ManyToMany ở 2 entity Category và Product

Câu 12 Câu nào đúng về phân trang?

C. Phân trang trong Spring Data Jpa không bắt buộc phải gửi 3 tham số page, size, sort

Bài Tập Code
Alt

Tạo 2 Entity Product(id, productName, quantity(số lượng)), Category (id, categoryName)
Hãy bổ sung quan hệ One to Many giữa bảng Category, Product (1 category có nhiều product)
Viết Api CRUD category, CRUD product
Viết chức năng tìm kiếm product theo productName (Like %%)
Viết Api để search category theo category name sử dụng specification trong Spring Data Jpa
