package com.cejv679.beans;

/**
 * Created by Carlos Molina.
 */
public class Stats {
    private int goals;
    private int bookings;

    public Stats(int goals, int bookings) {
        this.goals = goals;
        this.bookings = bookings;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getBookings() {
        return bookings;
    }

    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "goals=" + goals +
                ", bookings=" + bookings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stats stats = (Stats) o;

        if (getGoals() != stats.getGoals()) return false;
        return getBookings() == stats.getBookings();

    }

    @Override
    public int hashCode() {
        int result = getGoals();
        result = 31 * result + getBookings();
        return result;
    }
}
