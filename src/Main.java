public class Main {
    public static void main(String[] args) {
        int all;
        int balans = 100; // сколько есть на счете
        int adding = 1100; // пополнение рублей

        int bonus;
        if (adding > 1000) {
            bonus = (adding / 100);
            all = (balans + adding + bonus); // Всего денег после пополнения больше чем на 1000

        } else {
            bonus = 0;
            all = (balans + adding);

        }
        System.out.println("После пополнения имеем:");
        System.out.println((bonus) + " бонусные рубли");
        System.out.println((all) + " Итого на балансе");
        // Всего денег после пополнения меньше чем на 1000

        //        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
//       System.out.println((spices / eaters) + " ложек(ка) специй");

    }
}