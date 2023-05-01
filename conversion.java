import java.util.Scanner;

public class conversion {
    public static void main (String [] args){
        System.out.print("Input the number s minutes:");
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        // m/60=h/24=day/365=y (60*24*365)
        
        int year=0,day=0;
        if(m/(60*24*365)>=1)
        {
            year=m/(60*24*365);
            m=m%(60*24*365);
        }
        day=m/(60*24);
    System.out.println("appx"+year+" years"+day+" days");
    }
    
}
