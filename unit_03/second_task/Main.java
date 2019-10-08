package second_task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String... args)
    {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm");
            TrainManager trainManager = new TrainManager();
            trainManager.addTrain(new Train("Moscow", 5, format.parse("11.12.2019 at 12:15")));
            trainManager.addTrain(new Train("Vitebsk", 2, format.parse("10.12.2019 at 12:30")));
            trainManager.addTrain(new Train("Mogilev", 1, format.parse("08.12.2019 at 15:00")));
            trainManager.addTrain(new Train("Grodno", 3, format.parse("29.11.2019 at 12:00")));
            trainManager.addTrain(new Train("Moscow", 4, format.parse("10.12.2019 at 10:00")));
            System.out.println();
            for(Train t:trainManager.getTrains())
            {
                System.out.println("Minsk - "+t.getDestination()+
                        "\n #"+t.getNumber()+
                        "\n Time:"+t.getDepartureTime().toString());
            }
            System.out.println();
            System.out.println("Sort by number:");
            trainManager.sortByNumbers();
            System.out.println();
            for(Train t:trainManager.getTrains())
            {
                System.out.println("Minsk - "+t.getDestination()+
                        "\n #"+t.getNumber()+
                        "\n Time:"+t.getDepartureTime().toString());
            }
            System.out.println();
            System.out.print("Enter number of train:");
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Query result: ");
            Train tr = trainManager.getTrainByNumber(sc2.nextInt());
            System.out.println("Minsk - "+tr.getDestination()+
                    "\n #"+tr.getNumber()+
                    "\n Time:"+tr.getDepartureTime().toString());
            System.out.println("sort by destination: ");
            trainManager.sortByDestination();
            System.out.println();
            for(Train t:trainManager.getTrains())
            {
                System.out.println("Minsk - "+t.getDestination()+
                        "\n #"+t.getNumber()+
                        "\n Time:"+t.getDepartureTime().toString());
            }
            System.out.println();
        }
        catch (ParseException ex) {
            System.out.println("Exception: "+ex.getMessage());
        }
    }
}

