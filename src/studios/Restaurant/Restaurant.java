package studios.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        MenuItem newItem1 = new MenuItem("Garlic Linguine", 12.00, "garlic butter noodles", "main", true, today);
        MenuItem newItem2 = new MenuItem("spaghetti alla puttanesca", 12.00, "spicy tomato pasta", "main", true, today);
        MenuItem newItem3 = new MenuItem("ravioli", 12.00, "stuffed with cheese", "main", true, new Date());

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourLaunchMenu = new Menu(today, startingMenu);

        ourLaunchMenu.addItem(newItem1);
        ourLaunchMenu.printItem(newItem1);
    }
}
