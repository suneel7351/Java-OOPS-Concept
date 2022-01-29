class NullPointerException {
    public static void main(String[] args) {
        String st = null;
        try {
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                System.out.print(ch + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
