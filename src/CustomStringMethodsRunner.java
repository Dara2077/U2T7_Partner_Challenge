public class CustomStringMethodsRunner {
    public static void main(String[] args){
        CustomStringMethods methods = new CustomStringMethods();
        String str = methods.starBetween("hello");
        System.out.println(str);
        str = methods.starBetween("TestCode");
        System.out.println(str);
        str = methods.starBetween("CompSci");
        System.out.println(str);
        str = methods.starBetween("Chocolate");
        System.out.println(str);
    }
}
