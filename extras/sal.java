public class sal {
    
    // public static void main(String args[]) {
    //     float bs=Float.parseFloat(args[0]);
    //     float hra=(0.3f*bs);
    //     float da=(0.2f*bs);
    //     float ta=(0.1f*bs);
    //     float ma=(0.15f*bs);
    //     float pf=(0.05f*bs);
    //     float gs=hra+da+ta+ma+bs;
    //     float net=gs-pf;
    //     System.out.println("HRA : "+hra);
    //     System.out.println("DA : "+da);
    //     System.out.println("TA : "+ta);
    //     System.out.println("MA : "+ma);
    //     System.out.println("PF : "+pf);
    //     System.out.println("GROSS SALARY : "+gs);
    //     System.out.println("NET SALARY : "+net);
        
    // }

    public static void main(String args[]) {
        int n=4;
        // String a="s";
        // String new1="";
        for(int row=0;row<n;row++){
            for(int column=0;column<n;column++){
                if (row == 0 || row == n - 1 || column == n-1-row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            // for(int i=0;i<3;i++){
            // new1=a+a;
            // System.out.print(new1);}
        }
        
    }
    
}
