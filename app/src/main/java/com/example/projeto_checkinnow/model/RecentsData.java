package com.example.projeto_checkinnow.model;

public class RecentsData {
    String hotelName;
    String hotelDesc;
    String hotelPrice;
    Integer imageUrl;

    public RecentsData(String hotelName, String hotelDesc, String hotelPrice,Integer imageUrl) {
        this.hotelName = hotelName;
        this.hotelDesc = hotelDesc;
        this.hotelPrice = hotelPrice;
        this.imageUrl = imageUrl;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDesc() {
        return hotelDesc;
    }

    public void setHotelDesc(String hotelDesc) {
        this.hotelDesc = hotelDesc;
    }

    public String getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(String hotelPrice) {
        this.hotelPrice = hotelPrice;
    }
}
