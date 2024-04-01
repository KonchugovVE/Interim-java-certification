package IC;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Program
 */
public class Program {

    public static void CClear() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    public static int showMenu() {

        System.out.println(
                " \n Веберите необходимое действие\n 1. Ввести объем оперативной памяти\n 2. Ввести объем жеского диска\n 3. Выбрать ОС\n 4. Выбрать Цвет\n 5. Подобрать\n 6. Выйти");

        int count = userEnter();
        return count;

    }

    @SuppressWarnings("resource")
    public static int userEnter() {
        Scanner sc = new Scanner(System.in);
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();            
        }else{
            System.out.println("Вы ввели не число, попробуйте снова");
            num=0;
        }
        
        return num;
    }

    public void main(String[] args) {

        NoteBook Notebok1 = new NoteBook("DEXP Aquilon", 8, 256, "Win11", "Серебристый");
        NoteBook Notebok2 = new NoteBook("MSI Katana B12VFK-463XRU", 16, 512, "Без ОС", "Черный");
        NoteBook Notebok3 = new NoteBook("GIGABYTE G5 MF", 16, 512, "Без ОС", "Черный");
        NoteBook Notebok4 = new NoteBook("ASUS TUF Gaming A15 FA507NV-LP023", 16, 512, "Без ОС", "Серый");
        NoteBook Notebok5 = new NoteBook("Maibenben X556", 8, 256, "Linux", "Серый");
        NoteBook Notebok6 = new NoteBook("MSI Titan GT77 HX 13VI-096RU ", 32, 2000, "Win11", "Черный");
        NoteBook Notebok7 = new NoteBook("Apple MacBook Air 13", 8, 256, "MacOs", "Золотистый");

        Set<NoteBook> noteBooks = new HashSet<NoteBook>();
        noteBooks.add(Notebok1);
        noteBooks.add(Notebok2);
        noteBooks.add(Notebok3);
        noteBooks.add(Notebok4);
        noteBooks.add(Notebok5);
        noteBooks.add(Notebok6);
        noteBooks.add(Notebok7);

        int entRam = 0;
        int entRom = 0;
        String entOS = "Win11";
        String entColor = "Черный";
        CClear();
        System.out.println("Значения по умолчанию \n");
        System.out.printf("Объем ОЗУ: %d Объем ПЗУ: %d ОС: %s Цвет: %s\n", entRam, entRom, entOS, entColor);
        int count = showMenu();

        while (count != 6) {
            if (count == 1) {
                entRam = userEnter();
            } else if (count == 2) {
                entRom = userEnter();
            } else if (count == 3) {
                System.out.println("\n Выберите Операционную Систему\n 1. Windows11\n 2. Linux\n 3. MacOS\n 4. Без ОС");
                int temp = userEnter();
                while (temp < 1 && temp > 4) {
                    temp = userEnter();
                }
                if (temp == 1) {
                    entOS = "Win11";
                } else if (temp == 2) {
                    entOS = "Linux";

                } else if (temp == 3) {
                    entOS = "MacOs";

                } else if (temp == 4) {
                    entOS = "Без ОС";
                }

            } else if (count == 4) {
                System.out.println("\nВыберите цвет: \n 1. Серебристый \n 2. Черный \n 3. Серый \n 4. Золотистый");
                int numColor = userEnter();
                while (numColor < 1 && numColor > 4) {
                    numColor = userEnter();
                }
                if (numColor == 1) {
                    entColor = "Серебристый";

                } else if (numColor == 2) {
                    entColor = "Черный";

                } else if (numColor == 3) {
                    entColor = "Серый";

                } else if (numColor == 4) {
                    entColor = "Золотистый";
                }
            } else if (count == 5) {
                CClear();
                for (NoteBook ntBook : noteBooks) {
                    if ((ntBook.getRam() >= entRam) && (ntBook.getRom() >= entRom) && (ntBook.getOs() == entOS)
                            && (ntBook.getColor() == entColor)) {
                        System.out.println(ntBook.toString());
                    }
                }
                

            }
            if (count == 6) {
                sc.close();
                System.exit(0);
            }if (count!=5) {
                
                CClear();
                System.out.println("Выбор пользователя\n");
                System.out.printf("Объем ОЗУ: %d Объем ПЗУ: %d ОС: %s Цвет: %s\n", entRam, entRom, entOS, entColor);
            }else{
                System.out.println("Выбор пользователя\n");
                System.out.printf("Объем ОЗУ: %d Объем ПЗУ: %d ОС: %s Цвет: %s\n", entRam, entRom, entOS, entColor);
            }

            count = showMenu();
        }

    }
}