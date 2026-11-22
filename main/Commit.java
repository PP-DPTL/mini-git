import java.time.Instant;
import java.util.Objects;

/**
 * The commit is made immutable by having all its fields final. 
 */

public class Commit {
    private final String id;
    private final String author;
    private final String message;
    private final String parentCommitId; // null for the root commit
    private final String blobId;
    private final Instant timeStamp;     // set when the commit is made

    public Commit(String id, String author, String message,
                  String parentCommitId, String blobId) {
        this.id = Objects.requireNonNull(id, "id");
        this.author = Objects.requireNonNull(author, "author");
        this.message = Objects.requireNonNull(message, "message");
        this.parentCommitId = parentCommitId;
        this.blobId = Objects.requireNonNull(blobId, "blobId");
        this.timeStamp = Instant.now();
    }

    public String getId() { return id; }
    public String getAuthor() { return author; }
    public String getMessage() { return message; }
    public String getParentCommitId() { return parentCommitId; }
    public String getBlobId() { return blobId; }
    public Instant getTimeStamp() { return timeStamp; }

    public boolean isRoot() {
        return parentCommitId == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                    // same object
        if (!(o instanceof Commit other)) return false; // null or wrong type
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "commit " + id + "\n"
             + "Author: " + author + "\n"
             + "Date:   " + timeStamp + "\n"
             + "Blob:   " + blobId + "\n"
             + (isRoot() ? "" : "Parent: " + parentCommitId + "\n")
             + "\n    " + message;
    }
}