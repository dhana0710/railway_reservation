import java.util.*;

public class BookingServer {


    static int aLB=2;//availability lower berth
    static int aMB=1;
    static int aUB=1;
    static int aRAC=1;
    static int aWL=1;

    static List<Integer> sLBP=new ArrayList<>(Arrays.asList(1,2));//seatLowerBerthPassenger
    static List<Integer> sMBP=new ArrayList<>(Arrays.asList(1));
    static List<Integer> sUBP=new ArrayList<>(Arrays.asList(1));
    static List<Integer> sRAC=new ArrayList<>(Arrays.asList(1));
    static List<Integer> sWL=new ArrayList<>(Arrays.asList(1));


    //there is no seat allocated to they have wait until any cancel from regular.
    //check availability from (aRAC , aWL)
    static Queue<Integer> racList=new LinkedList<>();
    static Queue<Integer> wlList=new LinkedList<>();

    static List<Integer> bookedTicketIdList=new ArrayList<>();
    static Map<Integer,Passenger> passengerTicketlist=new HashMap<>();

    public void bookTicketsRegular(Passenger p,int seatNum,String allocatedB){
        p.setSeatNumber(seatNum);
        p.setAlloted(allocatedB);
        bookedTicketIdList.add(p.getId());
        passengerTicketlist.put(p.getId(),p);
        System.out.println("Passenger ID: "+p.getId());
        System.out.println("Passenger Name: "+p.getName());
        System.out.println("Passenger Age: "+p.getAge());
        System.out.println("Passenger Gender: "+p.getGender());
        System.out.println("Allocated Berth:  "+seatNum+allocatedB);
        System.out.println("---------------------------------------------Booked successfully");
    }

    public void bookTicketsRac(Passenger p,int seatNum,String RACBerth){
        p.setSeatNumber(seatNum);
        p.setAlloted(RACBerth);
        passengerTicketlist.put(p.getId(),p);
        racList.add(p.getId());
        System.out.println("Passenger ID: "+p.getId());
        System.out.println("Passenger Name: "+p.getName());
        System.out.println("Passenger Age: "+p.getAge());
        System.out.println("Passenger Gender: "+p.getGender());
        System.out.println("Allocated Berth:  "+RACBerth);
        System.out.println("---------------------------------------------RAC Berth Given successfully");
    }

    public void bookTicketsWl(Passenger p,int seatNum,String WlBerth){
        p.setSeatNumber(seatNum);
        p.setAlloted(WlBerth);
        passengerTicketlist.put(p.getId(),p);
        wlList.add(p.getId());
        System.out.println("Passenger ID: "+p.getId());
        System.out.println("Passenger Name: "+p.getName());
        System.out.println("Passenger Age: "+p.getAge());
        System.out.println("Passenger Gender: "+p.getGender());
        System.out.println("Allocated Berth:  "+WlBerth);
        System.out.println("---------------------------------------------RAC Berth Given successfully");
    }

//    --------------------------------------------------------------------------------------------------------------------

    public void passengerDetails(){
        if(!passengerTicketlist.isEmpty()){
            for(Map.Entry<Integer,Passenger> p:passengerTicketlist.entrySet()){
                System.out.println(p.getValue());
            }
//            for(Passenger p:passengerTicketlist.values()){
//
//            }
        }else {
            System.out.println("No one is booked...");
        }
        System.out.println("------------------------------------------------------------------------");
    }
    public void ticketAvailability(){
        System.out.println(aLB+" in lower berth.");
        System.out.println(aMB+" in middle berth.");
        System.out.println(aUB+" in upper berth.");
        System.out.println(aRAC+" in RAC berth.");
        System.out.println(aWL+" in waiting berth.");
        System.out.println("--------------------------------------------------------------------------");
    }



    //------------------------------------------------------------------------------------------------------

}
