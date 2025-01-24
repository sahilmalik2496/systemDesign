package machineCoding.linkdin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedInExtendedMain {
    private final Job job;

    public LinkedInExtendedMain(Job job) {
        this.job = job;
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        PostService postService = new PostService();
        JobService jobService = new JobService(q.this);
        NotificationService notificationService = new NotificationService();
        SearchService searchService = new SearchService(userService, postService, jobService);

        // Create Users
        userService.createUser("1", "Alice", "alice@example.com");
        userService.createUser("2", "Bob", "bob@example.com");

        // Post Jobs
        jobService.postJob("job1", "Software Engineer", "Develop Java applications", "1");

        // Search for Jobs
        List<Job> jobs = searchService.searchJobs("Software");
        System.out.println("Jobs found: " + jobs.size());

        // Apply for Job
        jobService.applyForJob("job1", "2");

        // Notify Job Poster
        notificationService.sendNotification("1", "Bob applied for your job: Software Engineer");

        // Get Notifications
        List<Notification> notifications = notificationService.getNotifications("1");
        notifications.forEach(notification -> System.out.println(notification.getMessage()));
    }
}
