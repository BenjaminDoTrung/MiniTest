package Week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    // Khởi tạo địa chỉ

    List<Employee> list = new ArrayList<>();

    Address address1 = new Address("Bà Rịa", "hoocmon", "Hóc xương", 1);
    Address address2 = new Address("Kiên Giang", "Củ chi", "Củ Khoai", 2);
    Address address3 = new Address("Thanh Hóa", "Hóa Dầu", "Dầu Nhớt", 3);
    Address address4 = new Address("Sóc Trăng", "Chị Hằng", "Thiên Bồng", 4);
    Address address5 = new Address("Trà vinh", "Trà Thảo mộc", "Nước Trà", 5);
    Address address6 = new Address("Codgym Hà Nội", "Codgym cầu giấy", "C0523G1", 6);

    // Khởi tạo đối tượng Fulltime

    FullTimeEmployees ngan = new FullTimeEmployees(001, "Lê Hồng Ngân", 23, 000,
            "Ngancutecoboque@gmail.com", address1, 100000, 50000, 1000000);
    FullTimeEmployees yen = new FullTimeEmployees(002, "Bạch Tiểu Yến", 22, 001,
            "yencute@gmail.com", address2, 100000, 50000, 2000000);
    FullTimeEmployees phuong = new FullTimeEmployees(003, "Nguyễn Thị Phương", 21, 002,
            "Ngancutecoboque@gmial.com", address3, 100000, 50000, 3000000);

    ParttimeEmployee lan = new ParttimeEmployee(004, "Lê Phương Lan", 20, 003,
            "lancute@gmail.com", address4, 8.0);

    ParttimeEmployee vi = new ParttimeEmployee(005, "Trần Thị Vi", 24, 004,
            "vicute@gmail.com", address5, 7.0);


    ParttimeEmployee lanAnh = new ParttimeEmployee(006, "Nguyễn Thị Lan Anh", 26, 005,
            "lananhbaby@gmail.com", address6, 9.0);


    // Phương thức tính tổng lương trung bình phải tra cho toàn nhân viên công ty


    public Manager() {
        list.add(ngan);
        list.add(yen);
        list.add(phuong);
        list.add(lan);
        list.add(vi);
        list.add(lanAnh);
    }

    public double totalSalarySum() {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total = (list.get(i).totalSalary()
                    + (list.get(i)).totalSalary()) / list.size();
        }
        System.out.println("tổng tiền" + total);
        return total;
    }

    // Phương thức liệt kê danh sách nhân viên FullTime có lương thấp hơn lương trung bình
    public void listMoneyMin() {
        list.add(ngan);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof FullTimeEmployees) {
                if (((FullTimeEmployees) list.get(i)).salaryFullTime() < totalSalarySum()) {
                    System.out.println(list.get(i).getName());
                }
            }
        }
    }

    // Phương thức tính tổng lương phải trả cho nhân viên partTime
    public int totalMoneyPartTime() {
        int totalMoneyPartTime = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof ParttimeEmployee) {
                totalMoneyPartTime += list.get(i).totalSalary();
            }
        }
        return totalMoneyPartTime;
    }

    // phương thức sắp xếp nhân viên có số lương tăng dần theo phương thức nổi bọt
    public void arrangeEmployee() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).totalSalary() < list.get(j - 1).totalSalary()) {
                    Employee tem = list.get(j);
                    list.set((j - 1), list.get(j));
                    list.set(j, tem);
                }
            }
        }
    }

    // Phương thức sắp xếp nhân viên có số lương tăng dần theo phương thức chọn

    public void arrangeEmployee1() {
        for (int i = 0; i < list.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(max).totalSalary() < list.get(j).totalSalary()) {
                    max = j;
                }
            }
            Employee tem = list.get(max);
            list.set(max, list.get(i));
            list.set(i, tem);
        }
        for (Employee e : list) {
            System.out.println(e.totalSalary());
        }
    }

    // phương thức sắp xếp nhân viên có số lương tăng dần theo hàm sort
    public void sx() {
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.totalSalary() < o2.totalSalary()) return -1;
                if (o1.totalSalary() > o2.totalSalary()) return 1;
                return 0;
            }
        });

        for (Employee e : list) {
            System.out.println(e.totalSalary());
        }
    }

}
