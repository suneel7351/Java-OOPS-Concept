
class ListOfStudent {
    public static void main(String ar[]) {
        String name[] = { "Aditya", "Arjun", "Abhishek", "Ravi", "Shivam" };
        int RollNo[] = { 135, 142, 67, 175, 183 };
        char section[] = { 'A', 'C', 'A', 'B', 'C' };
        for (int i = 0; i < name.length; i++) {
            System.out.println("The RollNo of " + name[i] + " is " + RollNo[i] + " and his section is " + section[i]);
            ;
        }
    }
}
