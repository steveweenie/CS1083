import java.util.*;
class PrintCustomizedDiamond
{
    public static void main(String[] args)
    {
        char letter;
        int size,i,j,k,even=2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a letter: ");
        letter=input.next().charAt(0);
        while(true)
        {
            System.out.print("Enter a size (even number no less than 6): ");
            size=input.nextInt();
            if(size%2==0 && size>=6)
                break;
        }
        System.out.println();

        for(j=1;j<=size/2;j++)
        {
            //print spaces
            for(k=0;k<(size/2-j);++k)
                System.out.print(" ");
            for(k=0;k<even;++k)
                System.out.print(letter);
            even+=2;
            System.out.println();
        }
        even-=2;
        for(j=size/2;j>=1;j--)
        {
            //print spaces
            for(k=0;k<(size/2-j);++k)
                System.out.print(" ");
            for(k=0;k<even;++k)
                System.out.print(letter);
            even-=2;
            System.out.println();
        }
    }
}