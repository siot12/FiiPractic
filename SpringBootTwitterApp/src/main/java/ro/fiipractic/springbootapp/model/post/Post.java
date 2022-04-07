package ro.fiipractic.springbootapp.model.post;

import org.springframework.lang.NonNull;
import ro.fiipractic.springbootapp.model.reply.Reply;
import ro.fiipractic.springbootapp.model.user.User;

public class Post {
    @NonNull
    private int id;

    @NonNull
    private User user;

    private String message;
    private Long timestamp;
    private Reply replies;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Reply getReplies() {
        return replies;
    }

    public void setReplies(Reply replies) {
        this.replies = replies;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user=" + user +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
