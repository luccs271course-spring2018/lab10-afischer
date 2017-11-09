package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture;
  private Map<String,Integer> map = new HashMap<>();
  
  @Before
  public void setUp() {
    // TODO create the SUT instance
    fixture = new WordCounter(map);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(fixture.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {
  
    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("how");
    list.add("how");
    list.add("are");
    Iterator<String> iterator = list.iterator();
    
    fixture.countWords(iterator);
    
    Integer helloCount = 1;
    Integer howCount = 2;
    Integer areCount =1;
    
    assertEquals(map.get("Hello"),helloCount);
    assertEquals(map.get("how"),howCount);
    assertEquals(map.get("are"),areCount);
    assertEquals(map.get("you"),null);
    assertEquals(map.get("why"),null);
  }
}
