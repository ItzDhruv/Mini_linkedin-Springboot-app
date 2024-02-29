package com.example.JobListing.Controller;

import com.example.JobListing.Model.Post;
import com.example.JobListing.PostRepository.PostRepository;
import com.example.JobListing.PostRepository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("home")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("getAllPost")
    public List<Post> getAllPosts(){
       return  postRepository.findAll();
    }

    @GetMapping("search/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }
    @PostMapping("postData")
    public Post PostJobs(@RequestBody Post post){
       return postRepository.save(post);
    }
}
