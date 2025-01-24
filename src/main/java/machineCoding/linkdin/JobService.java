package machineCoding.linkdin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JobService {
    private final Job job;
    private final Map<String, Job> jobs;

    public JobService(Job job) {
        this.job = job;
        this.jobs = new HashMap<>();
    }

    public Job postJob(String jobId, String title, String description, String postedBy) {
        if (jobs.containsKey(jobId)) {
            throw new IllegalArgumentException("Job already exists!");
        }
        Job job = new Job(jobId, title, description, postedBy);
        jobs.put(jobId, job);
        return job;
    }

    public List<Job> searchJobs(String keyword) {
        List<Job> result = new ArrayList<>();
        for (Job job : jobs.values()) {
            if (job.getTitle().contains(keyword) || job.getDescription().contains(keyword)) {
                result.add(job);
            }
        }
        return result;
    }

    public void applyForJob(String jobId, String userId) {
        Job job = jobs.get(jobId);
        if (job == null) {
            throw new IllegalArgumentException("Job not found!");
        }
        job.addApplicant(userId);
    }

    public List<String> getApplicants(String jobId) {
        Job job = jobs.get(jobId);
        if (job == null) {
            throw new IllegalArgumentException("Job not found!");
        }
        return job.getApplicants();
    }
}
