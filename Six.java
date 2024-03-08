import java.util.Scanner;

abstract class Phone{
    public static String phoneName, phoneProcessor;
    public Phone(String name, String processor){
        phoneName = name;
        phoneProcessor = processor;
    }
    abstract public String getPhone();
    abstract public String getProcessor();
}

class Iphone extends  Phone{
    public Iphone(String name, String processor) {
        super(name, processor);
    }

    public String getPhone(){
        return phoneName;
    }

    @Override
    public String getProcessor() {
        return phoneProcessor;
    }

}

/*
    1. We cannot directly make instance of abstract class; here, Phone class.
    2. So, we have to make subclass (here, Iphone) of abstract class and then only we can make instance of
       that subclass.
    3. While creating subclass of abstract class, abstract methods declared inside the abstract class must be
       initialized in the subclass.
 */

class Six{
    public static void main(String[] args){
        System.out.println("Enter the mobile phone brand: ");
        Scanner pName = new Scanner(System.in);
        String name = pName.nextLine();

        System.out.println("Enter the mobile phone processor: ");
        Scanner pProcessor = new Scanner(System.in);
        String processor = pName.nextLine();

//        Iphone apple = new Iphone("Iphone 15", "Apple A16 Bionic");

        Iphone apple = new Iphone(name, processor);

        System.out.println(apple.getPhone());
        System.out.println(apple.getProcessor());
    }
}
