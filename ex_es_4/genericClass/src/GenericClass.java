public class GenericClass<T1, T2> {

    private T1 argT1;
    private T2 argT2;


    public GenericClass (T1 argT1, T2 argT2){

        this.argT1 = argT1;
        this.argT2 = argT2;

    }

    public T1 getArgT1(){
        return argT1;
    }

    public void setArgT1(T1 argT1){
        this.argT1 = argT1;
    }

    public T1 getArgT2(){
        return argT1;
    }

    public void setArgT2(T1 argT1){
        this.argT1 = argT1;
    }

}
