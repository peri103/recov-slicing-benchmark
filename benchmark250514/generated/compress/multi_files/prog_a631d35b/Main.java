public class Main {
    public static void main(String[] args) {
        UserEntry userEntry = new UserEntry();
        userEntry.setUserId(1001);

        Course course = new Course("Java Programming");
        course.enrollUser(userEntry);

        course.printEnrolledUserIds();

        /* read */ int userId = userEntry.getUserId();
        System.out.println("Retrieved User ID: " + userId);

        UserEntry anotherUser = new UserEntry();
        anotherUser.setUserId(2002);
        course.enrollUser(anotherUser);

        System.out.println("After enrolling another user:");
        course.printEnrolledUserIds();
    }
}