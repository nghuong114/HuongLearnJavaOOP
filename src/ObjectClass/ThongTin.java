package ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1= new NhanVien("Hoàng Văn A", 22,"Product");
        System.out.println("Họ và tên:" +nhanVien1.getFullName());
        System.out.println("Tuổi:" +nhanVien1.getAge());
        System.out.println("Bộ phận:"+ nhanVien1.getDepartment());





    }
}
