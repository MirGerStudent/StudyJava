package org.example;

public class Data {
    int day;
    String month;
    int year;

    public Data() {
        this.day = 1;
        this.month = "January";
        this.year = 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Data(int Day, String Month, int Year) {
        this.day = Day;
        this.month = Month;
        this.year = Year;
    }

    public Data(int Day, int Month, int Year) {
        this.day = Day;
        this.month = monthToString(Month);
        this.year = Year;
    }

    private String monthToString(int Month) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (Month > 0) {
            Month %= 12;
            Month--;
        }
        return month[Month];
    }

    private th Protect
}
