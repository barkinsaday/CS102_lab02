import cs1.SimpleURLReader;
public class Test
{
   public static void main(String[] args)
   {
      //PART A 
      System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      System.out.println( "PART A" );
      System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      
      SimpleURLReader testing_reader = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt" );
      System.out.println( testing_reader.getPageContents() );
      System.out.println( "The number of lines: " + testing_reader.getLineCount());
      
      System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      
      //PART B
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "PART B" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
       MySimpleURLReader test_MyReader = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html"  );
       System.out.println( "URL: " + test_MyReader.getURL() );
       System.out.println( "NAME : " + test_MyReader.getName() );
       System.out.println( test_MyReader.getPageContents() );
       
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
      //PART C
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "PART C" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
       int count_Of_CSS = test_MyReader.getNumberOfCSSLinks();
       System.out.println( "The number of CSS links are: " + count_Of_CSS );
       
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      
      //PART D
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "PART D" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
       HTMLFilteredReader reader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
       System.out.println( reader.getPageContents() );
      
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
       
      //PART E
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "PART E" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       
       WordSearch searcher_1 = new WordSearch( "Ankara", " http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
       WordSearch searcher_2 = new WordSearch( "Turkey", " http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
       
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
       System.out.println( "-------------------------------------------------------------------------------------------------------------------------------------" );
      
   }//end main
}//end class