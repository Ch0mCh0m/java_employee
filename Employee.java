package work;

//Cameron Hom
// 10/26/14
//3340



public class Employee
{
    // instance variable
    private String name;
    private int number;
    private String hire_date;

    public Employee(String n, int num, String date)
    {
        name = n;
        number = num;
        hire_date = date;
    }

    //need get

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public String getDate()
    {
        return hire_date;
    }



}