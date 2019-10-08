package third_task;

public class CounterRunner {
    private Counter counter;

    public Counter getCounter() {
        return counter;
    }

    public CounterRunner() {
        this.counter = new Counter();
    }

    public void increase() {
        counter.setCurrentTime(counter.getCurrentTime()+1);
        if(counter.getCurrentTime()>counter.getRightBorder())
        {
            counter.setCurrentTime(counter.getRightBorder());
        }
    }

    public void decrease() {
        counter.setCurrentTime(counter.getCurrentTime()-1);
        if(counter.getCurrentTime()<counter.getLeftBorder())
        {
            counter.setCurrentTime(counter.getLeftBorder());
        }
    }
}
