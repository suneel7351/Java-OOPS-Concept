class ThrowException {
    public static int result(int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) throws Exception {
        try {
            int c = result(5, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}