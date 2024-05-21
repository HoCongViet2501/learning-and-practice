package designPattern.Factory;

public class Test {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        Candy mintyCandy =CandyFactory.getCandy(CandyType.MINTY);
    }
}
