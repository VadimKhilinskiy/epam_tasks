import fifth_task.Shop;
import first_task.StudentManager;
import fourth_task.ClockManager;
import second_task.TrainManager;
import third_task.Counter;
import third_task.TimeException;

import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String... args)
    {
        System.out.print("Enter task: ");
        Scanner sc = new Scanner(System.in);
        try {
            int numberTask = sc.nextInt();
            switch (numberTask) {
                case 1:
                    StudentManager studentManager = new StudentManager();
                    studentManager.generateTenStudents();
                    studentManager.printAll();
                    studentManager.printExcellent();
                    break;
                case 2:
                    TrainManager trainManager = new TrainManager();
                    trainManager.generateFiveTrains();
                    trainManager.printAll();
                    trainManager.sortByNumbers();
                    trainManager.printAll();
                    System.out.print("Enter number of train:");
                    Scanner sc2 = new Scanner(System.in);
                    trainManager.getTrainByNumber(sc2.nextInt());
                    trainManager.sortByDestination();
                    trainManager.printAll();
                    break;
                case 3:
                    Counter counter = new Counter();
                    try {
                        Random rand = new Random();
                        for (int i = 0; i < 100; i++) {
                            System.out.print(counter.getCurrentTime()+" ");
                            int next = rand.nextInt(4);
                            if (next - 2 >= 0) {
                                counter.increase();
                            }
                            else counter.decrease();
                        }
                    }
                    catch(TimeException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    ClockManager clockManager = new ClockManager();
                    clockManager.setTime(12,30,30);
                    clockManager.printTime();
                    clockManager.addTime(13,40,40);
                    clockManager.printTime();
                    break;
                case 5:
                    Shop shop = new Shop();
                    shop.generateCustomers();
                    shop.printAll();
                    shop.sort();
                    shop.printAll();
                    shop.chooseFromDiapason(100000000,400000000);
            }
        }
        catch (ParseException ex)
        {
            System.out.println("Incorrect date");
        }
    }
}
