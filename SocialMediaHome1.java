import java.util.ArrayList;
import java.util.List;

public class SocialMediaHome1 {
    private List<SocialMediaPost> posts;
    private List<Story> stories;

    public SocialMediaHome1() {
        posts = new ArrayList<>();
        stories = new ArrayList<>();
    }

    public void addPost(SocialMediaPost post) {
        posts.add(post);
    }

    public void addStory(Story story) {
        stories.add(story);
    }

    public List<SocialMediaPost> getPosts() {
        return posts;
    }

    public List<Story> getStories() {
        return stories;
    }
}




public class SocialMediaPost {
    private String postText;
    private String postImageUrl;

    public SocialMediaPost(String postText, String postImageUrl) {
        this.postText = postText;
        this.postImageUrl = postImageUrl;
    }

    public String getPostText() {
        return postText;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }
}
public class Story {
    private String storyText;
    private String storyImageUrl;

    public Story(String storyText, String storyImageUrl) {
        this.storyText = storyText;
        this.storyImageUrl = storyImageUrl;
    }

    public String getStoryText() {
        return storyText;
    }

    public String getStoryImageUrl() {
        return storyImageUrl;
    }
}