class Watch{
    final String watchPrice; // this cannot be modified from instance or subclass
    Watch(String price){
        watchPrice = price;
    }
    final String getWatchName(){   // this also cannot be modified from instance or subclass
        return "Unknown";
    }
}

class Rolex extends Watch{
    String watchBrand;
    Rolex(String brand, String price){
        super(price);
        watchBrand = brand;
    }

//    @Override
//    String getWatchName() {
//        return watchBrand;
//    }

//    Here, we cannot override the method getLaptopName() as we have declared final in the parent class
}

final class Footballer{
    void getFootballerName(){
        System.out.println("Leonal Messi");
        System.out.println("Christiano Ronaldo");
    }
}

//class PremiereLeague extends Footballer{
//    void getLeagueCountry(){
//        System.out.println("England");
//    }
//}

// We cannot extend the class with final keyword.

class Ten{
    public static void main(String[] args){
        Watch ghadi = new Watch("1.5 Lakh");
        Rolex mahangoGhadi = new Rolex("Rolex", "1.5 Lakh");
        Footballer player = new Footballer();

        System.out.println(ghadi.getWatchName());
        System.out.println(mahangoGhadi.getWatchName());

        player.getFootballerName();
    }
}