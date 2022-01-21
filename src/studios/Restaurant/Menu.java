package studios.Restaurant;


import org.launchcode.java.demos.lsn4classes2.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(item)) {
                toBeRemoved= i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return("this menu was last updated on " + this.lastUpdated);
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

    public void printMenu() {
        System.out.println("Menu");
            for (MenuItem i : items) {
                System.out.println("Description: " + i.getDescription());
            }
    }


//
//        //check if two menu items are equal
//        public boolean equals(MenuItem target) {
//            if (target == this) {
//                return true;
//            }
//
//            if (target == null) {
//                return false;
//            }
//
//            if (target.getClass() != getClass()) {
//                return false;
//            }
//
//            MenuItem item = (MenuItem)target;
//            return MenuItem.getDescription() == item.getDescription();
//        }


//    public static void main(String[] args) {
//        ArrayList<MenuItem> menu = new ArrayList<>();
//
//        MenuItem item = new MenuItem(10.00, "burger", "main course", LocalDate.of(2022, 1, 13));
//        MenuItem itemTwo = new MenuItem(6.00, "salad", "appetizer", LocalDate.of(2019, 1, 13));
//        MenuItem itemThree = new MenuItem(5.00, "cake", "dessert", LocalDate.of(2023, 1, 13));
//        menu.add(item);
//        menu.add(itemTwo);
//        menu.add(itemThree);
//
//    }
}
