class Five{
    static class User{
        String username,email,password;
         User(String name, String mail, String psw){
             username = name;
             email = mail;
             password = psw;
         }

         String getName(){
             return this.username;
         }
    }

    public static void main(String[] args){
        User BollywoodKaBaap = new User("Puneet Superstar", "lord@puneet", "lord#puneet#superstar@123");
        System.out.println(BollywoodKaBaap.email);
        System.out.println(BollywoodKaBaap.getName());
    }
}