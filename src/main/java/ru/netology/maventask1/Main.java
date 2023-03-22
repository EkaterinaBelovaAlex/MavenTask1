package ru.netology.maventask1;

import ru.netology.maventask1.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(500000, true);
        System.out.print(bonus);


    }
}