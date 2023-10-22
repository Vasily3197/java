package java;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Laptop g6 = new Laptop("g6", 500, "16", "Windows", "Чёрный"); 
        Brand brandHp = new Brand("HP", "U.S.A.");
        g6.add(brandHp);

        Laptop x64 = new Laptop("x64", 500, "8", "Windows", "Зелёный");
        x64.add(brandHp);

        Laptop sam52 = new Laptop("sam52", 300, "8", "Windows", "Синенький");
        Brand brandSamsung = new Brand("Samsung", "Korea");
        sam52.add(brandSamsung);

        Laptop m31s = new Laptop ("m31s", 1000, "16", "Linux", "Красный");
        m31s.add(brandSamsung);

        Laptop gtx76 = new Laptop("gtx76", 700, "8", "Windows", "Белый");
        Brand brandLenovo = new Brand("Lenovo", "China");
        gtx76.addBrand(brandHp);


        Set <Laptop> laptop = new HashSet<>();
        laptop.add(g6);      
        laptop.add(x64);
        laptop.add(sam52);
        laptop.add(m31s);
        laptop.add(gtx76);

        Laptop FilterLaptop = new Laptop();
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}

