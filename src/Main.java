public class Main {
    public static void main(String[] args) {
        int account = 100;
        int payment = 300;
        int bonus;
        if (payment > 1000) {
            bonus = (payment / 100);
        } else {
            bonus = 0;
        }
        int accountAfterPayment = (account + payment + bonus);

        System.out.println("Сумма на счету после пополнения:" + accountAfterPayment + ", из них бонусов:" + bonus);
    }

    ;

}
