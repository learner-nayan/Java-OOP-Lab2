class MethodOverloading{
    int add(int a, int b, int c){
        return a+b+c;
    }

    int add(int a, int b){
        return a+b;
    }

}

class Two{
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.add(10,10,10));
        System.out.println(obj.add(10,10));
    }
}