package com.company;
import java.util.*;
public class Employee {
    private static final String a = null;
    public int type1;
    public int salary;
    public int tax;
    public int hour;
    public int gorss;

    public int rssb;
    public int net;


    public static class Month extends Employee{
        public void emp1()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter salary he take per month");
            salary=in.nextInt();

            tax= (salary*30)/100;
            rssb=(salary*3)/100;
            net=salary-(tax+rssb);


        }


    }
    public static class Week extends Employee{
        public void emp2(){
            System.out.println("Enter salary he get per week");
            Scanner in = new Scanner(System.in);
            salary=in.nextInt();
            net=salary;

        }
    }
    public static class Hour extends Employee{

        public  void emp3(){
            System.out.println("Please enter number of hours he works");
            Scanner in = new Scanner(System.in);
            hour = in.nextInt();
            System.out.println("Please enter salary per  hours he works");
            salary = in.nextInt();

            if(hour<=40){
                net = hour*salary;

            }
            else{
                net=(40*salary);
                net=net+((hour-40)*(salary)*10)/100;


            }
        }
    }

    public  static void main(String[] args) {
        int a;

        Hour num = new Hour();
        Week num1=new Week();
        Month num2=new Month();

        //num.emp3();
        Scanner in = new Scanner(System.in);
        System.out.println("Please select type of employee according to type; 1:month,2:weekly,type3:hour");
        num.type1=in.nextInt();
        if(num.type1==1)
        {

            num2.emp1();

            System.out.println("result is"+num2.net);

        }
        else if(num.type1==2){

            num1.emp2();
            System.out.println("result is"+num1.net);
        }
        if(num.type1==3){

            num.emp3();
            System.out.println("result is"+num.net);

        }
        else{
            System.out.println("Error!!!!!");
        }


    }

}