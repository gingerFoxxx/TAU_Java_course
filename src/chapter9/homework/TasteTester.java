package chapter9.homework;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(100);

        BirthdayCake bdayCake = new BirthdayCake();
        bdayCake.setCandles("!!!");

        WeddingCake wCake = new WeddingCake();
        wCake.setTiers("TIERS");
        System.out.println("One Bday cake with "+ bdayCake.getCandles() + " prise is $" + cake.getPrice() +
                " And a  lot of tiers here named " + wCake.getTiers());
    }
}

