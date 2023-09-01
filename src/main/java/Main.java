import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {24, 12, 54, 76, 23, 71, 54, 76, -6, 11, 65, 87};
        hello();
        helloName();
        getElements(array);
    }

    static void hello() {
        int number = new Scanner(System.in).nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    static void helloName() {
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }

    static void getElements(int array[]) {
        System.out.println("Элементы массива, кратные 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
