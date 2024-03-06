import java.util.Scanner;

public class CancelReservation {
    //fields
    private BookingServer bs=new BookingServer();

    public void cancelTicket(Integer pId){
        if(bs.passengerTicketlist.containsKey(pId)){
            Passenger p=bs.passengerTicketlist.get(pId);
            int seatNum=p.getSeatNumber();
            String berth=p.getAlloted();
            bs.bookedTicketIdList.remove(pId);
            bs.passengerTicketlist.remove(pId);
            System.out.println("-----------------------------Cancellation Successful");

            if(berth.equals("L")){
                bs.sLBP.add(seatNum);
                bs.aLB++;
            }else if(berth.equals("M")){
                bs.sMBP.add(seatNum);
                bs.aMB++;
            }else if(berth.equals("U")){
                bs.sUBP.add(seatNum);
                bs.aUB++;
            }


            if(bs.racList.size()>0){
                Integer newPId=bs.racList.poll();
                Passenger p1=bs.passengerTicketlist.get(newPId);
                int pRacNumber=p1.getSeatNumber();
                bs.sRAC.add(pRacNumber);
                bs.aRAC++;
                if(bs.wlList.size()>0){
                    Passenger p2=bs.passengerTicketlist.get((Integer) bs.wlList.poll());
                    int pWNumber=p2.getSeatNumber();
                    bs.sWL.add(pWNumber);
                    bs.aWL++;
                    // same code used in TrainReservationCheck
                    p2.setSeatNumber(BookingServer.sRAC.get(0));
                    p2.setAlloted("RAC");
                    BookingServer.sRAC.remove(0);
                    bs.racList.add(p2.getId());
                    BookingServer.aRAC--;
//                    bs.passengerTicketlist.put(p2.getId(),p2);
                }

                TrainReservationCheck trc=new TrainReservationCheck();
                trc.bookTickerCheck(p1);

            }


        }else {
            System.out.println("Please Enter Correct ID...");
            return;
        }




    }


}
