import java.util.Scanner;
public class HelpFromSam {
    static void finMinimumHelp(int n)
    {
        int help=1;
        int points=1;
        while(points<n)
        {
            points*=2;
        }
        if(points!=n)
            help++;
        System.out.println(help);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        finMinimumHelp(n);
    }
}
