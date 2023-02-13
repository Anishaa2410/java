package com.dit.java.oops;

public class Employee {
    private int  id; 
    private String name;
    private float basic_sal;
    private String com;
    float hra,da,ta,ma,pf,gs,net;
        
    Employee(){
        this.com="xyz";
    }
    
    Employee(int id,String name, float basic_sal){
        this();
        this.id=id;
        this.name=name;
        this.basic_sal=basic_sal;
    }

    public void sal(){
        hra=(0.3f*basic_sal);
        da=(0.2f*basic_sal);
        ta=(0.1f*basic_sal);
        ma=(0.15f*basic_sal);
        pf=(0.05f*basic_sal);
        gs=hra+da+ta+ma+basic_sal;
        net=gs-pf;
    }

    public void sal_print(){
        System.out.println("Salary Slip of " +this.name);
        System.out.println("*******************");
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("TA : "+ta);
        System.out.println("MA : "+ma);
        System.out.println("PF : "+pf);
        System.out.println("GROSS SALARY : "+gs);
        System.out.println("NET SALARY : "+net);
    }
    public void print(){
        System.out.println("id : " +id+ "\nname : "+name+"\nsalary : "+basic_sal+ "\ncompany name : "+com);
        System.out.println("*******************");
    }
    public static void main(String[] args) {
        Employee e1=new Employee(05,"Ram",15000);
        e1.print();
        e1.sal();
        e1.sal_print();
    }
}