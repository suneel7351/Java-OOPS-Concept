class TableUsingExtendThread {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj1.getPriority());
        System.out.println(obj1.getState());
        System.out.println(obj1.getThreadGroup());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
        System.out.println(obj2.getPriority());
        System.out.println(obj2.getState());
        System.out.println(obj2.getThreadGroup());
        System.out.println(obj2.getClass());
        System.out.println(obj2.getStackTrace());
    }
}

class Thread1 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 5 * i);
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("" + 6 * i);
            i++;
        }
    }
}