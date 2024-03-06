import java.util.Scanner;

public class BookingController {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        boolean portal=true;

        while(portal){
            System.out.println("Welcome to railway......\n1. For Booking \n2. For Cancelation \n3. Check available Tickets\n4. Booked Tickets\n5.Exit");
            System.out.println("Enter your choice :");
            int choice=sc.nextInt();
            switch ((int)choice){
                case 1:
                {
                    System.out.println("Enter your name :");
                    String name=sc.next();
                    System.out.println("Enter your age:");
                    int age=sc.nextInt();
                    System.out.println("Enter your Gender {M,F}:");
                    Character gen=sc.next().charAt(0);
                    boolean fHaveChild=false;
                    String cname=null;
                    int cage=0;
                    if(gen.equals('F')){
                        System.out.println("1. If you have a child less than 5, Press 1\n2. If you haven't a child, press 2");
                        int gchoice=sc.nextInt();
                        if(gchoice==1){
                            fHaveChild=true;
                            System.out.println("Enter your Child Name :");
                            cname=sc.next();
                            System.out.println("Enter your Child age :");
                            cage=sc.nextInt();
                        }
                    }
                    System.out.println("Enter your berth preference {L,M,U}:");
                    Character berthP=sc.next().charAt(0);
                    Passenger p1;
                    if(fHaveChild){
                        p1=new Passenger(name,age,gen,berthP,cname,cage);
                    }else {
                        p1=new Passenger(name,age,gen,berthP);
                    }

                    TrainReservationCheck.bookTickerCheck(p1);
                    break;
                }
                case 2:
                {
                    CancelReservation cr=new CancelReservation();
                    System.out.println("Enter your passenger ID :");
                    cr.cancelTicket(sc.nextInt());
                    break;



                }
                case 3:
                {
                        BookingServer bs=new BookingServer();
                        bs.ticketAvailability();
                        break;
                }
                case 4:
                {
                    BookingServer bs=new BookingServer();
                    bs.passengerDetails();
                    break;
                }
                case 5:
                {
                    portal=false;
                    System.out.println("Thank you for your time");
                }
            }




        }


    }
}
