package fourth_task;

public class Main {
    public static void main(String... args)
    {
        ClockManager clockManager = new ClockManager();
        clockManager.setTime(12,30,30);
        System.out.println("Clock{" +
                "hours=" + clockManager.getClock().getHours() +
                ", minutes=" + clockManager.getClock().getMinutes() +
                ", seconds=" + clockManager.getClock().getSeconds() +
                '}');
        clockManager.addTime(13,40,40);
        System.out.println("Clock{" +
                "hours=" + clockManager.getClock().getHours() +
                ", minutes=" + clockManager.getClock().getMinutes() +
                ", seconds=" + clockManager.getClock().getSeconds() +
                '}');
    }

}
