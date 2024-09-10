import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class time_10 {
    public static void main (String[]args ){



        System.out.println("input your birhtdate y, m, d");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        LocalDate datetdy = LocalDate.now();
        LocalDate birthdate = LocalDate.of(a ,b ,c );
        int years = Period.between(birthdate, datetdy).getYears();


        System.out.println(datetdy);
        System.out.println(birthdate);
        System.out.println(years);

        
    }

   
     

    
}