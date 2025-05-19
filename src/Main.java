//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price  = 13676; // стоимость билета
        int miles = 20; // рублей за одну бонусную милю

        int bonus = price / miles ; // рассчет бонусных миль
        System.out.println("Начислено миль:"+ bonus);
        }
}