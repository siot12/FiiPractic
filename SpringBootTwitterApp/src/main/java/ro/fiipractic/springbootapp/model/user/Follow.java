package ro.fiipractic.springbootapp.model.user;

public class Follow {
    private User user;
    private User following;
    private long timestamp;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "user=" + user +
                ", following=" + following +
                ", timestamp=" + timestamp +
                '}';
    }
}
