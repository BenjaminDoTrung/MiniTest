package Week2;

import java.time.LocalDate;

public class Meat extends Material implements Discount{

    private double weight;


    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {  // lượng
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() { //ngày hết hạn
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        int chenhLechNgay = tinhChenhLechNgay(getExpiryDate(), manufacturingDate.now());
        if (chenhLechNgay <= 5) {
            System.out.println("giảm 30% ");
            int giaThuc = (getCost() * 70) / 100;
            System.out.println(giaThuc);
            return giaThuc;
        } else {
            System.out.println("giảm 10%");
            int giaThuc = (getCost() * 90) / 100;
            System.out.println(giaThuc);
            return giaThuc;
        }
    }
    public int tinhChenhLechNgay(LocalDate date1, LocalDate date2) {

        int nam1 = date1.getYear();
        int thang1 = date1.getMonthValue();
        int ngay1 = date1.getDayOfMonth();
//        System.out.println("thong tin: " + ngay1 + " " + thang1 + " " + nam1);

        int nam2 = date2.getYear();
        int thang2 = date2.getMonthValue();
        int ngay2 = date2.getDayOfMonth();
//        System.out.println("thong tin: " + ngay2 + " " + thang2 + " " + nam2);

        int chenhLechNam = nam1 - nam2;
        int chenhLechThang = thang1 - thang2;
        int chenhLechNgay = ngay1 - ngay2;

        int ketqua = chenhLechNgay + (chenhLechThang * 30) + (chenhLechNam * 365);

        return ketqua;
    }
}
