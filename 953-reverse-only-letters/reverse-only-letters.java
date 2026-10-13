class Solution {
    public String reverseOnlyLetters(String s) 
    {
     int low = 0;
     int high = s.length()-1;
     StringBuilder sb = new StringBuilder(s);

     while(low < high)
     {
        if( ! Character.isLetter(sb.charAt(low))) low ++ ;
        else if (! Character.isLetter(sb.charAt(high))) high -- ;
        else 
        {
            char ch = sb.charAt(low);
            sb.setCharAt(low , sb.charAt(high));
            sb.setCharAt(high , ch);
            low ++;
            high -- ;
        }
     } 
     return sb.toString();  
    }
}