package package1;



class Car{

    Object print(Object anyObj){
       return anyObj;
    }
}
public class ConvertPrimitive_Object {
    public static void main(String []args){
        //int to String Class
        // String Class to int
//        int a =100 ;
//        String s = String.valueOf(a);
//        System.out.println(s);
//        System.out.println(s.concat("122"));
//        s.concat("100");
//        //StringBuffer && StringBuilder
//        System.out.println(s);//string is immutable
//
//        int a1 = Integer.parseInt(s);
//        System.out.println(a1);
//        System.out.println(a1+100);


        //String to double
        //double to String

//        double d=100.9 ;
//        String s=String.valueOf(d);
//        System.out.println("String : "+(s+"Boys"));
//
//        String s1 ="100.9";
//        double d2=Double.parseDouble("100.4");
//
//        System.out.println("Double : "+(d2+100));
//
//        double d1= 100.5;
//        System.out.println(d1+"100");
//        String s3 ="100.5";
//        System.out.println(s3+100.05);

        //boolean && String

//        boolean b =true ;
//        System.out.println();
//        String s =String.valueOf(b);
//        System.out.println(s+"false");
//        b=Boolean.parseBoolean(s);
//        System.out.println(b);

        //String to float

//        String s ="123.666";
//        float f = Float.parseFloat(s);
//        System.out.println(f+26.5);
//
//        f=100.5f ;
//        s=String.valueOf(f);
//        System.out.println(s+"qwer");


      //create object of Car classCar
        Car objCar= new Car();
        //objCar.print();
        Object obj = objCar.print("integer bolcire "+123+"kewmomn aso double"+123.45);
        String s =String.valueOf(obj);
        System.out.println(s+"String Bolci Kemon asen Sobbai");




    }
}
