import java.io.*;
import java.util.*;
public class Case4
{
  static Scanner sc = new Scanner(System.in);
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]) throws Exception 
  {
    System.out.print("enter no of managers: ");
    int n = sc.nextInt();
    System.out.print("enter no of subordinates: ");
	int m = sc.nextInt();
    
	System.out.println(">>>Enter Manager Details");

    Manager[] managers = new Manager[n];
    for(int i = 0; i < n; i++) {
      System.out.print("enter Manager-"+(i+1)+" name: ");
      managers[i] = new Manager(sc.next(), new ArrayList<Subordinate>());
    }
    
	System.out.println(">>> Subordinate Details");
    for(int i = 0; i < m; i++) {
       System.out.print("enter manager name, subordinate name and age: ");
       String mname = sc.next();
	   String sub_name = sc.next();
       int sub_age = sc.nextInt();

       for(int j = 0; j < n; j++) {
         if (managers[j].name.equals(mname)) {
           managers[j].subs.add(new Subordinate(sub_name, sub_age));
           break;
         }
       }
    }
    Arrays.sort(managers);

    for (int i = 0; i < n; i++) {
       out.println(managers[i].name);
       ArrayList<Subordinate> curr_list = managers[i].subs;
	   
       Collections.sort(curr_list);

       for (Subordinate x : curr_list) {
         out.println(x.name + " " + x.age);
       }
    }
    out.close();
}
}

class Manager implements Comparable<Manager> 
{
 String name;
 ArrayList<Subordinate> subs;
 public Manager(String name, ArrayList<Subordinate> subs) {
    this.name = name;
    this.subs = subs;
 }
 public int compareTo(Manager x) {
   return this.name.compareTo(x.name);
 }
}

class Subordinate implements Comparable<Subordinate> {
  String name;
  int age;
  public Subordinate(String name, int age) {
   this.name = name;
   this.age = age;
  }
  public int compareTo(Subordinate x) {
    return Integer.compare(this.age, x.age);
  }
}