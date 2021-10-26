class Prime {
    public static void main(String[] args) {
        int number = 13;
        int isPrime = 1;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                isPrime = 0;
            }
        }
        if (isPrime == 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
