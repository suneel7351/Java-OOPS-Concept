class ThisKeyword {
    public static void main(String[] args) {
        This s1 = new This(188, "Sunel", 'A');
        This s2 = new This(142, "Arjun", 'C');
        This s3 = new This(135, "Aditya", 'B');
        s1.display();
        s2.display();
        s3.display();
    }
}

class This {
    int RollNo;
    String name;
    char section;

    This(int RollNo, String name, char section) {
        this.RollNo = RollNo;
        this.name = name;
        this.section = section;
    }

    void display() {
        System.out.println("The roll no of " + name + " is " + RollNo + " and his section is " + section);
    }
}