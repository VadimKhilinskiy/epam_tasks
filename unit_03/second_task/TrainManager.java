package second_task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class TrainManager {
    private ArrayList<Train> trains;

    public TrainManager() {
        trains = new ArrayList<>();
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train t)
    {
        this.trains.add(t);
    }

    public void sortByNumbers() {
        trains.sort(new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumber()-o2.getNumber();
            }
        });
    }

    public Train getTrainByNumber(int number) {
        Train query = trains.stream().filter(train->number==train.getNumber()).findAny().orElse(null);
        return query;
    }

    public void sortByDestination() {
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


}
