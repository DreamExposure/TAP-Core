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
public class Post implements IPost {
    private UUID id;
    private Account creator;
    private Blog originBlog;
    private String permaLink;
    private String fullLink;
    private long timestamp;
    
    private String title;
    private String body;
    
    
    //Getters
    public UUID getId() {
        return id;
    }
    
    public Account getCreator() {
        return creator;
    }
    
    public Blog getOriginBlog() {
        return originBlog;
    }
    
    public String getPermaLink() {
        return permaLink;
    }
    
    public String getFullLink() {
        return fullLink;
    }
    
    
    public long getTimestamp() {
        return timestamp;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getBody() {
        return body;
    }
    
    //Setters
    public void setId(UUID _id) {
        id = _id;
    }
    
    public void setCreator(Account _creator) {
        creator = _creator;
    }
    
    public void setOriginBlog(Blog _blog) {
        originBlog = _blog;
    }
    
    public void setPermaLink(String _permaLink) {
        permaLink = _permaLink;
    }
    
    public void setFullLink(String _fullLink) {
        fullLink = _fullLink;
    }
    
    public void setTimestamp(long _timestamp) {
        timestamp = _timestamp;
    }
    
    public void setTitle(String _title) {
        title = _title;
    }
    
    public void setBody(String _body) {
        body = _body;
    }
}
