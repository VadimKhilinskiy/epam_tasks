package third_task;

import java.sql.Time;

public class Counter {
    private int leftBorder;
    private int rightBorder;
    private int currentTime;

    public Counter()
    {
        leftBorder = 0;
        rightBorder = 10;
        currentTime = 0;
    }

    public Counter(int leftBorder, int rightBorder, int currentTime) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.currentTime = currentTime;
    }

    public void increase() throws TimeException
    {
        this.currentTime++;
        if(this.currentTime>this.rightBorder)
        {
            throw new TimeException(">");
        }
    }

    public void decrease() throws TimeException
    {
        this.currentTime--;
        if(this.currentTime<this.leftBorder)
        {
            throw new TimeException("<");
        }
    }

    public int getCurrentTime()
    {
        return this.currentTime;
    }


}
