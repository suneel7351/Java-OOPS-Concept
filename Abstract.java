
class Abstract {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.input(188, "Suneel");
        obj.display();
        obj.greet();
        Child2 obj2 = new Child2();
        obj2.greet();
        obj2.display();
        Parent obj3 = new Child();
        obj3.show();
        Parent obj4 = new Child2();
        obj.show();
    }
}

abstract class Parent {
    int RollNo;
    String Name;

    void input(int r, String n) {
        RollNo = r;
        Name = n;
    }

    abstract void display();

    abstract void greet();

    void show() {
        System.out.println("Hello, this is show method in parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("RollNo " + RollNo + " Name " + Name);
    }

    void greet() {
        System.out.println("Good Morning");
    }
}

class Child2 extends Parent {
    void greet() {
        System.out.println("Good Afternoon");
    }

    void display() {
        System.out.println("something");
    }
}