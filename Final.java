class Final {
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.input("suneel");
    }
}

final class FinalKeyword {
    final int RollNo = 7;
    String name;

    final void input(String name) {
        System.out.println("RollNo " + RollNo + name + " name");
    }
}

class FinalB extends FinalKeyword {
    int RollNo = 5;
    String Name = "Suneel";

    void display() {
        System.out.println("name " + Name + "Rollno " + RollNo);
    }
}