package com.example.spring_university_professor.DTO;

public class UserLocationDTO {
    private Long userId;
    private String username;
    private double lat;
    private double lng;
    private String place;

    public UserLocationDTO() {
    }

    public UserLocationDTO(Long userId, String username, double lat, double lng, String place) {
        this.userId = userId;
        this.username = username;
        this.lat = lat;
        this.lng = lng;
        this.place = place;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
