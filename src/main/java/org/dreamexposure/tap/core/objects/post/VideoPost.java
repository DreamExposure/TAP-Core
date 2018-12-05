package org.dreamexposure.tap.core.objects.post;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class VideoPost extends Post {
    private String videoLink;
    
    //Getters
    public String getVideoLink() {
        return videoLink;
    }
    
    //Setters
    public void setVideoLink(String _videoLink) {
        videoLink = _videoLink;
    }
}
