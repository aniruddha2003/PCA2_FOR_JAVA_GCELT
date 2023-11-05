public class AutoBoxing{
    public static void main(String[] args) {
        int PrimitiveInt = 42;
        Integer wrappedInt = PrimitiveInt;
        Integer Integerobj = new Integer(23);
        int unboxed = Integerobj;
        System.out.println("Original Integer = "+PrimitiveInt);
        System.out.println("Wrapped Integer = "+wrappedInt);
        System.out.println("Integer Object = "+Integerobj);
        System.out.println("Unboxed Integer = "+unboxed);
    }
}