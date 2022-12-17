public abstract class Item {
    protected int id;
    public Item(){
    }
    public Item (int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
}
