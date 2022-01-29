public class CountObject {
    public static void main(String ar[]) {
        count obj1 = new count();
        count obj2 = new count();
        count obj3 = new count();
        count obj4 = new count();
        count obj5 = new count();
        obj1.display();

    }
}

class count {
    static int i;

    count() {
        i++;
    }

    void display() {
        System.out.println("The number of objection in class count is = " + i);
    }
}