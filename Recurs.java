//@author Jawaun Brown

public class Recurs {
    
    public static void main (String[] args) {
        
        System.out.println ("Printing the top 10 numbers: ");
        printNumbers(10);
        
        System.out.println ("15 times 20 is " + mult (15, 20));
        
        System.out.println (reverseString("silly"));
        
        int[] arr={9,3,5,4,7};
        System.out.println("Min of array: "+min(arr, 0));
    }
    
    
    /////////////////////////////////////////////////////////////////////////
    public static void printNumbers (int n) {
        //Print the first n numbers starting from 1
        if (n > 0){
            //	    System.out.println(n);
            printNumbers(n-1);
            System.out.println(n);
        }
        //	 printNumbers(n);
    }
    
    /////////////////////////////////////////////////////////////////////////
    public static int mult (int n, int m) {
        if (n >0) return mult(n-1, m) + m;
        else if (n == 0) return 0;
        else return mult(-m, -m);
    }
    
    /////////////////////////////////////////////////////////////////////////
    public static String reverseString(String s) {
        int slen = s.length();
        if(slen<=1){
            return s;
        }
        return reverseString(s.substring(1))+ s.charAt(0);
        /* char [] charray = new char[(s.length())];
         if(s.substring(1).length() == 1){
         charray [0] = (s.charAt(0));
         
         }
         else{
         charray[s.length()-1] = s.charAt(0);
         reverseString(s);
         s = s.substring(1);
         }
         return new String (charray);*/
    }
    
    /////////////////////////////////////////////////////////////////////////
    public static int min(int[] arr, int n)
    {
        // you should find the minimum of the array
        if(n==arr.length-1){
            return n-1;
        }
        if(arr[0]>arr[n]){
            arr[0]=arr[n];
        }
        min(arr, n+1);
        n=arr[0];
        return n; //this is wrong
    }
    
}
