/*

╔════════════════╦═══════╦═════════╦══════════╦═══════╗
║ Access Modifier║ Class ║ Package ║ Subclass ║ World ║
╠════════════════╬═══════╬═════════╬══════════╬═══════╣
║ public         ║   ✔️  ║    ✔️   ║     ✔️   ║   ✔️ ║
║ protected      ║   ✔️  ║    ✔️   ║     ✔️   ║  ❌  ║
║ default        ║   ✔️  ║    ✔️   ║    ❌    ║  ❌  ║
║ private        ║   ✔️  ║    ❌   ║    ❌    ║  ❌  ║
╚════════════════╩═══════╩═════════╩══════════╩═══════╝

*/

class IT{

    //Access Modifiers in Attributes
    public String ML_public;                    //accessible from : class, package, subclass, world
    protected String BlockChain_protected;         //accessible from : class, package, subclass
    private String Robotics_private;                   //accessible from : class
    String Software_default;                     // default; accessible from : class, package


    //Access Modifiers in Constructor
    private IT(String ml){
        ML_public = ml;
    }

    protected IT(String ml,String blockchain){
        ML_public = ml;
        BlockChain_protected = blockchain;
    }

    public IT(String ml,String blockchain, String robotics){
        ML_public = ml;
        BlockChain_protected = blockchain;
        Robotics_private = robotics;
    }

    IT(String ml,String blockchain, String robotics, String software){
        ML_public = ml;
        BlockChain_protected = blockchain;
        Robotics_private = robotics;
        Software_default = software;
        // all these attributes are accessible within the class, so we can use in all constructors.
    }


    //Access Modifiers in Methods
    public void getPublic(){
        System.out.println("Machine Learning -Public");
    }

    protected void getProtected(){
        System.out.println("BlockChain -Protected");
    }

    private void getPrivate(){
        System.out.println("Robotics -Private");
    }

    void getDefault(){
        System.out.println("Software Engineering -Default");
    }
}

class subIT extends IT{
//    subIT(String ml){
//        super(ml);
//    }
    // we cannot access/modify this constructor from subclass because this is private in superClass
    subIT(String ml, String blockchain){
        super(ml, blockchain);
    }
    subIT(String ml, String blockchain, String robotics){
        super(ml, blockchain, robotics);
    }
    subIT(String ml, String blockchain, String robotics, String software){
        super(ml, blockchain, robotics, software);
    }
}



class Eleven{
    public static void main(String[] args){
        //Instantiating class with constructors having different access modifiers

//        IT tech1 = new IT("Python");      // this is private constructor and cannot be instantiated
        IT tech2 = new IT("Python", "Solidity");
        IT tech3 = new IT("Python", "Solidity", "C++");
        IT tech4 = new IT("Python", "Solidity", "C++", "Java");

        IT test = new IT("Hello", "Hi", "Tata", "Bye");

        //Accessing attributes of class having different access modifiers.

        System.out.println("Tech2: " + tech2.ML_public + " -Public");
        System.out.println("Tech2: " + tech2.BlockChain_protected + " -Protected\n");

        System.out.println("Tech3: " + tech3.ML_public + " -Public");
        System.out.println("Tech3: " + tech3.BlockChain_protected + " -Protected\n");
//        System.out.println("Tech3: " + tech3.Robotics_private + " -Private");
//        this is private attribute and cannot be accessed

        System.out.println("Tech4: " + tech4.ML_public + " -Public");
        System.out.println("Tech4: " + tech4.BlockChain_protected + " -Protected");
//        System.out.println("Tech4: " + tech4.Robotics_private + " -Private");
//        Same issue: this is private attribute and cannot be accessed
        System.out.println("Tech4: " + tech4.Software_default + " -Default\n");

        //Accessing methods of class having different access modifiers
        test.getPublic();
        test.getProtected();
//        test.getPrivate();       // this is private method and cannot be accessed
        test.getDefault();



//        ---------------------------------------- FROM SUBCLASS --------------------------------------------------------------------------------

        System.out.println("\n------------------------------FROM SUBCLASS------------------------------------------");
        //Instantiating subclass with constructors having different access modifiers

//        subIT subTech1 = new subIT("Python");      // this is private constructor and cannot be instantiated
        subIT subTech2 = new subIT("Python", "Solidity");
        subIT subTech3 = new subIT("Python", "Solidity", "C++");
        subIT subTech4 = new subIT("Python", "Solidity", "C++", "Java");

        IT subTest = new IT("Hello", "Hi", "Tata", "Bye");

        //Accessing attributes of class having different access modifiers from subclass

        System.out.println("\nsubTech2: " + subTech2.ML_public + " -Public");
        System.out.println("subTech2: " + subTech2.BlockChain_protected + " -Protected\n");

        System.out.println("subTech3: " + subTech3.ML_public + " -Public");
        System.out.println("subTech3: " + subTech3.BlockChain_protected + " -Protected\n");
//        System.out.println("subTech3: " + subTech3.Robotics_private + " -Private");
//        this is private attribute and cannot be accessed from subclass

        System.out.println("subTech4: " + subTech4.ML_public + " -Public");
        System.out.println("subTech4: " + subTech4.BlockChain_protected + " -Protected");
//        System.out.println("subTech4: " + subTech4.Robotics_private + " -Private");
//        Same issue: this is private attribute and cannot be accessed from subclass
        System.out.println("subTech4: " + subTech4.Software_default + " -Default\n");

        //Accessing methods from subclass having different access modifiers
        subTest.getPublic();
        subTest.getProtected();
//        test.getPrivate();       // this is private method and cannot be accessed from subclass
        subTest.getDefault();


    }
}


