package Week3;

public class Address {
    private String province;
    private String district;
    private String commune;
    private int numberHouse;

    public Address(String province, String district, String commune, int numberHouse) {
        this.province = province;
        this.district = district;
        this.commune = commune;
        this.numberHouse = numberHouse;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", commune='" + commune + '\'' +
                ", numberHouse=" + numberHouse +
                '}';
    }
}
