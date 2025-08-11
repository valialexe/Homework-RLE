public class RunLengthEncoder {
  public static void main(String args[]) {

    String str1  = "wwwwaaadexxxxxx";
    System.out.println(encode(str1));
    
    String str2  = "aaaabbbccc";
    System.out.println(encode(str2));
    
    String str3  = "";
    System.out.println(encode(str3));
	
	String str4  = "abbbcdddd";
    System.out.println(encode(str4));
  }
  
  public static String encode(String input)
  {
      String result = "";
      
      if(input==null || input.length() == 0)
        return result;
      
      int numberOfRepetitions = 1;
      for (int i=1; i<input.length(); i++)
      {
          if(input.charAt(i) == input.charAt(i-1))
          {
             numberOfRepetitions++;
          }
          else
          {
             result = result + input.charAt(i-1) + numberOfRepetitions;
             numberOfRepetitions = 1;
          }
      }
      result = result + input.charAt(input.length()-1) + numberOfRepetitions;
      return result;
  }
}