package org.dreamexposure.tap.core.objects.blog;

import java.util.UUID;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class PersonalBlog extends Blog {
    private UUID ownerId;
    
    private boolean displayAge;
    
    
    public PersonalBlog(String baseUrl) {
        super(baseUrl);
    }
    
    //Getters
    public UUID getOwnerId() {
        return ownerId;
    }
    
    public boolean isDisplayAge() {
        return displayAge;
    }
    
    //Setters
    public void setOwnerId(UUID _ownerId) {
        ownerId = _ownerId;
    }
    
    public void setDisplayAge(boolean _displayAge) {
        displayAge = _displayAge;
    }
}
