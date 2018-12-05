package org.dreamexposure.tap.core.objects.confirmation;

import java.util.UUID;

/**
 * @author NovaFox161
 * Date Created: 12/5/18
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class EmailConfirmation {
    private UUID userId;
    private String code;
    
    //Getters
    public UUID getUserId() {
        return userId;
    }
    
    public String getCode() {
        return code;
    }
    
    //Setters
    public void setUserId(UUID _id) {
        userId = _id;
    }
    
    public void setCode(String _code) {
        code = _code;
    }
}
