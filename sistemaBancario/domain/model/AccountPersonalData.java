package sistemaBancario.domain.model;

import sistemaBancario.domain.service.verifiers.CpfVerifier;

public class AccountPersonalData {

    private String fullName;
    private String cpfNumber;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String cityAddress;
    private String stateAddress;
    private String countryAddress;
    private String streetAddress;
    private int houseNumberAddress;
    private String neighborhoodAddress;
    private String creationDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(String cpfNumber) {
        if (CpfVerifier.cpfVerify(cpfNumber)){
            this.cpfNumber = cpfNumber;
        }
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getStateAddress() {
        return stateAddress;
    }

    public void setStateAddress(String stateAddress) {
        this.stateAddress = stateAddress;
    }

    public String getCountryAddress() {
        return countryAddress;
    }

    public void setCountryAddress(String countryAddress) {
        if (this.countryAddress == null && countryAddress.equals("Brasil")) {
            this.countryAddress = countryAddress;
        }
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getHouseNumberAddress() {
        return houseNumberAddress;
    }

    public void setHouseNumberAddress(int houseNumberAddress) {
        this.houseNumberAddress = houseNumberAddress;
    }

    public String getNeighborhoodAddress() {
        return neighborhoodAddress;
    }

    public void setNeighborhoodAddress(String neighborhoodAddress) {
        this.neighborhoodAddress = neighborhoodAddress;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
