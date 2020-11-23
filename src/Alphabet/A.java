package Alphabet;

public class A {
    protected String a="a";
    protected X x=new X("xxx");

    public A(String a, X x){
        this.a=a;
        this.x=x;
    }
    public String toString(){
        return "a="+a+"\nx.value="+x.getValue();
    }
}
