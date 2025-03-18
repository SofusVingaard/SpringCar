package org.example.springprojekt.model;

public class Car {
    int id;
    String brand;
    int modelYear;
    String type;
    String color;
    String licensePlate;
    String image;

    public Car(int id, String brand, int modelYear, String type, String color, String licensePlate, String image) {
        this.id = id;
        this.brand = brand;
        this.modelYear = modelYear;
        this.type = type;
        this.color = color;
        this.licensePlate = licensePlate;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
