package TASK3_3;



public class Main {
    public static void main(String[] args) {
        TouristPlace rajasthan= new TouristPlace("Jaipur","7:00AM to 7:00PM",20);
        rajasthan.addFamousFor("Pink City");
        rajasthan.rate(4);
        rajasthan.rate(5);
        rajasthan.rate(7);
        rajasthan.rate(9);
        rajasthan.rate(19);
        System.out.println(rajasthan.starRating);

    }
}
