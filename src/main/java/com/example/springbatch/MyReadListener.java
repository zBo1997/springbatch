package com.example.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

import static java.lang.String.format;

public class MyReadListener implements ItemReadListener<BlogInfo> {
 
    private Logger logger = LoggerFactory.getLogger(MyReadListener.class);
 
 
 
    @Override
    public void beforeRead() {
    }
 
    @Override
    public void afterRead(BlogInfo item) {
    }
 
    @Override
    public void onReadError(Exception ex) {
        try {
            logger.info(format("%s%n", ex.getMessage()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
