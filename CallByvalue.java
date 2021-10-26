class CallByvalue {
    public static void main(String[] args) {
        Value obj = new Value();
        obj.length = 45;
        obj.display();
        modify(obj.length);
    }

    public static void modify(int length) {
        length = 67;
        System.out.println(length);
    }
}

class Value {
    int length;

    void display() {
        System.out.println(length);
    }
}