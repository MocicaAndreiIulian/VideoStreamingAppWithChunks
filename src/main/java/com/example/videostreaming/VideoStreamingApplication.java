package com.example.videostreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class VideoStreamingApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + File.separator + "video");
        SpringApplication.run(VideoStreamingApplication.class, args);
    }

}
