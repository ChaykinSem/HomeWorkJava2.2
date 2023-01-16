public class Main {
    public static void main(String[] args) {

        int x = 300; // Текущий балланс клиента

        int y = 1600; // Сумма пополнения на телефон клиента

        if (y < 1000) {
            x = x + y;
        } else {
            x = x + y + y / 100;
        }
        System.out.println("Итоговый баланс с учетом или отстутствием бонусов:" + x);
    }
}