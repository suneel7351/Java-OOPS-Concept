
class Abstract {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.input(188, "Suneel");
        obj.display();
    }
}

abstract class P {
    int RollNo;
    String Name;

    void input(int r, String n) {
        RollNo = r;
        Name = n;
    }

    abstract void display();
}

class Q extends P {
    void display() {
        System.out.println("RollNo " + RollNo + " Name " + Name);
    }
}