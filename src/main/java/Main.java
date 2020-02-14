public class Main {
    public static void main(String[] args) {
        //Generic methods
        Integer[] intArray = {12,324,6,7900};
        String[] strArray = {"This","is","just","a","string"};
        GenericClass.printArrayContent(intArray);

        //Generic classes
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.set("Test");
        stringInstance.get();

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.set(1000);
        integerInstance.get();
    }
}