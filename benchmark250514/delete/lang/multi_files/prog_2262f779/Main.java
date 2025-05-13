import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        DateManipulator dateManipulator = new DateManipulator(date);

        Date twoHoursLater = CalendarHelper.addHours(date, 2);
        Date anotherDate = DateUtils.addDays(date, 5);
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.DAY_OF_MONTH);

        Date updatedDate = dateManipulator.setMinutes(30);

        Date secondsAddedDate = CalendarHelper.addSeconds(updatedDate, 45);
        Date dateWithoutHours = CalendarHelper.truncateToHour(secondsAddedDate);

        Date truncatedDate = dateManipulator.truncateDate(updatedDate);

        System.out.println("Original Date: " + date);
        System.out.println("Date Two Hours Later: " + twoHoursLater);
        System.out.println("Another Date Truncated: " + truncatedAnotherDate);
        System.out.println("Updated Date with Minutes Set: " + updatedDate);
        System.out.println("Date with Seconds Added: " + secondsAddedDate);
        System.out.println("Date without Hours: " + dateWithoutHours);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}