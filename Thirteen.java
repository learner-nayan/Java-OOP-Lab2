class Singer{
    String name;
    Singer(String name){
        this.name = name;
    }

    public String getSingerName(){
        return this.name;
    }
}

class SingerAndNationality extends Singer{
    String country;
    SingerAndNationality(String name, String country){
        super(name);
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
}

class Thirteen{
    public static void main(String[] args){
        SingerAndNationality ranuMandal = new SingerAndNationality("Ranu Mandal", "India");
        Singer durgeshThapa = new Singer("Durgesh Thapa");

        System.out.println(ranuMandal.getSingerName());
        System.out.println(ranuMandal.getCountry()+"\n");

        System.out.println(durgeshThapa.getSingerName());
    }
}