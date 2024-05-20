package com.happy_family_restaurent;

/**
 *  @author kailas
 * This is the method inherit parent class ;
 * also implementation of costumer order ;
 * Menu & payments calculation ;
 */
public class Order extends BillGenerator {

	public void order() {

		for (i = 1; i <= 100; i++) {
			user = sc.nextInt();
			counter++;
            
			switch (user) {
				case 1:
					System.out.println("paneer");
					break;
				case 2:
					System.out.println("veg kolhapuri");
					break;
				case 3:
					System.out.println("kadai paneer");
					break;
				case 4:
					System.out.println("Rice");
					break;
				case 5:
					System.out.println("Butter Nan");
					break;
				case 6:
					System.out.println("Tandoor");
					break;
				case 7:
					System.out.println("Vanila IceCream");
					break;
				case 8:
					System.out.println("Pista IceCream");
					break;
				case 9:
					System.out.println("StrawBarry IceCream");
					break;
				case 10:
					System.out.println("thanks for submit order");
					break;
			}
			if (user == 10)
				break;
			
            if(user==1) item1="paneer             ";
            if(user==2) item2="veg kolhapuri      ";
            if(user==3) item3="kadai paneer       ";
            if(user==4) item4="Rice               ";
            if(user==5) item5="Butter Nan         ";
            if(user==6) item6="Tandoor            ";
            if(user==7) item7="Vanila IceCream    ";
            if(user==8) item8="Pista IceCream     ";
            if(user==9) item9="StrawBarry IceCream";
         
            if(user==1) total=p1;
            if(user==2) total=p2;
            if(user==3) total=p3;
            if(user==4) total=p4;
            if(user==5) total=p5;
            if(user==6) total=p6;
            if(user==7) total=p7;
            if(user==8) total=p8;
            if(user==9) total=p9;
            result=result+total;
            if(user==1) sub1++;
            if(user==2) sub2++;
            if(user==3) sub3++;
            if(user==4) sub4++;
            if(user==5) sub5++;
            if(user==6) sub6++;
            if(user==7) sub7++;
            if(user==8) sub8++;
            if(user==9) sub9++;
            SGST=(2.5/100)*result;
            CGST=(2.5/100)*result;
            GST=SGST+CGST;
		}

	}

}
