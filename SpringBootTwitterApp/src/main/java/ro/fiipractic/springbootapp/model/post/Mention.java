package ro.fiipractic.springbootapp.model.post;

import ro.fiipractic.springbootapp.model.user.User;

public class Mention {
    private int id;
    private User user;
    private Post post;

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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Mention{" +
                "id=" + id +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}
