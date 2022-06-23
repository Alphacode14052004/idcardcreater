import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        String name;
        String bldgrp;
        int age;
        String group = null;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        bldgrp=scanner.next();
        age = scanner.nextInt();
         if (age>=20) {
             group = "RED";
         }
         else if (age>=15&& age<20) {
             group = "BLUE";
         }
         else if (age>=10&&age<15) {
             group = "YELLOW";
         }
         else {
             System.out.println("you are too old to be a student in this school");
         }
         System.out.println("-----------------------------------"+"\n"+"NAME: "+name+"\n"+"Age: "+age+"\n"+"Blood Group: "+bldgrp +"\n"+"-----------------------------------"+"\n"+"your group is "+group+"\n"+"-----------------------------------");
        scanner.close();
    }
}