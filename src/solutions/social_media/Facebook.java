package solutions.social_media;

import java.util.ArrayList;
import java.util.List;

public class Facebook extends SocialMedia implements HasGroups{

    private int age;
    private int numberOfFriends;
    private List<Post> allPost;
    private int numberOfGroups;

    static {
        platform = "Facebook";
    }

    public Facebook(String username, String password){
        this.username = username;
        setPassword(password);
        personalUrl = "Facebook.com/" + username;
        allPost = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName){
        this(username, password);
        setFullName(fullName);
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    @Override
    public void directMessage(SocialMedia receiver, String message) {
        System.out.println("Sending message to: " + ((Facebook)receiver).getFullName());
        System.out.println("Message:  " + message);
    }

    @Override
    public void post(String body) {
        allPost.add(new Post(body));
    }

    @Override
    public void notification() {
        System.out.println("Notification from facebook");
    }

    @Override
    public void joinGroup(String group) {
        System.out.println(username + " joined " + group + " group");
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(username + " left " + group + " group");
        numberOfGroups--;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(username)) {
            System.out.println("Password should not contain the username, default password set");
            this.password = "default";
        } else {
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean isValidName = true;

        for(int i = 0; i < fullName.length(); i++){
            if(!Character.isLetter(fullName.charAt(i)) && fullName.charAt(i) != ' '){
                System.out.println("Name is invalid");
                isValidName = false;
                break;
            }
        }

        this.fullName = isValidName ? fullName : "No Name";

        /*
            if(isValidName){
                this.fullName = fullName;
            } else {
                this.fullName = "No Name;
            }
         */
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 13 && age < 130){
            this.age = age;
        } else {
            System.out.println("This is invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends >= 0 && numberOfFriends <= 5000){
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }
    }

    public List<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(List<Post> allPost) {
        this.allPost = allPost;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                " username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", \nAll Posts: " + allPost +
                '}';
    }

}
