package machineCoding.linkdin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SearchService {
    private final UserService userService;
    private final PostService postService;
    private final JobService jobService;

    public SearchService(UserService userService, PostService postService, JobService jobService) {
        this.userService = userService;
        this.postService = postService;
        this.jobService = jobService;
    }

    public List<User> searchUsers(String keyword) {
        List<User> result = new ArrayList<>();
        for (User user : userService.getAllUsers().values()) {
            if (user.getName().contains(keyword) || user.getHeadline().contains(keyword)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<Post> searchPosts(String keyword) {
        List<Post> result = new ArrayList<>();
        for (Post post : postService.getAllPosts()) {
            if (post.getContent().contains(keyword)) {
                result.add(post);
            }
        }
        return result;
    }

    public List<Job> searchJobs(String keyword) {
        return jobService.searchJobs(keyword);
    }
}
