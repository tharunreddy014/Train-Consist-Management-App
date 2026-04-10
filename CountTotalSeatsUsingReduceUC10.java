import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " -> Capacity: " + capacity);
    }
}

public class CountTotalSeatsUsingReduceUC10 {

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        System.out.println("\nProgram executed successfully!");
    }
}
