package Alphabet;

public class B extends A{
    protected String b="b";

    public B(String b, X x){
        super("aaa",x);
        this.b=b;
    }
    public String toString(){
        return super.toString()+"\nb="+b;
    }
}
