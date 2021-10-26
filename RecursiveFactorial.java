class RecursiveFactorial {
    public static void main(String[] args) {
        Factorial a = new Factorial();
        System.out.println(a.fact(4));
    }

}

class Factorial {
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}