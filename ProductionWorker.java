package work;

<<<<<<< HEAD


=======
>>>>>>> 81e1a6aa66b541d9a3e0b92d3c12971b28f6478f


public class ProductionWorker extends Employee
{
    // instance variable
    
    private int Shift;
    private double payRate;

    public ProductionWorker(String n, int num, String date, int s, double p)
    {
        super(n, num, date); // for emplyee name ,num, date
        
        Shift = s;
        payRate = p;


    }

    public int getShift()
    {
        return Shift;
    }

    public double getRate()
    {
        return payRate;
    }

    @Override
    public String toString()
    {
        return "Name: " + super.getName() + "\nNumber: " + super.getNumber() + "\nHire date: " + super.getDate() + 
        "\nShift: " + this.getShift() + "\nPay rate: " + this.getRate();
    }
}
