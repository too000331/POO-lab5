package Alphabet;

public class J extends I{
    protected String j="j";

    public J(String j, X x){
        super("iii",x);
        this.j=j;
    }
    public String toString(){
        return super.toString()+"\nj="+j;
    }
}
