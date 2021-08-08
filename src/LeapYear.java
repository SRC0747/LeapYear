public class LeapYear {
    int year;
    LeapYear()
    {
        year=0;
    }
    LeapYear(int y)
    {
        year=y;
    }
    void test()
    {
        int a = year%4;
        int b = year%100;
        int c = year%400;
        if (a==0 && b!=0 || c==0)
            System.out.println("The year is Leap year.");
        else
            System.out.println("The year is not Leap year.");
    }
}
class Check
{
    public static void main(String[] args)
    {
        LeapYear ob = new LeapYear(2012);
        ob.test();
    }
}
