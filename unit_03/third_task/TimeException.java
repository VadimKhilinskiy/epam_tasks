package third_task;

public class TimeException extends Exception {
    public TimeException(String ex)
    {
        super(ex);
        System.out.println("Out of bounds of counter");
    }

}
