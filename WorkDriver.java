package work;



public class WorkDriver 
{

    public static void main(String[] args) 
    {        
        Scanner input = new Scanner(System.in);

        String n; 
        int num; 
        String date;
        int shift;
        double pay;
        
        System.out.println("Enter name");
        n = input.nextLine();

        System.out.println("Enter number");
        num = input.nextInt();
        input.nextLine();  // to enter \n

        System.out.println("Enter Hire date");
        date = input.nextLine();

        System.out.println("Enter shift");
        shift = input.nextInt();

        System.out.println("Enter pay rate");
        pay = input.nextDouble();
        
        ProductionWorker w = new ProductionWorker(n, num,  date, shift,pay);
        System.out.println(w.toString());

    }
}
