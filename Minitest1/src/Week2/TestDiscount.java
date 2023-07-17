package Week2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDiscount {

    public static void main(String[] args) {
        Meat meat1 = new Meat("1", "Meat 1", LocalDate.of(2023, 7, 18), 50000, 5);
        Meat meat2 = new Meat("2", "Meat 2", LocalDate.of(2023, 8, 01), 60000, 6);
        Meat meat3 = new Meat("3", "Meat 3", LocalDate.of(2023, 9, 02), 70000, 7);
        Meat meat4 = new Meat("4", "Meat 4", LocalDate.of(2023, 10, 15), 80000, 8);
        Meat meat5 = new Meat("5", "Meat 5", LocalDate.of(2023, 11, 13), 90000, 9);

        CrispyFlour crispyFlour1 = new CrispyFlour("1", "crispyFlour1",
                LocalDate.of(2021, 12, 1), 30000, 2);
        CrispyFlour crispyFlour2 = new CrispyFlour("1", "crispyFlour2",
                LocalDate.of(2023, 5, 19), 30000, 3);
        CrispyFlour crispyFlour3 = new CrispyFlour("1", "crispyFlour3",
                LocalDate.of(2023, 5, 19), 30000, 4);
        CrispyFlour crispyFlour4 = new CrispyFlour("1", "crispyFlour4",
                LocalDate.of(2023, 5, 19), 30000, 5);
        CrispyFlour crispyFlour5 = new CrispyFlour("1", "crispyFlour5",
                LocalDate.of(2023, 5, 19), 30000, 6);

        List<Material> materialList = new ArrayList<>();
        materialList.addAll(Arrays.asList(meat1, meat2, meat3, meat4, meat5,
                crispyFlour1, crispyFlour2, crispyFlour3,crispyFlour4,crispyFlour5));
        double tongGiaThucNhanSauChietKhau = 0;
        double tongGiaChuaChietKhau = 0;
        for (int i = 0; i < materialList.size(); i++) {

            if (materialList.get(i) instanceof Meat) {
                tongGiaChuaChietKhau += materialList.get(i).getCost();
                tongGiaThucNhanSauChietKhau += ((Meat) materialList.get(i)).getRealMoney();
            }
            if (materialList.get(i) instanceof CrispyFlour) {
                tongGiaChuaChietKhau += materialList.get(i).getCost();
                tongGiaThucNhanSauChietKhau += (((CrispyFlour) materialList.get(i)).getRealMoney());
            }
        }
        double phanTramchenhLech = ((tongGiaChuaChietKhau - tongGiaThucNhanSauChietKhau) / tongGiaChuaChietKhau) /100;
        System.out.println("Chênh lệch giữa chiếu khấu và không chiết khấu = " + phanTramchenhLech);

    }
}
