package Alphabet;

public class D extends C {
    protected String d="d";

    public D(String d, X x){
        super("ccc",x);
        this.d=d;
    }
    public String toString(){
        return super.toString()+"\nd="+d;
    }
}
