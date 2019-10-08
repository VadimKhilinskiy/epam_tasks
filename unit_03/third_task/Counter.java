package third_task;

import java.sql.Time;

public class Counter {
    private int leftBorder;
    private int rightBorder;
    private int currentTime;

    public Counter() {
        leftBorder = 0;
        rightBorder = 10;
        currentTime = 0;
    }

    public Counter(int leftBorder, int rightBorder, int currentTime) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.currentTime = currentTime;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public void setLeftBorder(int leftBorder) {
        this.leftBorder = leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    public void setRightBorder(int rightBorder) {
        this.rightBorder = rightBorder;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getCurrentTime()
    {
        return this.currentTime;
    }


}
