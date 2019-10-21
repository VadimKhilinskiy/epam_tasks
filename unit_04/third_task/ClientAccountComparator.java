package third_task;

import java.util.Comparator;

public class ClientAccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getId()-o2.getId();
    }
}
