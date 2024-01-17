package week1.day2;

public class Operators {
    public static void main(String[] args) {
        int money = 5000;
        int income = 1000;
        int total = money + income;

        double jobs = 4;
        double lost = 0.5;
        double total_work = jobs / lost;

        int companies = 2;
        int earned = 5000;
        int total_business = companies * earned;

        float halves = 1f;
        float wholes = 0.5f;
        float total_fractions = halves - wholes;

        System.out.println("Total: $" + total);
        System.out.println("Total: " + total_work);
        System.out.println("Total: $" + total_business);
        System.out.println("Total: " + total_fractions);
    }
}
