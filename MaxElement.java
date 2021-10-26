class MaxElement {
    public static void main(String ar[]) {
        int Arr[] = { 34, 35, 12, 23, 0, 15 };
        int max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.println("The maximum element in this array is " + max);
    }
}
