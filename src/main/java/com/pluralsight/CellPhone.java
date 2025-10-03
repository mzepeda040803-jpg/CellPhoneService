package com.pluralsight;

public class CellPhone {
    private String serialNumber;
    private String model;
    private String carrier;

    public CellPhone(long serialNumber, String model, String carrier, long phoneNumber, String owner){
        this.serialNumber = "serialNumber";
        this.model = "model";
        this.carrier = "carrier";
        this.phoneNumber = "phoneNumber";
        this.owner = "owner";
    }

    public CellPhone() {

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String phoneNumber;
    private String owner;

    public void display() {
        System.out.println(this.getSerialNumber() + " " + this.getModel() + " " + this.getCarrier() + " " + this.getPhoneNumber() + " " + this.getOwner());
    }
}
