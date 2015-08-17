package com.cejv679.web;


/**
 * Created by Carlos Molina.
 */
public class PlayerForm extends PersonForm {
    String country;
    String position;
    String goals;
    String bookings;

    public PlayerForm() {
        super();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getBookings() {
        return bookings;
    }

    public void setBookings(String bookings) {
        this.bookings = bookings;
    }

}
