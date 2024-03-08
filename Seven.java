class User{
    String userName, userEmail, userPassword;
    User(String name, String email, String password){
        userName = name;
        userEmail = email;
        userPassword = password;
    }

    void getName(){
        System.out.println("Name: "+userName);
    }
    String getEmail(){
        return userEmail;
    }
}

class Student extends User {
    int studentId;
    Student(String name, String email, String password, int sId){
        super(name, email, password);
        studentId = sId;
    }

    int getStudentId(){
        return studentId;
    }

}

class Seven{
    public static void main(String[] args){
        User prachanda = new User("Puspa Kamal Dahal", "lord@Prachanda.com.np", "prachanda$puspa");
        Student mukundey = new Student("Mukunda Ghimire", "philosopher@mukundey.com.np", "mukundaLand", 77);

        prachanda.getName();
        System.out.println(prachanda.getEmail()+"\n");

        mukundey.getName();
        System.out.println(mukundey.getEmail());
        System.out.println("Student Id: "+mukundey.getStudentId());
    }
}