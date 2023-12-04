package yeni;

public class Student {

    public static String color;
    public static String fuelType;

    {
        color = "SİYAH";
        fuelType = "mazot";
    }

    public Student() {
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakit turu : " + fuelType);
    }

    public Student(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

}


