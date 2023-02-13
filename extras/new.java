
import java.util.*;
class Area{
    public int find(int x,int y)
    {
        int ar=x*y;
        return ar;
    }

   public void display(int a){
       System.out.println("area is \t" +a);
       
       
   }

    public static void main(String[] args) 
    { 
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        Area obj=new Area();
        int arer=obj.find(a,b);
        System.out.println("area is" +arer);
        obj.display(arer);

    } 
        
    
}