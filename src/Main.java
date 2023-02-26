public class Main {
    public static void main(String[] args) {

        int cost = 13676; // цена билета
        int costMile = 20; // сколько рублей стоит 1 миля
        int mile = cost / costMile;

        System.out.println("Вам начислено " + mile + " бесплатных миль за купленный билет");
    }
}