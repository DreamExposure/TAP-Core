package org.dreamexposure.tap.core.objects.post;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class AudioPost extends Post {
    private String audioLink;
    
    //Getters
    public String getAudioLink() {
        return audioLink;
    }
    
    //Setters
    public void setAudioLink(String _audioLink) {
        audioLink = _audioLink;
    }
}
