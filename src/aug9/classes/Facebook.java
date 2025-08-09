package aug9.classes;

import aug9.intefaces.EntertainmentBasedSocialMedia;
import aug9.intefaces.HybridSocialMedia;
import aug9.intefaces.ProfessionalSocialMedia;
import aug9.intefaces.SocialMedia;

public class Facebook extends PictureBasedSocialMedia implements HybridSocialMedia,
        EntertainmentBasedSocialMedia, SocialMedia, ProfessionalSocialMedia.Postable {
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

    @Override
    public void videoBasedPost() {

    }

    @Override
    public void textBasedPost() {

    }
}
