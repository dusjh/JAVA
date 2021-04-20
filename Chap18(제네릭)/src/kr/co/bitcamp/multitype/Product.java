package kr.co.bitcamp.multitype;

// 타입 파라미터가 2개인 제네릭 클래스(설계 클래스)
public class Product<T,M> {
    
    private T t;
    private M m;
    
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public M getM() {
        return m;
    }
    public void setM(M m) {
        this.m = m;
    } 
}
