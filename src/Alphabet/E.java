package Alphabet;

public class E extends D{
    protected String e="e";

    public E(String e, X x){
        super("ddd",x);
        this.e=e;
    }
    public String toString(){
        return super.toString()+"\ne="+e;
    }
}
