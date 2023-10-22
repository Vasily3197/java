package java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Laptop {

    private List<Brand> brands;
    private String model;
    private int HHD;
    private String RAM;
    private String OS;
    private String color;

    public Laptop() {
    }

    public Laptop(String model, int HHD, String RAM, String OS, String color) {

        this.brands = new ArrayList<>();
        this.model = model;
        this.HHD = HHD;
        this.RAM = RAM;
        this.OS = OS;
        this.color = color;
    }

    public String getModel() {return model;}    
    public int getHHD() {return HHD;}
    public String getRAM() {return RAM;}
    public String getOS() {return OS;}
    public String getColor() {return color;}


    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Введите размер HHD: 300,500,700,1000 ");
        String enterHHD = scan.nextLine();
        int intParseEnterHHD = Integer.parseInt(enterHHD);

        System.out.println(" Введите размер RAM: 4, 8, 16 ");
        String enterRAM = scan.nextLine();

        System.out.println("Введите ОС: Linux, Windows");
        String enterOS = scan.nextLine();

        System.out.println(" Введите цвет: зелёный, синенький, красный, белый, чёрный ");
        String enterColor = scan.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (intParseEnterHHD == tempLaptop.HHD) {
                if (enterRAM.equals(tempLaptop.RAM)) {
                    if (enterOS.equals(tempLaptop.OS)) {
                        if (enterColor.equals(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        return listLaptop;
    }

    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println(" Какие критерии интересуют? Введите цифру. " + 
        "\n1. Размер HHD\n2. Размер RAM\n3. ОC\n4. Цвет  ");
        String userRequest = scan.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println(" Введите размер HHD: 300,500,700,1000 ");
                String enterHDD = scan.nextLine();
                int intParseEnterHHD = Integer.parseInt(enterHDD);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHHD != tempLaptop.HHD){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println(" Введите размер RAM: 8, 16 ");
                String enterRAM = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterRAM.equals(tempLaptop.RAM)) == false) {
                        listLaptop.remove(tempLaptop);
                        System.out.println("Ой, какая - то ошибка. Попрбуйте снова.");
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println(" Введите ОС: Linux, Windows ");
                String enterOS = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOS.equals(tempLaptop.OS) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println(" Введите цвет: зелёный, синенький, красный, белый, чёрный ");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }


    @Override
    public String toString() {
        return  brands + 
        "\n" + model + 
        " \nОбъём жёсткого диска: " + HHD + " ГБ " 
        + " \nОбъём оперативной памяти: " 
        + RAM + "ГБ"+ 
        " \nОперационная система: " + OS + 
        " \nЦвет: " + color;
    }

    public void add(Brand brandSamsung) {
    }

}
