package ro.fiipractic.springbootapp.servicePost;

import ro.fiipractic.springbootapp.model.post.Post;
import ro.fiipractic.springbootapp.model.user.User;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    void createPost(Post post);

    void updatePostById(Post post,Integer id);

    Post getPostById(Integer id);

    void deletePost(Integer id);

    List<Post> getPostsByUser(User user);

}
