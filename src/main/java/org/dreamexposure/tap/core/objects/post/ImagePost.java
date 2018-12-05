package org.dreamexposure.tap.core.objects.post;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class ImagePost extends Post {
    private String imageLink;
    
    
    //Getters
    public String getImageLink() {
        return imageLink;
    }
    
    //Setters
    public void setImageLink(String _imageLink) {
        imageLink = _imageLink;
    }
}
