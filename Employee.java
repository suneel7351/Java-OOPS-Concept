class Employee {

    public static void main(String ar[]) {
        EmployeeRecord[] e = new EmployeeRecord[5];
        e[0] = new EmployeeRecord(123, "John Doe");
        e[1] = new EmployeeRecord(345, "Jane Doe");
        e[2] = new EmployeeRecord(99, "John John Stiles");
        e[3] = new EmployeeRecord(180, "Richard Roe");
        e[4] = new EmployeeRecord(25, "Joe Public");
        for (int i = 0; i < 5; i++) {
            e[i].display();
        }
    }
}

class EmployeeRecord {
    int id;
    String name;

    EmployeeRecord(int empId, String empName) {
        this.id = empId;
        this.name = empName;
    }

    void display() {
        System.out.println("The Employee name is " + name + " and id is " + id);
    }
}