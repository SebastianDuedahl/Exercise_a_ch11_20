package Chapter_11_a_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/*
Write a modified version of the Vocabulary program developed in Chapter 10 that uses sets rather than
ArrayLists to store its words. (The program will be noticeably shorter and will run faster!)
 */


public class Exercise_20
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner txt1 = new Scanner(new File("src/Chapter_11_a_20/lillePer"));
        Scanner txt2 = new Scanner(new File("src/Chapter_11_a_20/nikOgJay"));

        Set<String> set1 = getWord(txt1);
        Set<String> set2 = getWord(txt2);
        Set<String> common = getOverLap(set1,set2);

        reportResults(set1,set2,common);


    }
    public static Set<String> getWord(Scanner input)
    {
        Set<String> words = new TreeSet<>();
        while (input.hasNext())
        {
            String next = input.next().toLowerCase();
            words.add(next);

        }
        return words;
    }
    public static Set<String>  getOverLap (Set<String> set1, Set<String> set2)
    {
        Set<String> result = new TreeSet<>();
        result.addAll(set1);
        result.retainAll(set2);

        return result;
    }
    public static void reportResults (Set<String> set1, Set<String> set2, Set<String> common)
    {

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("Overlap = " + common);

        double pct1 = 100*common.size() / set1.size();
        double pct2 = 100*common.size() / set2.size();

        System.out.println("% of file 1 in overlap = " + pct1);
        System.out.println("% of file 2 in overlap = " + pct2);

    }




}
