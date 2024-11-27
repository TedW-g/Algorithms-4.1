import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms 
{
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException 
    {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigit = twoDigit();
        int fiveOhOne = fiveOhOne();
        int big = big();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigit);
        System.out.println(fiveOhOne);
        System.out.println(big);
        s.close();
    }

    public static int odds() throws FileNotFoundException
    {
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) 
        {
            if (s.nextInt() % 2 != 0) odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException
    {
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext())
        {
            if (s.nextInt() % 2 == 0) evens++;
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException
    {
        s = new Scanner(f);
        int twoDigit = 0;
        while (s.hasNext())
        {
            if ((s.nextInt() >= 10) && (s.nextInt() <= 99)) twoDigit++;
        }
        return twoDigit;
    }

    public static int fiveOhOne() throws FileNotFoundException
    {
        s = new Scanner(f);
        int fiveOhOne = 0;
        while (s.hasNext())
        {
            if (s.nextInt() > 500) fiveOhOne++;
        }
        return fiveOhOne;
    }

    public static int big() throws FileNotFoundException
    {
        s = new Scanner(f);
        int big = 0;
        while (s.hasNext())
        {
            if (s.nextInt() > big)
            big = s.nextInt();
        }
        return big;
    }

}