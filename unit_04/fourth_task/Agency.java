package fourth_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agency {
    private List<Voucher> vouchers;
    private String title;

    public Agency(String title, Voucher... vouchers) {
        this.vouchers = new ArrayList<>();
        this.title = title;
        for(Voucher voucher: vouchers){
            this.vouchers.add(voucher);
        }
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency agency = (Agency) o;
        return Objects.equals(vouchers, agency.vouchers) &&
                Objects.equals(title, agency.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vouchers, title);
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append("Agency '"+this.title+"'\n");
        for(Voucher voucher:vouchers){
            buff.append(voucher.toString()+"\n");
        }
        return buff.toString();
    }
}
