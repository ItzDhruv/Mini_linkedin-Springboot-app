package com.example.JobListing.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;


@Data
@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
