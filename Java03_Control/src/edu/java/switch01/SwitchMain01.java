package edu.java.switch01;

public class SwitchMain01 {

    public static void main(String[] args) {
        String time = "점심";
        switch (time) {
        case "아침":
            System.out.println("breakfast");
            //break;
        case "점심":
            System.out.println("lunch");
            //break;
        case "저녁":
            System.out.println("dinner");
            //break;
        default:
            System.out.println("snack");
        }

    }

}
