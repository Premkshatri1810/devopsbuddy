package com.devopsbuddy.webs.i18n;

import java.util.Locale;
import org.codehaus.groovy.tools.shell.util.MessageSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;


/**
 * Created by tedonema on 06/02/18
 **/
@Service
public class I18NService {
    
    /** The application logger */
    private static final Logger log = LoggerFactory.getLogger(I18NService.class);

    @Autowired
    private MessageSource messageSource;

    /**
     * Return the message for the message id and the default locale in the session context
     * @param messageId The key to the resource file
     **/
    public String getMessage(String messageId){
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    private String getMessage(String messageId, Locale locale) {
        return String.valueOf(messageSource);
    }

    /**
     * Return a message for the given messageId and locale
     * @param messageId The key to the message resourse file
     * @param locale The Locale
     **/
}
