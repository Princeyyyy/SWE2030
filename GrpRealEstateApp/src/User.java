public abstract class User {
    // Add any common attributes or methods that all subclasses will share
    private long userId;

    // Constructor
    public User(long userId) {
        this.userId = userId;
    }

    // Getter and Setter
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
