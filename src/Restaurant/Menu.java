package Restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    private ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void menuUpdated() {
        lastUpdated = LocalDate.now();
    }

    public void addMenuItem(MenuItem newMenuItem){
        for (MenuItem item : menuItems){
            if (newMenuItem.equals(item)) {
                System.out.println("Item already included!");
                return;
            }}
        menuItems.add(newMenuItem);
        newMenuItem.setIsNewItem(true);
        menuUpdated();
    }

    public void removeMenuItem(MenuItem wantToDelete){
        menuItems.remove(wantToDelete);
        menuUpdated();
    }

    public void isItemNew (MenuItem menuItem){

    }


    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}







