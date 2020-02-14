public class GenericClass<M> {
    private M m;
    public void set(M value){
        this.m = value;
    }
    public void get(){
        System.out.println(m);
    }
    public static <O> void printArrayContent(O[] arrayInput){
        for(O value: arrayInput){
            System.out.print(value+" ");
        }
        System.out.println("\n");
    }
}