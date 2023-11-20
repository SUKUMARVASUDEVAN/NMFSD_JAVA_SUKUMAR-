public class Main {
    public static void main(String[] args) {
        SocialMediaHome home = new SocialMediaHome();

        home.addPost(new SocialMediaPost("Check out my new bike!", "https://example.com/bike.jpg"));
        home.addPost(new SocialMediaPost("I went for a hike today!", "https://example.com/hike.jpg"));

        home.addStory(new Story("Today was a great day at work!", "https://example.com/work.jpg"));
        home.addStory(new Story("I visited my favorite park this weekend!", "https://example.com/park.jpg"));

        System.out.println("Posts:");
        for (SocialMediaPost post : home.getPosts()) {
            System.out.println(post.getPostText());
            System.out.println(post.getPostImageUrl());
        }

        System.out.println("\nStories:");
        for (Story story : home.getStories()) {
            System.out.println(story.getStoryText());
            System.out.println(story.getStoryImageUrl());
        }
    }
}