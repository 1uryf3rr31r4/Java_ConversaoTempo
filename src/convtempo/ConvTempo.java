package convtempo;

import java.util.Scanner;

public class ConvTempo
{
    public static void main(String[] args)
    {
        float hh,mm, ss, rr, total;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Indique tempo de fabricação: ");
        total = input.nextInt();
        
        hh = total / 3600;
        rr = total % 3600;
        mm = rr / 60;
        ss = rr % 60;
        
        System.out.println("Tempo: "+hh+" H "+mm+" M "+ss+" S");
        
        
    
        
        
    }
    
}
