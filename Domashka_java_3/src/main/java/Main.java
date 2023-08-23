import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер: 1");
        double m = 10.5;
        double n = 10.45;

        double diffM = Math.abs(m - 10);
        double diffN = Math.abs(n - 10);

        if (diffM < diffN) {
            System.out.println("Число "+m+" ближе к 10.");
        } else if (diffN < diffM) {
            System.out.println("Число "+n+" ближе к 10.");
        } else {
            System.out.println("Числа "+m+" и "+n+" одинаково близки к 10.");
        }

        System.out.println("Задача номер: 2");
        Random rand = new Random();
        int a = rand.nextInt(28801);

        System.out.println("Осталось секунд: "+a);

        int hours=a/3600;
        if (hours>=1) {
            System.out.println("Осталось " +hours+ (hours==1?" час":" часа"));
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
