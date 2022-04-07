package ro.fiipractic.springbootapp.servicePost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fiipractic.springbootapp.model.post.Post;
import ro.fiipractic.springbootapp.model.user.User;
import ro.fiipractic.springbootapp.repository.PostDAO;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDAO postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    @Override
    public void createPost(Post post) {
        postRepository.createPost(post.getUser(),post.getMessage(),post.getTimestamp(),post.getReplies());
    }

    @Override
    public void updatePostById(Post post,Integer id) {
        postRepository.updatePost(post.getMessage(),post.getTimestamp(), post.getReplies(),id);
    }

    @Override
    public Post getPostById(Integer id) {
        return postRepository.getPostById(id);
    }

    @Override
    public void deletePost(Integer id) {
        postRepository.deletePost(id);
    }

    @Override
    public List<Post> getPostsByUser(User user) {
        return postRepository.getPostsByUser(user);
    }


}
