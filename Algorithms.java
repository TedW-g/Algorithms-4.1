import java.util.ArrayList;
import java.util.HashMap;
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
        int small = small();
        int sum = sum();
        double mean = mean();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigit);
        System.out.println(fiveOhOne);
        System.out.println(big);
        System.out.println(small);
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(mode);
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
            if (s.nextInt() > big) big = s.nextInt();
        }
        return big;
    }

    public static int small() throws FileNotFoundException
    {
        s = new Scanner(f);
        int small = 0;
        while (s.hasNext())
        {
            if (s.nextInt() < small) small = s.nextInt();
        }
        return small;
    }
    
    public static int sum() throws FileNotFoundException
    {
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext())
        {
            sum += s.nextInt();
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException
    {
        s = new Scanner(f);
        double a = 0.0;
        int mean = 0;
        while (s.hasNext())
        {
            a++;
            mean  += s.nextInt();
        }
        return (mean / a);
    }

    public static int mode() throws FileNotFoundException
    {
 Scanner s = new Scanner(f);
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    int mode = 0;
    int maxCount = 0;

    // Count occurrences of each number
    while (s.hasNextInt()) {
        int number = s.nextInt();
        frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        if (frequencyMap.get(number) > maxCount) {
            maxCount = frequencyMap.get(number);
            mode = number;
        }
    }

    s.close(); // Always close the Scanner to release resources
    return mode;
}
    }