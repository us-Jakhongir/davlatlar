package model;

import model.area.District;
import model.area.Region;
import model.area.Republic;
import model.user.Khokim;
import model.user.President;
import model.user.Role;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {

    public static Integer id = 1;
    public static Republic[] republics = new Republic[5];
    public static Region[] regions = new Region[5];
    public static District[] districts = new District[5];
    public static Khokim[] khokims = new Khokim[20];
    public static President[] presidents = new President[5];

    public static void main(String[] args) {

        Role[] roles = new Role[10];
        roles[0] = new Role(1, "Prezident");
        roles[1] = new Role(2, "Viloyat Hokimi");
        roles[2] = new Role(3, "Tuman Hokimi");

        presidents[0] = new President(id++, "Shavkat", "Mirziyoyev", 64, roles[0], 5);

        khokims[0] = new Khokim(1, "G'ofurjon", "Mirzayev", 55, roles[1], 5);

        khokims[1] = new Khokim(2, "To'lqin", "Dadaboyev", 60, roles[2], 3);
        khokims[2] = new Khokim(3, "Vali", "Valiyev", 45, roles[2], 2);
        khokims[3] = new Khokim(4, "Ali", "Aliyev", 40, roles[2], 1);
        khokims[4] = new Khokim(5, "Murod", "Murodov", 55, roles[2], 6);
        khokims[5] = new Khokim(6, "Sali", "Saliyev", 52, roles[2], 4);



        districts[0] = new District(1, "Guliston", 500.0, 80000, khokims[1]);
        districts[1] = new District(1, "Baxt", 380.0, 40000, khokims[2]);
        districts[2] = new District(1, "Yangiyer", 450.0, 50000, khokims[3]);
        districts[3] = new District(1, "Saxunobod", 550.0, 65000, khokims[4]);
        districts[4] = new District(1, "Mirzaobod", 600.0, 45000, khokims[5]);



        regions[0] = new Region(1, "Sirdaryo", 5100.0, 763000, khokims[0], districts);
        regions[1] = new Region(1, "Andijon", 5100.0, 763000, khokims[1], districts);
        regions[2] = new Region(1, "Toshkent", 5100.0, 763000, khokims[2], districts);
        regions[3] = new Region(1, "Samarqand", 5100.0, 763000, khokims[3], districts);
        regions[4] = new Region(1, "Buxoro", 5100.0, 763000, khokims[4], districts);



        republics[0] = new Republic(2, "O'zbekiston", 447000.0, 35000000, presidents[0]);
        republics[1] = new Republic(3, "Turkiya", 447000.0, 35000000, presidents[1]);
        republics[2] = new Republic(4, "Ukraina", 447000.0, 35000000, presidents[2]);
        republics[3] = new Republic(5, "Qirg'iziston", 447000.0, 35000000, presidents[3]);
        republics[4] = new Republic(6, "Kanada", 447000.0, 35000000, presidents[4]);


        while (true) {
            chooseState();
            Scanner scanner = new Scanner(System.in);
            int region = scanner.nextInt();

            switch (region) {

                case 1:
                    uzbekistan();
                    break;

                case 2:
                    turkiya();
                    break;

                case 3:
                    ukraina();
                    break;

                case 4:
                    qirgiziston();
                    break;

                case 5:
                    kanada();
                    break;
                case 0:
                    return;

            }

            listRegions();
            chooseRegion();
            listDistricts();
            choseDistrict();

        }
    }


    public static void chooseRegion() {
        Scanner scanner = new Scanner(System.in);
        int regionNumber = scanner.nextInt();

                switch (regionNumber) {
                    case 1:
                        sirdaryo();
                        break;

                    case 2:
                        abdijon();
                        break;

                    case 3:
                        toshkent();
                        break;

                    case 4:
                        samarqand();
                        break;

                    case 5:
                        buxoro();
                        break;
                    case 0:
                        break;
                }
    }


    public static void choseDistrict() {

        Scanner scanner = new Scanner(System.in);
        int districtNumber = scanner.nextInt();

        switch (districtNumber) {
            case 1:
                baxt();
                break;

            case 2:
                mirzaobod();
                break;

            case 3:
                yangiyer();
                break;

            case 4:
                guliston();
                break;

            case 5:
                sayxunobod();
                break;
        }

    }



    private static void qirgiziston() {
        System.out.println("Malumot topilmadi." + "\n");

    }

    private static void kanada() {
        System.out.println("Malumot topilmadi." + "\n");

    }

    private static void ukraina() {
        System.out.println("Malumot topilmadi." + "\n");

    }

    private static void turkiya() {
        System.out.println("Malumot topilmadi." + "\n");

    }

    private static void uzbekistan() {
        for (Republic republic : republics) {
            if (republic != null && republic.getAreaName().equals("O'zbekiston")) {
                System.out.println(republic);
            }
        }




    }


    private static void buxoro() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void samarqand() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void toshkent() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void abdijon() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void sirdaryo() {
        for (Region region : regions) {
            if (region != null && region.getAreaName().equals("Sirdaryo")) {
                System.out.println(region);
            }
        }
    }


    private static void sayxunobod() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void guliston() {
        for (District district : districts) {
            if (district != null && district.getAreaName().equals("Guliston")) {
                System.out.println(district);
            }
        }
    }

    private static void yangiyer() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void mirzaobod() {
        System.out.println("Malumot topilmadi." + "\n");
    }

    private static void baxt() {
        System.out.println("Malumot topilmadi." + "\n");
    }





    private static void chooseState() {
        System.out.println("===================================================");
        System.out.println("Davlatni tanlang: ");

        System.out.println("1. O'zbekiston");
        System.out.println("2. Turkiya");
        System.out.println("3. Ukraina");
        System.out.println("4. Qirg'iziston");
        System.out.println("5. Kanada");
        System.out.println("0. Tizimdan chiqish");
        System.out.println("===================================================");

    }

    private static void listRegions() {
        System.out.println("Viloyatni tanlang: ");

        System.out.println("1 - Sirdaryo");
        System.out.println("2 - Andijon");
        System.out.println("3 - Toshkent");
        System.out.println("4 - Samarqand");
        System.out.println("5 - Buxoro");
    }

    private static void listDistricts() {
        System.out.println("Tumanni tanlang: ");

        System.out.println("1 - Baxt");
        System.out.println("2 - Mirzaobod");
        System.out.println("3 - Yangiyer");
        System.out.println("4 - Guliston");
        System.out.println("5 - Sayxunobod");
    }
}
