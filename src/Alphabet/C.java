package Alphabet;

public class C extends B{
    protected String c="c";

    public C(String c, X x){
        super("bbb",x);
        this.c=c;
    }
    public String toString(){
        return super.toString()+"\nc="+c;
    }
}
