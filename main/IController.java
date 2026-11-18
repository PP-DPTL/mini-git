
interface IController {
    void gitInit();
    void pull();
    void push(GitObject object); //uses tree add.
    void commit(String message); 
    void merge();






}