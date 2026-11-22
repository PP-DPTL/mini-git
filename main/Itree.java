
import java.util.List;

interface ITree {
    public String getName();
    public String getType();
    //public String getHash();
    public String treeToString();
    public boolean contains();
    public void add(GitObject object);
    public GitObject getRoot(); 

    //Consider: 
    public List<GitObject> getChildren(GitObject object);
    public List<GitObject> getTree(); //could maybe call get children on the root?

}


