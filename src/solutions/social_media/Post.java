package solutions.social_media;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    private String body;
    private final String dateTime;

    public Post(String body){
        this.body = body;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return body +
                "," + dateTime;
    }
}
