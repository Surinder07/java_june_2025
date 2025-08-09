package aug9;

public class SocialMediaMain {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();

        System.out.println("***** Facebook ****");
        facebook.makeConnections();
        facebook.makePost();
        facebook.uploadPicture();
        facebook.memes();
        facebook.reels();

        System.out.println("******End of Facebook ****");

    }
}
