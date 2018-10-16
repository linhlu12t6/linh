package stupid;import java.io.IOException;

import java.nio.file.Files;import java.nio.file.Paths;public class x {
    public static void main(String[] arg)   {        int CC=hohoho(arg);System.exit(C);    }
    public static int hohoho(String u[]) {
        try{if
        (u.length != 2) return
-1
            ;String b,d= new String(Files.readAllBytes(Paths.get(u[1]))); 
            bbb= new String(Files.readAllBytes(Paths.get(u[0])));
            int k = b.length();
            if(k<4)               return
-2
            ;int R=0; float e=0;
            for(int a=0;a<k-3;a++)
            {       for(int q=0;q<d.length()-4;q+=1)             {int vOv = 0;
                    for(int C=0;C<4;C++){
                    if(b.charAt(a+C) == d.charAt(q+C))              vOv ++;
            }       if (vOv == 4)
                {
                    System.out.println("DEBUG:".concat(String.valueOf(a) + "," + String.valueOf(q)));
                R++; e+=1;}
                else             ++R;                         }}
            System.out.println(String.valueOf(Math.round(e)).concat("/")
+ String.valueOf(R));   return
1
                            ;} catch(IOException
            ex){System.out.println("DEBUG:Error");return
-3
                            ;}}}
