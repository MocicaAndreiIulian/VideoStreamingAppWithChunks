package com.example.videostreaming.constants;

import java.io.File;

public class ApplicationConstants {

    public static final String VIDEO = System.getProperty("user.dir") + File.separator + "video";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String VIDEO_CONTENT = "video/";
    public static final String CONTENT_RANGE = "Content-Range";
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final String BYTES = "bytes";
    public static final int CHUNK_SIZE = 314700;

    private ApplicationConstants() {
    }

}
