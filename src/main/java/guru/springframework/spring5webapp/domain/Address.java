package guru.springframework.spring5webapp.domain;

public class Address extends Publisher{

    private String addressLineOne;
    private String city;
    private String province;
    private String postalCode;

    public Address(String addressLineOne, String city, String province, String postalCode) {
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
