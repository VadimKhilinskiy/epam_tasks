package fourth_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgencyManager {
    private VoucherComparator voucherComparator;
    private Agency agency;

    public AgencyManager(Agency agency) {
        this.voucherComparator = new VoucherComparator();
        this.agency = agency;
    }

    public void sortVouchers(){
        Collections.sort(agency.getVouchers(),voucherComparator);
    }

    public List<Voucher> getVouchersByType(Type type){
        List<Voucher> vouchers = new ArrayList<>();
        for(Voucher voucher:agency.getVouchers()){
            if(voucher.getType() == type){
                vouchers.add(voucher);
            }
        }
        return vouchers;
    }

    public List<Voucher> getVouchersByFood(Food food){
        List<Voucher> vouchers = new ArrayList<>();
        for(Voucher voucher:agency.getVouchers()){
            if(voucher.getFood() == food){
                vouchers.add(voucher);
            }
        }
        return vouchers;
    }

    public List<Voucher> getVouchersByTransport(Transport transport){
        List<Voucher> vouchers = new ArrayList<>();
        for(Voucher voucher:agency.getVouchers()){
            if(voucher.getTransport() == transport){
                vouchers.add(voucher);
            }
        }
        return vouchers;
    }

    public List<Voucher> getVouchersByDays(int numberOfDays){
        List<Voucher> vouchers = new ArrayList<>();
        for(Voucher voucher:agency.getVouchers()){
            if(voucher.getNumberOfDays() == numberOfDays){
                vouchers.add(voucher);
            }
        }
        return vouchers;
    }
}
