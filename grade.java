import java.util.Scanner;

public class grade {
    
    public static void main(String [] args)
     {
        
    System.out.print("input your total out of 100:"  );
    Scanner s= new Scanner(System.in);
        int n=s.nextInt();
   if(n<60) System.out.println("your gradeis fail"  );
   else if(n>=60&n<70){System.out.println("your grade is C "  );}
   
   else if(n>=70&n<80){System.out.println("your grade is B"  );}
   
   else if(n>=80&n<90){System.out.println("your grade is B+ "  );}
    
   else if(n>=90&n<95){System.out.println("your grade is A "  );}

   else if(n>=95){System.out.println("your grade is A+ "  );}


}
   
}
