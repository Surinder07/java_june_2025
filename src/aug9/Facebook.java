package aug9;

public class Facebook implements HybridSocialMedia, EntertainmentBasedSocialMedia, SocialMedia{
    @Override
    public void reels() {
        System.out.println("Facebook can play reels for about 90 seconds");
    }

    @Override
    public void memes() {
        System.out.println("Facebook can show multile memes");
    }

    @Override
    public void uploadPicture() {

    }

    @Override
    public void makePost() {

    }

    @Override
    public void makeConnections() {

    }
}
