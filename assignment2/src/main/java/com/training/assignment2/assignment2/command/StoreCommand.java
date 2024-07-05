package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoreCommand implements ImageProcessingOperation {
    private String service;
    private String pathOrBucket;
    private String key;
    private String filename;

    public StoreCommand(String service, String pathOrBucket, String key, String filename) {
        this.service = service;
        this.pathOrBucket = pathOrBucket;
        this.key = key;
        this.filename = filename;
    }

    @Override
    public void execute() {
        if ("google-drive".equalsIgnoreCase(service)) {
            log.info("Storing result in Google Drive at " + pathOrBucket + "/" + key);
        } else if ("aws-s3".equalsIgnoreCase(service)) {
            log.info("Storing result in AWS S3 bucket " + pathOrBucket + " with key " + key);
        } else {
            log.info("Unsupported storage service: " + service);
        }
    }
}
