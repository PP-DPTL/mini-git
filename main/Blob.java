//Immutable contents of a single file
//The id is a hash of the contents, so equal contents => equal id.
//Used as the value in the path -> contents map.
import java.util.Objects;

class Blob{
    private final String id;
    private final String contents;

    public Blob(String contents) {
        Objects.requireNonNull(contents, "Contents cannot be null");
        this.id = computeId(contents);
        this.contents = contents;
    }

    private static String computeId(String contents){
        int hash = contents.hashCode();
        return Integer.toHexString(hash);

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Blob other)) return false;
        return this.id.equals(other.id) && this.contents.equals(other.contents);

    }

    @Override
    public int hashCode(){
        return Objects.hash(id, contents);
    }
    
    @Override
    public String toString(){
        int previewLength = Math.min(20, contents.length());
        String preview = contents.substring(0, previewLength);
        return "Blob["+"id=" + id + ", contents=" + preview + "]";
    }


    public String getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

}
