package KFC;

public class FastFood {

    final String nazev;
    int countOfChicken;

    public FastFood(String nazev) {
        this.nazev = nazev;
        this.countOfChicken = 0;
    }

    public void getPlusChicken(int amount) {
        int storage = countOfChicken - amount;
        if(storage <= 0) {
            countOfChicken += amount * 2;
            System.out.println(nazev +" storage increasing to: "+ countOfChicken);
        }
        countOfChicken -= amount;
        System.out.println(nazev + " storage decreasing to: " + countOfChicken);
    }

    public void sellChicken(int amount) {
        getPlusChicken(amount);
    }
}
