package com.pluralsight;

public class CellPhone {
    //Attributes
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private String dial;

    //Constructor
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    //Getter Setter
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void dial(String phoneNumber){
        System.out.println(owner+ ",s phone is calling "+phoneNumber);
    }
}
