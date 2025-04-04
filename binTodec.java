public class binTodec {

    public static void binnum(int n) {
        int dec = 0, i = 0, rem;
        while (n > 0) {
            rem = n % 10; // Get the last binary digit
            dec = dec + rem * (int) Math.pow(2, i); // Convert to decimal
            i++;
            n = n / 10; // Remove the last binary digit
        }
        System.out.println("Decimal number is: " + dec);
    }

    public static void main(String[] args) {
        binnum(101); // Example binary number
    }
}