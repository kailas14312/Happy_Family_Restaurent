package com.happy_family_restaurent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
/**
 *   this is the method having all implementation of project,
 *   also collection of all global variable ,Scanner class 
 *   for user input
 */
public class BillGenerator {
static Scanner sc=new Scanner(System.in);
static double GST;
static double SGST;
static double CGST;
static int  sub1;
static int  sub2;
static int  sub3;
static int  sub4;
static int  sub5;
static int  sub6;
static int  sub7;
static int  sub8;
static int  sub9;
static double result;
static double total;
static int i;
static int counter;
static String item1;
static String item2;
static String item3;
static String item4;
static String item5;
static String item6;
static String item7;
static String item8;
static String item9;
static double p1=300;
static double p2=250;
static double p3=350;
static double p4=150;
static double p5=360;
static double p6=80;
static double p7=90;
static double p8=120;
static double p9=170;
static int user;
static String name;
static String No;
/**
 *  this is the method showing all implimentaion , 
 *  getting costumer details'
 *  also showing Menu , collecting all order..
 *  generating final bill;
 */
 public  void getCustInfo() {
	     System.out.println("                WELCOME TO HAPPY FAMILY RESTAURENT");
	     System.out.println();
	     System.out.println();
	     System.out.println("          -----------------------------------------------");
	
	     System.out.println("                      Kindly Enter Your Name");
	     String name=sc.nextLine();
	     System.out.println("                   Kindly Enter Your Mobile No..");
	     String No=sc.next();
	     
	     System.out.println("        ---------------------------------------------------");
	     System.out.println("                               MENU");
	     System.out.println();
	     System.out.println("                   Kindly Select The Menu Below");
	     System.out.println();
	     System.out.println("         [1] Paneer--[2]--Veg Kolhapuri--[3]--Kadai Paneer ");
	     System.out.println();
	     System.out.println("             [4] Rice--[5]--Butter Nan--[6]--Tandoor");
         System.out.println();
         System.out.println("      [7] Vanila IceCream--[8]--Pista IceCream--[9]--StrawBerry");
         System.out.println();
         System.out.println("                    Press [10] For Submit Order  ");
         System.out.println("  ----------------------------------------------------------------");
         System.out.println("         Kindly Select a NO...above for Confirm Your Order ");
         Order obj=new Order();
         obj.order();
        System.out.println("   ---------------------------------------------------------------");
	    System.out.println("                      Kindly Collect Your Bill");
	    System.out.println("   ---------------------------------------------------------------");
	    System.out.println();
	    System.out.println("                      Banglore Yalahanka New Town                    ");
	    System.out.println("                        Major Akshay Kumar Road ");
	    System.out.println("                              pin -565400  ");
	    System.out.println();
	    System.out.println("   ----------------------------------------------------------------");
	    System.out.println("                             Type Dine In");
	    System.out.println("   -----------------------------------------------------------------");
	    LocalDate date=LocalDate.now();
	    LocalTime time=LocalTime.now();
	    System.out.println("                            Bill No -- 133");
	    System.out.println("                       Delivery Boy -- Rajesh Kumar");
	    System.out.println("                        Todays Date -- "+date);
		System.out.println("                          Time      -- "+time);
	    System.out.println();
	    System.out.println("   -----------------------------------------------------------------");
	    System.out.println();
	    System.out.println("                            Customer Detail");
	    System.out.println("                    ================================");
	    System.out.println("                             "+name);
	    System.out.println("                               "+No);
	    System.out.println();
	    System.out.println("   ------------------------------------------------------------------");
	    System.out.println();
	    System.out.println("     Item                        Quantity                       Amount");
        System.out.println();
 if(item1!=null)System.out.println(item1+"                 "+""+(sub1)+""+"                   "+(sub1*p1));
 if(item2!=null)System.out.println(item2+"                 "+""+(sub2)+""+"                   "+(sub2*p2));
 if(item3!=null)System.out.println(item3+"                 "+""+(sub3)+""+"                   "+(sub3*p3));
 if(item4!=null)System.out.println(item4+"                 "+""+(sub4)+""+"                   "+(sub4*p4));
 if(item5!=null)System.out.println(item5+"                 "+""+(sub5)+""+"                   "+(sub5*p5));
 if(item6!=null)System.out.println(item6+"                 "+""+(sub6)+""+"                   "+(sub6*p6));
 if(item7!=null)System.out.println(item7+"                 "+""+(sub7)+""+"                   "+(sub7*p7));
 if(item8!=null)System.out.println(item8+"                 "+""+(sub8)+""+"                   "+(sub8*p8));
 if(item9!=null)System.out.println(item9+"                 "+""+(sub9)+""+"                   "+(sub9*p9));
        System.out.println("   --------------------------------------------------------------------");              
  System.out.println("                                "+"total = "+(counter-1)+"            "+"total = "+result);
        System.out.println();
        System.out.println("   ----------------------------------------------------------------------");
        System.out.println("GST  == 5%"+"                        "+GST);
        System.out.println();
        System.out.println("CGST == 2.5%"+"                      "+CGST);
        System.out.println();
        System.out.println("SGST == 2.5%"+"                      "+SGST);
        System.out.println("  ========================================================================");
        System.out.println("                                                           Payment Detials");
        System.out.println();
        System.out.println("                                                        Amount      "+result);
        System.out.println("                                                           GST    + "+GST);
        System.out.println("                                           Total amount to pay      "+(result+GST));
        System.out.println("  =========================================================================");
        System.out.println("                             THANK YOU - VISIT AGAIN");
        
        
        
        
	    
    	    
}
}