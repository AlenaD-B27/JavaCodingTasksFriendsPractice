package solutions.social_media;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingSocialMedia {
    public static void main(String[] args) {

        Facebook fatma = new Facebook("FatmaJava", "sadadaudnau", "Fatima O");
        System.out.println(fatma);

        System.out.println(Facebook.platform);

        fatma.post("Oh today we had a good class");
        fatma.post("I am regretting not doing more java");

        System.out.println(fatma.getAllPost());

        Facebook malika = new Facebook("MalikaSDET", "dadadadsadad", "Malika Z", 21, 5000);
        System.out.println(malika);
        malika.directMessage(fatma, "hello!");

        ArrayList<SocialMedia> allSocialMedia = new ArrayList<>(Arrays.asList(fatma, malika));
        allSocialMedia.add(new Facebook("MrBond", "secret007"));
        // not implemented, but if we created the Instagram class, the object of that class could be added to this List, along with any other child class of the Social Media class

        for(SocialMedia each : allSocialMedia){

            if(each instanceof Facebook && ((Facebook)each).getNumberOfFriends() < 5000){
                System.out.println(((Facebook) each).getUsername() + " can accept more friends. Send a request");
            }

        }

    }
}