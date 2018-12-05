package org.dreamexposure.tap.core.objects.post;

import org.dreamexposure.tap.core.objects.account.Account;
import org.dreamexposure.tap.core.objects.blog.Blog;

import java.util.UUID;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public interface IPost {
    
    //Getters
    UUID getId();
    
    Account getCreator();
    
    Blog getOriginBlog();
    
    String getPermaLink();
    
    String getFullLink();
    
    long getTimestamp();
    
    String getTitle();
    
    String getBody();
    
    //Setters
    void setId(UUID _id);
    
    void setCreator(Account _creator);
    
    void setOriginBlog(Blog _blog);
    
    void setPermaLink(String _permaLink);
    
    void setFullLink(String _fullLink);
    
    void setTimestamp(long _timestamp);
    
    void setTitle(String _title);
    
    void setBody(String _body);
}
