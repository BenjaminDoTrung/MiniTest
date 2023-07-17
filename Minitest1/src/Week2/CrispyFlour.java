package Week2;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        int chenhLechThang = tinhChenhLechThang(getExpiryDate(), LocalDate.now());
        System.out.println(chenhLechThang);

        if (chenhLechThang <= 0) {
            System.out.println("Hết hạn sử dụng");
            return 0;
        }
        else if (chenhLechThang <= 2) {
            System.out.println("Giam 40%");
            double giaThuc = getCost();
            giaThuc = (getCost() * 60) / 100;
            System.out.println(giaThuc);
            return giaThuc;
        }
        else if (chenhLechThang <= 4) {
            System.out.println("Giam 20%");
            double giathuc = getCost();
            giathuc = (getCost() * 80) / 100;
            System.out.println(giathuc);
            return giathuc;
        }
        else {
            System.out.println("Giam 5%");
            double giathuc = getCost();
            giathuc = (getCost() * 95) / 100;
            System.out.println(giathuc);
            return giathuc;
        }

    }



    public int tinhChenhLechThang(LocalDate date1, LocalDate date2) {

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

        int ketqua = chenhLechThang + chenhLechNam * 12;
//        System.out.println("Ket qua: " + ketqua);
//
//        System.out.println(LocalDate.now().plusDays(308));

        return ketqua;
    }
}
