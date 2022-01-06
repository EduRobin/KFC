package KFC;

public class FastFood {

    String nazev;
    int countOfChicken;

    public FastFood(String nazev) {
        this.nazev = nazev;
        this.countOfChicken = 0;
    }

    public void getPlusChicken(int amount) {
        int storage = countOfChicken - amount;
        if(storage <= 0) {
            countOfChicken += amount * 2;
            System.out.println("Incrasing to: " + countOfChicken);
        }
        countOfChicken -= amount;
        System.out.println("Decreasing to: " + countOfChicken);
    }

    public void sellChicken(int amount) {
        getPlusChicken(amount);
    }
}
