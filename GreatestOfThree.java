class GreatestOfThree {
    public static void main(String[] args) {
        int a = 63, b = 45, c = 72;
        if (a > b && a > c) {
            System.out.println(a + " is greater");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
    }

}
