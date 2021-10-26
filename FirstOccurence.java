class FirstOccurence {
    public static void main(String[] args) {
        int n = 23;
        int Arr[] = { 34, 36, 23, 67, 45, 23, 78, 90, 45, 67, 89, 23 };
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == n) {
                System.out.println("First occurence is " + i);
                break;
            }
        }
    }
}
