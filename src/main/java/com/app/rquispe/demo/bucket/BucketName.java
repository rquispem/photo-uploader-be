package com.app.rquispe.demo.bucket;

public enum BucketName {
    PROFILE_IMAGE("amigoscode-image-upload-ruben");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
