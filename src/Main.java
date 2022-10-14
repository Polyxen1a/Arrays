import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Лекция
        System.out.println("Лекция");
        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights [0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
// Задание 1
            System.out.println("Задание 1");
            int [] weight = new int [3];
            weight[0] = 1;
            weight[1] = 2;
            weight[2] = 3;

            double [] weight1 = {1.57, 7.654, 9.986};

            int [] weight2 = new int [6];
            weight2[0] = 1;
            weight2[1] = 2;
            weight2[2] = 3;
            weight2[3] = 4;
            weight2[4] = 5;
            weight2[5] = 6;

            double [] weight3 = {37.3, 94.7, 34,9};

            char [] weight4 = {'a', 'b', 'c', 'd'};
// Задание 2
            System.out.println("Задание 2");
            for (int j = 0; j < weight.length; j++) {
                System.out.print(weight[j]);
                if (j != weight.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int j = 0; j < weight1.length; j++) {
                System.out.print(weight1[j]);
                if (j != weight1.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int j = 0; j < weight4.length; j++) {
                System.out.print(weight4[j]);
                if (j != weight4.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
// Задание 3
            System.out.println("Задание 3");
            for (int j = weight.length - 1; j >= 0; j--) {
                System.out.print(weight[j]);
                if (j != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int j = weight1.length - 1; j >= 0; j--) {
                System.out.print(weight1[j]);
                if (j != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int j = weight4.length - 1; j >= 0; j--) {
                System.out.print(weight4[j]);
                if (j != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
// Задание 4
            System.out.println("Задание 4");
            for (int j = 0; j < weight.length; j++) {
                if (weight[j] % 2 != 0) {
                    weight[j] += 1;
                }
            }
            System.out.println(Arrays.toString(weight));
        }
    }
}