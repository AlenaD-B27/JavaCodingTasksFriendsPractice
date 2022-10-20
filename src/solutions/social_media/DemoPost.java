package solutions.social_media;

public class DemoPost {
    public static void main(String[] args) throws InterruptedException{
        Post post1 = new Post("This is my java blog");
        System.out.println(post1.getBody());
        System.out.println(post1.getDateTime());

        Thread.sleep(60000);

        System.out.println(new Post("Second Post").getDateTime());

    }
}
