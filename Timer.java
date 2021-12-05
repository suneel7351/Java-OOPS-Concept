class Timer {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread obj2 = new Thread(obj1);
        obj2.start();
        try {
            Thread.sleep(10000);
            System.out.println("Time completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Thread1 implements Runnable {
    int h = 5, m = 50, s = 49;

    public void run() {
        System.out.print("\033[H\033[2J");
        for (int i = 1; i <= 10; i++) {
            if (s >= 60) {
                m++;
                s = 00;
            }
            if (m >= 60) {
                h++;
                m = 00;
            }
            System.out.println(h + ":" + m + ":" + s);
            s++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.print("\033[H\033[2J");
        }
    }
}