class Laptop{
    String laptopRAM;
    Laptop(String RAM){
        laptopRAM = RAM;
    }
    String getLaptopName(){
        return "Unknown";
    }
}

class Apple extends Laptop{
    String laptopBrand;
    Apple(String brand, String RAM){
        super(RAM);
        laptopBrand = brand;
    }

    @Override
    String getLaptopName() {
        return laptopBrand;
    }
}

class Nine{
    public static void main(String[] args){
        Laptop laps = new Laptop("8 GB");
        Apple mac = new Apple("Apple", "8 GB");

        System.out.println(laps.getLaptopName());
        System.out.println(mac.getLaptopName());
    }
}