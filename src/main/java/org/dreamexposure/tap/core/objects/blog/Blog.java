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
public class Blog {
    private UUID blogId;
    
    private String baseUrl;
    private String completeUrl;
    
    private String name;
    private String description;
    
    private String iconUrl;
    private String backgroundColor;
    private String backgroundUrl;
    
    private boolean allowUnder18;
    private boolean nsfw;
    
    public Blog(String _baseUrl) {
        baseUrl = _baseUrl;
    }
    
    //Getters
    public UUID getBlogId() {
        return blogId;
    }
    
    public String getBaseUrl() {
        return baseUrl;
    }
    
    public String getCompleteUrl() {
        return completeUrl;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getIconUrl() {
        return iconUrl;
    }
    
    public String getBackgroundColor() {
        return backgroundColor;
    }
    
    public String getBackgroundUrl() {
        return backgroundUrl;
    }
    
    public boolean isAllowUnder18() {
        return allowUnder18;
    }
    
    public boolean isNsfw() {
        return nsfw;
    }
    
    //Setters
    public void setBlogId(UUID _blogId) {
        blogId = _blogId;
    }
    
    public void setBaseUrl(String _baseUrl) {
        baseUrl = _baseUrl;
    }
    
    public void setCompleteUrl(String _completeUrl) {
        completeUrl = _completeUrl;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public void setDescription(String _description) {
        description = _description;
    }
    
    public void setIconUrl(String _iconUrl) {
        iconUrl = _iconUrl;
    }
    
    public void setBackgroundColor(String _backgroundColor) {
        backgroundColor = _backgroundColor;
    }
    
    public void setBackgroundUrl(String _backgroundUrl) {
        backgroundUrl = _backgroundUrl;
    }
    
    public void setAllowUnder18(boolean _allowUnder18) {
        allowUnder18 = _allowUnder18;
    }
    
    public void setNsfw(boolean _nsfw) {
        nsfw = _nsfw;
    }
}