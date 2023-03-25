public interface AdvancedArithmetic
{
    void divisor_sum(int n);
}
class MyCalculator implements  AdvancedArithmetic
{

    public void divisor_sum(int num)
    {

        if(num == 1) {
            System.out.println("1");
        }
        int result = 0;
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                if (i == (num / i))
                    result += i;
                else
                    result += (i + num / i);
            }
        }
        System.out.println((result + num + 1));

    }
}
class money
{
    public static void main(String[] args)
    {
        AdvancedArithmetic pt= new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        pt.divisor_sum(4);
    }
}