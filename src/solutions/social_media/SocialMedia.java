package solutions.social_media;

public abstract class SocialMedia {

    protected String personalUrl;
    protected int accountLength;
    protected static String platform;
    protected String username;
    protected String password;
    protected String fullName;

    public abstract void directMessage(SocialMedia other, String message);
    public abstract void post(String body);
    public abstract void notification();

}
