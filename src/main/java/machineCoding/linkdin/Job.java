package machineCoding.linkdin;

import java.util.ArrayList;
import java.util.List;

class Job {
    private final String jobId;
    private final String title;
    private final String description;
    private final String postedBy; // UserId
    private final List<String> applicants;

    public Job(String jobId, String title, String description, String postedBy) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.postedBy = postedBy;
        this.applicants = new ArrayList<>();
    }

    public String getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public List<String> getApplicants() {
        return applicants;
    }

    public void addApplicant(String userId) {
        applicants.add(userId);
    }
}