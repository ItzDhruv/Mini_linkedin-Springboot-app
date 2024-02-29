package com.example.JobListing.PostRepository;

import com.example.JobListing.Model.Post;
import java.util.List;
public interface SearchRepository {
    List<Post> findByText(String text);
}
