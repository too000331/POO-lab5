package Alphabet;

public class F extends E {
    protected String f="f";

    public F(String f, X x){
        super("eee",x);
        this.f=f;
    }
    public String toString(){
        return super.toString()+"\nf="+f;
    }
}
