package package1;

public class CommandLineArgument {
    public static void main(String[] args)  {
        //parseInt is a method of Integer class //it is a static method
        //thats why when we call this method we use ->ClassName.methodName()
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Command Line value Addition :  ");
    }
}
