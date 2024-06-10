import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко",
                "Сосиски", "Сыр", "Колбаса"};
        int[] prices = {50, 150, 80, 300, 400, 500};
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб/шт");
        }

        int[] quantity = new int[6];
        String input;
        int sumProducts = 0;
        int totalSumProducts = 0;
        while (true) {
            System.out.println("Выберите товар и количество или введите end");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Ваша корзина: ");
                for (int i = 0; i < quantity.length; i++) {
                    if (quantity[i] > 0) {
                        sumProducts = quantity[i] * prices[i];
                        totalSumProducts += sumProducts;
                        System.out.println(products[i] + " " + quantity[i] +
                                " " + "шт " + prices[i] + " "+ "руб/шт" + " " +
                                sumProducts + " в сумме");
                    }
                }

                System.out.println("Итого: " + totalSumProducts);
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            quantity[productNumber] += productCount;
            int currentPrice = prices[productNumber];
            totalSumProducts = 0;

        }
    }
    }