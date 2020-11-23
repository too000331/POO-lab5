package Alphabet;

public class H extends G {
    protected String h="h";
    private X x=new X("x");

    public H(String h, X x){
        super("ggg",x);
        this.h=h;
    }
    public String toString(){
        return super.toString()+"\nh="+h;
    }
}
