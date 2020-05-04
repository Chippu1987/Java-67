import java.util.HashMap;
import java.util.Scanner;

// Class to represent a pair
class Pair 
{
 int first, second;
 Pair(int f, int s) {
  first = f;
  second = s;
 }
}

class MyClass
{
  boolean findPairs(int arr[]) 
  {
    // Create an empty Hash to store mapping from mul to pair indexes
    HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
    int n = arr.length;
    // Traverse through all possible pairs of arr[]
    for(int i = 0; i < n; i++) 
	{
     for(int j = i + 1; j < n; j++) 
	 {
      // If mul of current pair is not in hash, then store it and continue to next pair
      int mul = arr[i] * arr[j];
      if(!map.containsKey(mul))
        map.put(mul, new Pair(i, j));
      else // Else (mul already present in hash)
      {
	   // Find previous pair
	   Pair p = map.get(mul);
	  // Since array elements are distinct, we don't
      // need to check if any element is common among pairs
      System.out.println("(" + arr[p.first] + ", " + arr[p.second] + ") and (" + arr[i] + ", " + arr[j] + ")");
      return true;
     } //else
   }
}
System.out.println("No pairs found");
return false;
}
}

class Case3
{
 //Testing program
 public static void main(String args[]) 
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Please enter the no of elements: ");
   int length = sc.nextInt();

   int arr[] = new int[length];
   for (int i = 0; i < length; i++) {
    System.out.print("enter an element: ");
    int data = sc.nextInt();
    arr[i] = data;
   }
   // int arr[] = { 5, 4, 1, 10, 9, 3, 8};
   MyClass obj = new MyClass();
   obj.findPairs(arr);
 }
}
