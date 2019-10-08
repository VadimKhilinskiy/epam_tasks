package fourth_task;

public class ClockManager {
    private Clock clock;

    public ClockManager() {
        clock = new Clock();
    }

    public Clock getClock() {
        return clock;
    }

    private void checkTime() {
        if(clock.getHours()>Clock.MAX_HOUR||clock.getHours()<Clock.MIN_HOUR)
        {
            clock.setHours(0);
        }
        if(clock.getMinutes()>Clock.MAX_MINUTE||clock.getMinutes()<Clock.MIN_MINUTE)
        {
            clock.setMinutes(0);
        }
        if(clock.getSeconds()>Clock.MAX_SECOND||clock.getMinutes()<Clock.MIN_MINUTE)
        {
            clock.setMinutes(0);
        }
    }

    public void addTime(int hours, int minutes, int seconds) {
        if(clock.getSeconds()+seconds>Clock.MAX_SECOND)
        {
            clock.setSeconds(clock.getSeconds()+seconds-Clock.MAX_SECOND-1);
            clock.setMinutes(clock.getMinutes()+1);
        }else clock.setSeconds(clock.getSeconds()+seconds);
        if(clock.getMinutes()+minutes>Clock.MAX_MINUTE)
        {
            clock.setMinutes(clock.getMinutes()+minutes-Clock.MAX_MINUTE-1);
            clock.setHours(clock.getHours()+1);
        }else clock.setMinutes(clock.getMinutes()+minutes);
        if(clock.getHours()+hours>Clock.MAX_HOUR)
        {
            clock.setHours(clock.getHours()+hours-Clock.MAX_HOUR-1);
        }else clock.setHours(clock.getHours()+hours);
    }

    public void setTime(int hour, int minutes, int seconds) {
        clock.setHours(hour);
        clock.setMinutes(minutes);
        clock.setSeconds(seconds);
        this.checkTime();
    }

    public void setHours(int hours) {
        clock.setHours(hours);
        checkTime();
    }

    public void setMinutes(int minutes) {
        clock.setHours(minutes);
        checkTime();
    }
    public void setSeconds(int seconds) {
        clock.setHours(seconds);
        checkTime();
    }

}
