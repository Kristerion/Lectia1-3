public class Main {
    public static void main(String[] args) {

        double getPrice = 50;
        double getTax = 0.2;
        int getQuantity =5;
        double getTotal;
        String getMessage = "I want to buy " + getQuantity+ " shirts!";

        getTotal=getPrice*getQuantity*getTax;

        System.out.println(getMessage);
        System.out.println("Total cost with tax is: " + getTotal);

    }
}