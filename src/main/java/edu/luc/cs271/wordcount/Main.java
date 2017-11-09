package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    
    // DONE complete this main program
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  Map<String,Integer> map = new HashMap<>();
  WordCounter counter = new WordCounter(map);
  
  counter.countWords(input);
  
  int size = counter.getCounts().size();
  
  ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(size);
  
  for(Map.Entry<String,Integer> entry : map.entrySet()){
    list.add(entry);
  }
    
  Collections.sort(list, new DescendingByCount());
  
  for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i).getKey()+" has a frequency of :"+list.get(i).getValue());
    
  }
  }
}
