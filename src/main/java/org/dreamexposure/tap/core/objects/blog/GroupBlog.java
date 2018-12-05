package org.dreamexposure.tap.core.objects.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class GroupBlog extends Blog {
    private List<UUID> owners = new ArrayList<UUID>();
    
    
    public GroupBlog(String _baseUrl) {
        super(_baseUrl);
    }
    
    //Getters
    public List<UUID> getOwners() {
        return owners;
    }
    
    //Setters
    
}
