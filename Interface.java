public class Interface {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Sum(10, 5);

    }
}

interface Parent {
    void Sum(int a, int b);

    void Sub(int a, int b);

    void Multy(int a, int b);

    // This is wrong

    // void Div(int a,int b){
    // System.out.println("Div = "+a+b);
    // }
    void Div(int a, int b);
}

class child implements Parent {
    public void Sum(int a, int b) {
        int c = a + b;
        System.out.println("sum =" + c);
    }

    public void Sub(int a, int b) {
        int c = a - b;
        System.out.println("sum =" + c);
    }

    public void Multy(int a, int b) {
        int c = a * b;
        System.out.println("sum =" + c);
    }

    public void Div(int a, int b) {
        int c = a / b;
        System.out.println("sum =" + c);
    }
}