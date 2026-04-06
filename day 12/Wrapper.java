public class Wrapper {

    public static Integer test1(String s){
        return Integer.valueOf(s); // boxing
    }
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10); // boxing
        System.out.println("Boxed Integer: " + a);
        Integer b = Integer.valueOf("123456"); // return type -> obj(Integer)
        System.out.println("Boxed Integer from String: " + b);
        Integer c = Integer.parseInt("0987"); // return type -> primitive(int)
        System.out.println("Parsed Integer: " + c);
        /*int a=b.intValue(); // unboxing
        System.out.println("Unboxed Integer: " + a);
        System.out.println(test1("1234")); */// unboxing      
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // true, because of caching
        System.out.println(x.equals(y)); // true, because values are equal 
    }
}
