package second_task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class TrainManager {
    private ArrayList<Train> trains;
    private SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm");

    public TrainManager() {
        trains = new ArrayList<>();
    }

    public void addTrain(Train t)
    {
        this.trains.add(t);
    }

    public void generateFiveTrains()throws ParseException
    {
        addTrain(new Train("Moscow",5,format.parse("11.12.2019 at 12:15")));
        addTrain(new Train("Vitebsk",2,format.parse("10.12.2019 at 12:30")));
        addTrain(new Train("Mogilev",1,format.parse("08.12.2019 at 15:00")));
        addTrain(new Train("Grodno",3,format.parse("29.11.2019 at 12:00")));
        addTrain(new Train("Moscow",4,format.parse("10.12.2019 at 10:00")));
    }

    public void sortByNumbers()
    {
        System.out.println("Sort by number:");
        trains.sort(new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumber()-o2.getNumber();
            }
        });
    }

    public void getTrainByNumber(int number)
    {
        System.out.println("Query result: ");
        Train query = trains.stream().filter(train->number==train.getNumber()).findAny().orElse(null);
        System.out.println(query.toString());
    }

    public void sortByDestination()
    {
        System.out.println("sort by destination: ");
        trains.sort(new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if(!o1.getDestination().equals(o2.getDestination()))
                {
                    return o1.getDestination().compareTo(o2.getDestination());
                }
                return o1.getDepartureTime().compareTo(o2.getDepartureTime());
            }
        });
    }

    public void printAll()
    {
        System.out.println();
        for(Train t:trains)
        {
            System.out.println(t.toString());
        }
        System.out.println();
    }


}
