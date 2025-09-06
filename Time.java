public class Time{
    public static void main(String[] args) {
        int secondsInMinute = 60;
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int secondsInDay = secondsInHour * hoursInDay;
        int hour, minute, second;
        hour = 20;
        minute = 56;
        second = 30;

        int secondsSinceMidnight = secondsInHour * hour + secondsInMinute * minute + second;
        System.out.printf("\n%s %d\n", "1) Seconds since midnight:", secondsSinceMidnight);

        int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;
        System.out.printf("%s %d\n", "1) Seconds remaining in the day:", secondsRemainingInDay);

        double percentageOfDayPassed = (secondsSinceMidnight / (double) secondsInDay) * 100;
        System.out.printf("%s %f%s\n", "1) Percentage of day passed:", percentageOfDayPassed, "%");

        int hour1, minute1, second1;
        hour1 = 10;
        minute1 = 2;
        second1 = 38;

        int secondsSinceMidnight1 = secondsInHour * hour1 + secondsInMinute * minute1 + second1;
        System.out.printf("\n%s %d\n", "2) Seconds since midnight:", secondsSinceMidnight1);

        int secondsRemainingInDay1 = secondsInDay - secondsSinceMidnight1;
        System.out.printf("%s %d\n", "2) Seconds remaining in the day:", secondsRemainingInDay1);

        double percentageOfDayPassed1 = (secondsSinceMidnight1 / (double) secondsInDay) * 100;
        System.out.printf("%s %f%s\n", "2) Percentage of day passed:", percentageOfDayPassed1, "%");

        // Seconds remaining from the day before plus today's seconds since midnight gives the elapsed time in seconds;
        int timeElapsedInSeconds = secondsSinceMidnight1 + secondsRemainingInDay;

        System.out.printf("\n%s %d\n", "Time elapsed in seconds:", timeElapsedInSeconds);

        // Time elapsed in hours, minutes, and seconds
        int hoursElapsed, minutesElapsed, secondsElapsed;
        hoursElapsed = timeElapsedInSeconds / secondsInHour;
        minutesElapsed = (timeElapsedInSeconds % secondsInHour) / secondsInMinute;
        secondsElapsed = (timeElapsedInSeconds % secondsInHour) % secondsInMinute;
        
        System.out.printf("\n%s\n%s %d\n%s %d\n%s %d\n", "Time elapsed in hours, minutes, and seconds:", "Hours elapsed:", hoursElapsed, "Minutes elapsed:", minutesElapsed, "Seconds elapsed:", secondsElapsed);
    }
}