package third_task;

import java.util.Random;

public class Main {
    public static void main(String... args) {
        CounterRunner runner = new CounterRunner();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(runner.getCounter().getCurrentTime()+" ");
            int next = rand.nextInt(4);
            if (next - 2 >= 0) {
                runner.increase();
            }
            else runner.decrease();
        }
    }
}
