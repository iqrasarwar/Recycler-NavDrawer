package com.example.recycler;

public class Friend {

    private int id;
    private String name;
    private int dob;
    private String city;
    private int imageID;

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", imageID=" + imageID +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                '}';
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public Friend(int id, String name, int dob, String city, int imgId) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
