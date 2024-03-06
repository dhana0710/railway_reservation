public class TrainReservationCheck {

    public static void bookTickerCheck(Passenger p){
        BookingServer bs=new BookingServer();
        if((p.getBp().equals('L') && BookingServer.aLB>0) || (p.getBp().equals('M') && BookingServer.aMB>0) || (p.getBp().equals('U') && BookingServer.aUB>0)  ){

            if(p.getAge()>60 && BookingServer.aLB>0|| p.getCname()!=null && BookingServer.aLB>0 || p.getBp().equals('L')){
                System.out.println("Lower Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sLBP.get(0)),"L");
                BookingServer.sLBP.remove(0);
                BookingServer.aLB--;
            }else if(p.getBp().equals('M')){
                System.out.println("Middle Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sMBP.get(0)),"M");
                BookingServer.sMBP.remove(0);
                BookingServer.aMB--;
            }else if(p.getBp().equals('U')){
                System.out.println("Upper Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sUBP.get(0)),"U");
                BookingServer.sUBP.remove(0);
                BookingServer.aUB--;
            }
        }else if(BookingServer.aLB>0 || BookingServer.aMB>0 || BookingServer.aUB>0){
            if(p.getAge()>60 && BookingServer.aLB>0|| p.getCname()!=null && BookingServer.aLB>0 || BookingServer.aLB>0 ){
                System.out.println("Lower Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sLBP.get(0)),"L");
                BookingServer.sLBP.remove(0);
                BookingServer.aLB--;
            }else if(BookingServer.aMB>0){
                System.out.println("Middle Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sMBP.get(0)),"M");
                BookingServer.sMBP.remove(0);
                BookingServer.aMB--;
            }else if(BookingServer.aUB>0){
                System.out.println("Upper Berth Given");
                bs.bookTicketsRegular(p,(BookingServer.sUBP.get(0)),"U");
                BookingServer.sUBP.remove(0);
                BookingServer.aUB--;
            }
        }else if(BookingServer.aRAC>0){
            System.out.println("RAC Given");
            bs.bookTicketsRac(p,(BookingServer.sRAC.get(0)),"RAC");
            BookingServer.sRAC.remove(0);
            BookingServer.aRAC--;
        }else if(BookingServer.aWL>0){
            System.out.println("Waiting List Given");
            bs.bookTicketsWl(p,(BookingServer.sWL.get(0)),"WL");
            BookingServer.sWL.remove(0);
            BookingServer.aWL--;
        }else {
            System.out.println("No Ticket Available");
            return;
        }
//
    }


}
