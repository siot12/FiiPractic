package ro.fiipractic.springbootapp.repository;

import org.springframework.stereotype.Repository;
import ro.fiipractic.springbootapp.exception.PostNotFoundException;
import ro.fiipractic.springbootapp.exception.UserNotFoundException;
import ro.fiipractic.springbootapp.model.post.Post;
import ro.fiipractic.springbootapp.model.reply.Reply;
import ro.fiipractic.springbootapp.model.user.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDAO {
    private List<Post> posts = new ArrayList<>();
    private int id=0;

    public List<Post> getAllPosts()
    {
        return posts;
    }

    public void createPost(User user, String message, Long timestamp, Reply replies )
    {
        Post newPost = new Post();
        newPost.setId(id);
        newPost.setMessage(message);
        newPost.setUser(user);
        newPost.setReplies(replies);
        newPost.setTimestamp(timestamp);
        posts.add(newPost);
        id++;
    }

    public void updatePost( String message, Long timestamp,Reply replies, Integer id)
    {
        posts.get(id).setMessage(message);
        posts.get(id).setReplies(replies);
        posts.get(id).setTimestamp(timestamp);
    }

    public Post getPostById(Integer id)
    {
        if(id > this.id )
        {
            throw new PostNotFoundException(String.format("Post with id %s was not found",id));
        }
        else
        {
            return posts.get(id);
        }
    }

    public List<Post> getPostsByUser(User user)
    {
        List<Post> userPosts=new ArrayList<>();
        for (Post post : posts) {
            if (post.getUser() == user) {
                userPosts.add(post);
            }
        }
        return userPosts;
    }

    public void deletePost(Integer id)
    {
        posts.remove(getPostById(id));
    }
}
