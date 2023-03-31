import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name1 = "Иван Иванов";
        String name2 = "иван иванов";
        CheckUserName(name1, name2);
    }

    public static void CheckUserName(String name1, String name2) {

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Выберете другое имя пользователя");
        }
        if (!name1.equalsIgnoreCase(name2)) {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину: " + name2.length() + " символов.");
            String[] space = name2.split(" ");
            int withOutSpace = name2.length() - space.length;
            withOutSpace += 1;
            System.out.println("А без пробелов ваше имя знаимает: " + withOutSpace + " символов.");
        }
    }
}