package com.training.assignment2.assignment2.command;

import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoreCommand implements ImageProcessingOperation {
    private String service;
    private String pathOrBucket;
    private String key;
    private String filename;
    ImageProcessingMonitor monitor;

    public StoreCommand(String service, String pathOrBucket, String key, String filename, ImageProcessingMonitor monitor) {
        this.service = service;
        this.pathOrBucket = pathOrBucket;
        this.key = key;
        this.filename = filename;
        this.monitor = monitor;
    }

    @Override
    public void execute() {
        if ("google-drive".equalsIgnoreCase(service)) {
            monitor.operationStatusChanged("Starting storing operation for " + filename);
            log.info("Storing result in Google Drive at " + pathOrBucket + "/" + key);
            monitor.operationStatusChanged("Finished storing operation for " + filename);
        } else if ("aws-s3".equalsIgnoreCase(service)) {
            monitor.operationStatusChanged("Starting storing operation for " + filename);
            log.info("Storing result in AWS S3 bucket " + pathOrBucket + " with key " + key);
            monitor.operationStatusChanged("Finished storing operation for " + filename);
        } else {
            log.info("Unsupported storage service: " + service);
        }
    }
}
