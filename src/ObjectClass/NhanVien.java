package ObjectClass;

public class NhanVien {
    public String FullName;
    public int Age;
    public String Department;

    public NhanVien(String fullname, int age, String department) {
        this.FullName = fullname;
        this.Age = age;
        this.Department = department;
    }

    public String getFullName() {
        return FullName;
    }

    public String getDepartment() {
        return Department;
    }

    public int getAge() {
        return Age;
    }

    public String toString() {
        return "Họ và tên: " + this.FullName + ", tuoi: " + this.Age + ", bộ phận: " + this.Department;
    }


}
