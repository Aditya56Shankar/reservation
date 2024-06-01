import java.util.Scanner;
public class BusReservationSystem{
    public static void main(String[] args){
        int tst=20;
        System.out.println("Total seat availible is 20");
        Scanner sc= new Scanner (System.in);
        System.out.println("Passengers for A to B");
        int AtB = sc.nextInt();
        if (AtB<=20)
        {
            tst=tst-AtB;
            System.out.println("Total seat availible is "+tst);
        }
        else{
            int a = AtB-tst;
            AtB=AtB-a;
            tst-=AtB;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("reservation for "+ a +" person is not available");
        }
        System.out.println("Passengers for A to C");
        int AtC = sc.nextInt();
        if (AtC <=tst)
        {
            tst=tst-AtC;
            System.out.println("total seat availible is " + tst);
        }
        else {
            int b = AtC-tst;
            AtC-=b;
            tst-=AtC;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("reservation for "+ b +" person is not available");
        }
        System.out.println("Passengers from A to D");
        int AtD = sc.nextInt();
        if (AtD<=tst)
        {
            tst=tst-AtD;
            System.out.println("Total seat availible is "+ tst);
        }
        else{
            int c = AtD-tst;
            AtD-=c;
            tst-=AtD;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("reservation for "+ c +" person is not available");
        }
        System.out.println("Journey begin from A to B ");
        System.out.println("reach stopage B");
        tst+=AtB;
        System.out.println("Total seat aval." + tst);
        System.out.println("Passengers for B to C");
        int BtC = sc.nextInt();
        if (BtC<=tst)
        {
            tst-=BtC;
            System.out.println("Total seat availible is "+tst);
        }
        else{
            int d = BtC-tst;
            BtC-=d;
            tst-=BtC;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("Not enough seat availible");
            System.out.println("reservation for "+ d +" person is not available");
        }
        System.out.println("Passengers for B to D");
        int BtD = sc.nextInt();
        if (BtD <=tst)
        {
            tst-=BtD;
            System.out.println("Total seat availible is " + tst);
        }
        else {
            int e= BtD-tst;
            BtD-=e;
            tst-=BtD;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("Not enough seat is availible");
            System.out.println("reservation for "+ e +" person is not available");
        }
        System.out.println("Journey begin from B to C ");
        System.out.println("Reach stopage C");
        tst+=AtC;
        tst+=BtC;
        System.out.println("Total seat aval." + tst);
        System.out.println("Passengers for C to D");
        int CtD = sc.nextInt();
        if (CtD<=tst)
        {
            tst=tst-CtD;
            System.out.println("Total seat availible is"+tst);
        }
        else{
            int f = CtD-tst;
            CtD-=f;
            tst-=CtD;
            System.out.println("only "+ tst +"is aval.");
            System.out.println("Not enough seat availible");
            System.out.println("reservation for "+ f +" person is not available");
        }
        System.out.println("Journey begin from C to D ");
        System.out.println("Reach destination D");
    }
}
