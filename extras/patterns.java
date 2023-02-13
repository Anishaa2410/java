
public class patterns{
    public static void main(String args[]) {
        // for(int i=5;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        char a='a';
        for(int i=5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
            a++;
        }

        //Floyds triangle
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }System.out.println();
        }
        
        // //hollow rectangle pattern
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==5 || j==1 || j==5){
        //             System.out.print("*");
        //         }
        //         else System.out.print(" "); 
        //     }
        //     System.out.println();
        // }

        // //pyramid
        // int n=5;
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        

    }
   
}