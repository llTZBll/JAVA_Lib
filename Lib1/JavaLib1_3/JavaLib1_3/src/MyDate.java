public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        validateDay();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
            validateDay();
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        validateDay();
    }

    private void validateDay() {
        int maxDay = getMaxDay(month, year);
        if (day < 1 || day > maxDay) {
            day = Math.min(Math.max(1, day), maxDay);
        }
    }

    private int getMaxDay(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }
}