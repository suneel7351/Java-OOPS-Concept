public class Static {
    static {
        System.out.println(
                "This is  static method before main method in same class : In a class staic methods execute top to bottom");
    }

    public static void main(String[] args) {
        Static obj = new Static(n);
    }

    static int a = 10;
    static int n;
    int b = 5;
    int c;

    public Static(int m) {
        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }

    {
        b = 30;
        n = 20;
    }
    static {
        a = 60;
        System.out.println("This is static method ");
    }
    static {
        System.out.println("This is another static method in same class");
    }
}