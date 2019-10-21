package fourth_task;

import java.util.List;

public class Main {
    public static void main(String... args){

        Voucher v1 = new Voucher(Type.EXCURSION, Food.FULL, Transport.TRAIN,7);
        Voucher v2 = new Voucher(Type.CRUISE, Food.ALL_INC, Transport.SHIP,14);
        Voucher v3 = new Voucher(Type.RELAX, Food.ALL_INC, Transport.BUS,21);
        Voucher v4 = new Voucher(Type.EXCURSION, Food.DINNER, Transport.TRAIN,5);
        Voucher v5 = new Voucher(Type.SHOPPING, Food.BREAKFAST, Transport.CAR,5);
        Voucher v6 = new Voucher(Type.TREATMENT, Food.FULL, Transport.AIRPLANE, 30);
        Voucher v7 = new Voucher(Type.RELAX, Food.FULL, Transport.AIRPLANE,14);

        Agency agency = new Agency("1st agency",v1,v2,v3,v4,v5,v6,v7);

        AgencyManager manager = new AgencyManager(agency);

        System.out.println("All vouchers: ");
        System.out.println(agency);

        manager.sortVouchers();
        System.out.println("Sorted by days: ");
        System.out.println(agency);

        System.out.println("Vouchers with 5 days: ");
        List<Voucher> vl1 = manager.getVouchersByDays(5);
        for(Voucher v:vl1){
            System.out.println(v);
        }

        System.out.println("Vouchers with all-inclussion food service: ");
        List<Voucher> vl2 = manager.getVouchersByFood(Food.ALL_INC);
        for(Voucher v:vl2){
            System.out.println(v);
        }

        System.out.println("Vouchers with relax conditions: ");
        List<Voucher> vl3 = manager.getVouchersByType(Type.RELAX);
        for(Voucher v:vl3){
            System.out.println(v);
        }

        System.out.println("Vouchers with airplane transport service: ");
        List<Voucher> vl4 = manager.getVouchersByTransport(Transport.AIRPLANE);
        for(Voucher v:vl4){
            System.out.println(v);
        }
    }
}
