package ro.fiipractic.springbootapp.model.reply;

import ro.fiipractic.springbootapp.model.post.Post;

public class Reply {
    private Post parent;
    private Boolean publicReply;

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public Boolean getPublicReply() {
        return publicReply;
    }

    public void setPublicReply(Boolean publicReply) {
        this.publicReply = publicReply;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "parent=" + parent +
                ", publicReply=" + publicReply +
                '}';
    }
}
