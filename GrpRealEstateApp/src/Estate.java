public abstract class Estate {
    // Add any common attributes or methods that all subclasses will share
    private long id;

    // Constructor
    public Estate(long id) {
        this.id = id;
    }

    // Getter and Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
