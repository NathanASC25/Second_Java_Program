public class Date{
    public static void main(String[] args) {
        int date, year;
        String day, month;

        date = 5;
        month = "September";
        year = 2025;
        day = "Friday";

        // System.out.println(date);
        // System.out.println(month);
        // System.out.println(year);
        // System.out.println(day);

        System.out.printf("\n%s %s%s %s %d%s %d\n", "American format:", day, ",", month, date, ",", year);
        System.out.printf("\n%s %s %d %s %d\n", "European format:", day, date, month, year);
    }
}