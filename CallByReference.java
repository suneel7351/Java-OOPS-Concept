
class CallByReference {
    public static void main(String[] args) {
        Reference r1 = new Reference();
        r1.length = 50;
        modify(r1);
        r1.display();

    }

    public static void modify(Reference r2) {
        r2.length = 30;
        System.out.println(r2.length);
    }
}

class Reference {
    int length;

    void display() {
        System.out.println(length);
    }
}