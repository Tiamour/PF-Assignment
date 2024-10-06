import java.util.*;
public class Assigmnent{
    static boolean[] seats=new boolean[30];
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int Choice;
          do { 
          System.out.println("\n1.Veiw seat\n2.Book seat\n3.Cancel Seat\n4.Exist");
          System.out.print("Enter your choice :");
          Choice=sc.nextInt();
        switch( Choice){
            case 1:
            Veiwseats();
            break;
            case 2:
            bookseats(sc);
            break;
            case 3:
            Cancelseats(sc);
            break;
            case 4:
            System.out.println("Exiting");
            break;
            default:
            System.err.println("Invalid choice");
            break;
        }
      }while (Choice!=4);

     sc.close();
    }
    static void Veiwseats(){
        System.out.println("Seats: ");
        for(int i=0;i<seats.length;++i){
            System.out.print((i+1)+(seats[i]?" Booked.":" Avaliable. "));
        }System.out.println(" ");
    }
    static void bookseats(Scanner sc){
        System.out.println("Enter the seat(1-30)");
        int seat=sc.nextInt();
        if(seat<1 || seat>30|| seats[seat-1]){
            System.out.println("Invaild or Already Booked");  
        }else{
            seats[seat-1]=true;
            System.out.println("Seat "+seat+" is Booked");
        }
    }
    static void Cancelseats(Scanner sc){
        System.out.println("Enter the Seat number(1-30)");
        int seat=sc.nextInt();
        if(!seats[seat-1]){
            System.out.println("The seat is not booked yet");
        }else{
            seats[seat-1]=false;
            System.out.println("Seat "+seat+" is canceled");
        }
    }
}