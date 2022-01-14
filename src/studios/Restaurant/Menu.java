package studios.Restaurant;


import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> menu= new ArrayList<>();

        MenuItem item = new MenuItem(10.00, "burger", "main course", LocalDate.of(2022, 1, 13));
        MenuItem itemTwo = new MenuItem(6.00, "salad", "appetizer", LocalDate.of(2019, 1, 13));
        MenuItem itemThree = new MenuItem(5.00, "cake", "dessert", LocalDate.of(2023, 1, 13));
        menu.add(item);
        menu.add(itemTwo);
        menu.add(itemThree);

        System.out.println("Menu");
        for (MenuItem i : menu) {
            System.out.println("*****");
            System.out.println("Price: " + i.getPrice());
            System.out.println("Description: " + i.getDescription());
            System.out.println("Category: " + i.getCategory());
            System.out.println("Date: " + i.getDate());
            System.out.println("*****");
        }
        

    }
}
