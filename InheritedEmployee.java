class InheritedEmployee {
    public static void main(String[] args) {
        Emp obj = new Emp();
        obj.input(23, "suneel", "+91456789987", 23456.345);
        obj.display();
        obj.leave(23);
        Worker obj1 = new Worker();
        obj1.input(135, "Aditya", "+913456767898", 12341.23, "LeathMachine");
        obj1.display();
        obj1.leave(16);
        ManagerClass obj2 = new ManagerClass();
        obj2.input(142, "Arjun", "+912345678998", 34531.145, "Manager");
        obj2.leave(10);
        obj2.display();
        EngineerClass obj3 = new EngineerClass();
        obj3.input(175, "Ravi", "+9176789876", 34562.67, "Web Developer");
        obj3.leave(9);
        obj3.display();
    }
}

class Emp {
    private int EmpId;
    private String name;
    private String phoneNo;
    private double salary;
    private int leave;

    void input(int EmpId, String name, String phoneNo, double salary) {
        this.EmpId = EmpId;
        this.name = name;
        this.salary = salary;
        this.phoneNo = phoneNo;
    }

    void display() {
        System.out.println("EmpId : " + EmpId + " Name : " + name + " Salary : " + salary + " PhoneNo : " + phoneNo);
    }

    void leave(int leave) {
        this.leave += leave;
        System.out.println("You have take " + leave + " leave");
        if (leave > 12) {
            System.out.println("You have exhusted your leave");
        }
    }
}

class Worker extends Emp {
    String MachineName;

    void input(int EmpId, String name, String phoneNo, double salary, String MachineName) {
        input(EmpId, name, phoneNo, salary);
        {
            this.MachineName = MachineName;
        }
    }

    void display() {
        super.display();
        System.out.println("MachineName : " + MachineName);
    }
}

class ManagerClass extends Emp {
    String Manage;

    void input(int EmpId, String name, String phoneNo, double salary, String Manage) {
        input(EmpId, name, phoneNo, salary);
        {
            this.Manage = Manage;
        }
    }

    void display() {
        super.display();
        System.out.println("Manage : " + Manage);
    }
}

class EngineerClass extends Emp {
    String Specialization;

    void input(int EmpId, String name, String phoneNo, double salary, String Specialization) {
        input(EmpId, name, phoneNo, salary);
        {
            this.Specialization = Specialization;
        }
    }

    void display() {
        super.display();
        System.out.println("Specialization : " + Specialization);
    }
}