public class Wrapper{
    public static void main(String[] args) {
        int a=25;
        Integer i=Integer.valueOf(a);// Autoboxing
        // Integer i=a;
        System.out.println("Wrapper Class "+i);

        int j=i.intValue();// unboxing
        // int j=i;
        System.out.println("Unboxing"+j);
    }
}