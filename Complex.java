class Complex {
    public static void main(String ar[]) {
        ComplexNumber result = new ComplexNumber();
        result.input(5, 3);
        result.display();
    }
}

class ComplexNumber {
    int Real, Img;

    void input(int RealPart, int ImgPart) {
        Real = RealPart;
        Img = ImgPart;

    }

    void display() {
        double resultantOfmagnitude = Math.sqrt((Math.pow(Real, 2) + Math.pow(Img, 2)));
        double resultantOfargument = 180 * 7 * (Math.atan(Img * 1.0 / Real)) / 22;
        System.out.println("The magnitude of the complex number is " + resultantOfmagnitude);
        System.out.println("The argument of the complex number is " + resultantOfargument);
    }
}