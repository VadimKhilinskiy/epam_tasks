package fourth_task;

import java.util.Comparator;

public class VoucherComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getNumberOfDays()-o2.getNumberOfDays();
    }
}
