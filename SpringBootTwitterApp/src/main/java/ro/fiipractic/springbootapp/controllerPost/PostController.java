package ro.fiipractic.springbootapp.controllerPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.fiipractic.springbootapp.model.post.Post;
import ro.fiipractic.springbootapp.servicePost.PostService;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping(value = "/posts",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }

    @PutMapping(value = "/posts/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePostById(@PathVariable Integer id, @RequestBody Post post)
    {
        postService.updatePostById(post,id);
    }


    @DeleteMapping(value = "/posts/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deletePost(@PathVariable Integer id)
    {
        postService.deletePost(id);
    }

}
