import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        List<String> list = new ArrayList<>();
            list.add("0. Выход из программы\n");
            list.add("1. Добавить дело\n");
            list.add("2. Показать дела\n");
            list.add("3. Удалить дело по номеру\n");
            list.add("4. Удалить дело по названию\n");
            while (true){
            System.out.println("Выберите операцию: \n \n" +
                    list.get(0) +
                    list.get(1) +
                    list.get(2) +
                    list.get(3) +
                    list.get(4));
            String input = scanner.nextLine();
            if ("0".equals(input)){
                break;
            }

        }
    }
    public static void addNew() {
        // todo добавление нового дела в список
        System.out.println("Введите название задачи: ");
        String taskName = scanner.nextLine();
        System.out.println("Добавлено!\nВаш список дел:\n" + "1. " + taskName);
    }

    public void showCase(){
        // todo вывод всех дел с нумерацией
        System.out.println("Ваш список дел:\n");
    }
    public void deleteCaseByNumber(){
        // todo удаления дела по его номеру.
        //  Если нет дела с таким номером, об этом нужно написать пользователю
        System.out.println("Введите номер для удаления: ");
    }
    public void deleteCaseByText(){
        // todo удаления дела по его точному тексту.
        //   Если нет дела текст которого совпадает с искомым текстом, об этом нужно написать пользователю;
        System.out.println("Введите задачу для удаления: ");
    }
    public static void exitProgram(){
        // todo выход из программы
    }
}
