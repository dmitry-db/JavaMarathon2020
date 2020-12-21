package waterfight;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class PlayingField {
    private int kolOne, kolDb, kolThr, kolFr;
    private String[][] mas = new String[10][10];

    public PlayingField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mas[i][j] == null) {
                    mas[i][j] = "⬜";
                }
            }
        }
    }


    public void addOneShip(int x,int y) {
        int p = 0;
        if (provOreol(x, y)) {      //Проверка на ореол
            p = 1;
        }

        if (p == 0 && kolOne < 4) {
            oreol(x,y);
            mas[x][y] = "\uD83D\uDEE5";
                kolOne++;
            }

        else {
            if (kolOne >= 4) {
                System.out.println("Максимальное количество однопалубных добавлено");
            } else {
                System.out.println("ореол корабля");
                System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2'");
                int q = 0;
                while (q == 0) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        String w = scanner.nextLine();
                        String[] s = w.split(",");
                        int a = Integer.parseInt(s[0]);
                        int b = Integer.parseInt(s[1]);
                        q = 1;
                        addOneShip(a, b);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x,y'");
                    }
                }
            }
        }

        }

        public void addDbShip(int x1, int y1, int x2, int y2) {
            int p = 0;
            int valid;
            try {
                if (provOreol(x1, y1) || provOreol(x2, y2)) {      //Проверка на ореол
                    p = 1;
                }


                if ((Math.abs(x1 - x2) == 1 && y1 - y2 == 0) || (Math.abs(y1 - y2) == 1 && x1 - x2 == 0)) {
                    valid = 0;
                } else {
                    valid = 1;
                }


                if (p == 0 && kolDb < 3 && valid == 0) {
                    oreol(x1, y1);
                    oreol(x2, y2);
                    mas[x1][y1] = "\uD83D\uDEE5";
                    mas[x2][y2] = "\uD83D\uDEE5";
                    kolDb++;
                } else {
                    if (kolThr >= 3) {
                        System.out.println("Максимальное количество двухпалубных добавлено");
                    } else if (valid == 1) {
                        System.out.println("Невалидный корабль");
                        System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2'");
                        int q = 0;
                        while (q == 0) {
                            try {
                                Scanner scanner = new Scanner(System.in);
                                String w = scanner.nextLine();
                                String[] s = w.split(";");
                                String[] s1 = s[0].split(",");
                                String[] s2 = s[1].split(",");
                                int a = Integer.parseInt(s1[0]);
                                int b = Integer.parseInt(s1[1]);
                                int c = Integer.parseInt(s2[0]);
                                int d = Integer.parseInt(s2[1]);
                                q = 1;
                                addDbShip(a, b, c, d);
                            } catch (NumberFormatException e) {
                                System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2'");
                            }
                        }
                    } else {
                        System.out.println("ореол корабля");
                        System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2'");
                        int q = 0;
                        while (q == 0) {
                            try {
                                Scanner scanner = new Scanner(System.in);
                                String w = scanner.nextLine();
                                String[] s = w.split(";");
                                String[] s1 = s[0].split(",");
                                String[] s2 = s[1].split(",");
                                int a = Integer.parseInt(s1[0]);
                                int b = Integer.parseInt(s1[1]);
                                int c = Integer.parseInt(s2[0]);
                                int d = Integer.parseInt(s2[1]);
                                q = 1;
                                addDbShip(a, b, c, d);
                            } catch (NumberFormatException e) {
                                System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2'");
                            }
                        }
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("неверный индекс");
                System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2'");
                int q = 0;
                while (q == 0) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        String w = scanner.nextLine();
                        String[] s = w.split(";");
                        String[] s1 = s[0].split(",");
                        String[] s2 = s[1].split(",");
                        int a = Integer.parseInt(s1[0]);
                        int b = Integer.parseInt(s1[1]);
                        int c = Integer.parseInt(s2[0]);
                        int d = Integer.parseInt(s2[1]);
                        q = 1;
                        addDbShip(a, b, c, d);
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException o) {
                        System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2'");
                    }
                }
            }
            }

    public void addTrShip(int x1, int y1, int x2, int y2, int x3, int y3) {
        int p = 0;
        int valid;
        try {
            if (provOreol(x1, y1) || provOreol(x2, y2) || provOreol(x3, y3)) {      //Проверка на ореол
                p = 1;
            }


            if ((Math.abs(x1 - x2) == 1 && Math.abs(x1 - x3) == 2 && y1 - y2 == 0 && y1 - y3 == 0) ||
                    (Math.abs(y1 - y2) == 1 && Math.abs(y1 - y3) == 2 && x1 - x2 == 0 && x1 - x3 == 0)) {
                valid = 0;
            } else {
                valid = 1;
            }


            if (p == 0 && kolThr < 2 && valid == 0) {
                oreol(x1, y1);
                oreol(x2, y2);
                oreol(x3, y3);
                mas[x1][y1] = "\uD83D\uDEE5";
                mas[x2][y2] = "\uD83D\uDEE5";
                mas[x3][y3] = "\uD83D\uDEE5";
                kolThr++;
            } else {
                if (kolThr >= 2) {
                    System.out.println("Максимальное количество трехбалубных добавлено");
                } else if (valid == 1) {
                    System.out.println("Невалидный корабль");
                    System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                    int q = 0;
                    while (q == 0) {
                        try {
                            Scanner scanner = new Scanner(System.in);
                            String w = scanner.nextLine();
                            String[] s = w.split(";");
                            String[] s1 = s[0].split(",");
                            String[] s2 = s[1].split(",");
                            String[] s3 = s[2].split(",");
                            int a = Integer.parseInt(s1[0]);
                            int b = Integer.parseInt(s1[1]);
                            int c = Integer.parseInt(s2[0]);
                            int d = Integer.parseInt(s2[1]);
                            int v = Integer.parseInt(s3[0]);
                            int n = Integer.parseInt(s3[1]);
                            q = 1;
                            addTrShip(a, b, c, d, v, n);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                        }
                    }
                } else {
                    System.out.println("ореол корабля");
                    System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                    int q = 0;
                    while (q == 0) {
                        try {
                            Scanner scanner = new Scanner(System.in);
                            String w = scanner.nextLine();
                            String[] s = w.split(";");
                            String[] s1 = s[0].split(",");
                            String[] s2 = s[1].split(",");
                            String[] s3 = s[2].split(",");
                            int a = Integer.parseInt(s1[0]);
                            int b = Integer.parseInt(s1[1]);
                            int c = Integer.parseInt(s2[0]);
                            int d = Integer.parseInt(s2[1]);
                            int v = Integer.parseInt(s3[0]);
                            int n = Integer.parseInt(s3[1]);
                            q = 1;
                            addTrShip(a, b, c, d, v, n);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                        }
                    }
                }
            }
            }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("неверный индекс");
                System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                int q = 0;
                while (q == 0) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        String w = scanner.nextLine();
                        String[] s = w.split(";");
                        String[] s1 = s[0].split(",");
                        String[] s2 = s[1].split(",");
                        String[] s3 = s[2].split(",");
                        int a = Integer.parseInt(s1[0]);
                        int b = Integer.parseInt(s1[1]);
                        int c = Integer.parseInt(s2[0]);
                        int d = Integer.parseInt(s2[1]);
                        int v = Integer.parseInt(s3[0]);
                        int n = Integer.parseInt(s3[1]);
                        q = 1;
                        addTrShip(a, b, c, d, v, n);
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException o) {
                        System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3'");
                    }
                }
            }
        }


    public void addFrShip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int p = 0;
        int valid;
        try {
            if ((provOreol(x1, y1) || provOreol(x2, y2) || provOreol(x3, y3)) || provOreol(x4, y4)) {      //Проверка на ореол
                p = 1;
            }


            if ((Math.abs(x1 - x2) == 1 && Math.abs(x1 - x3) == 2 && Math.abs(x1 - x4) == 3 && y1 - y2 == 0 && y1 - y3 == 0 && y1 - y4 == 0) ||
                    (Math.abs(y1 - y2) == 1 && Math.abs(y1 - y3) == 2 && Math.abs(y1 - y4) == 3 && x1 - x2 == 0 && x1 - x3 == 0 && x1 - x4 == 0)) {
                valid = 0;
            } else {
                valid = 1;
            }


            if (p == 0 && kolFr < 1 && valid == 0) {
                oreol(x1, y1);
                oreol(x2, y2);
                oreol(x3, y3);
                oreol(x4, y4);
                mas[x1][y1] = "\uD83D\uDEE5";
                mas[x2][y2] = "\uD83D\uDEE5";
                mas[x3][y3] = "\uD83D\uDEE5";
                mas[x4][y4] = "\uD83D\uDEE5";
                kolFr++;
            } else {
                if (kolFr >= 1) {
                    System.out.println("Максимальное количество четырехпалубных добавлено");
                } else if (valid == 1) {
                    System.out.println("Невалидный корабль");
                    System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
                    int q = 0;
                    while (q == 0) {
                        try {
                            Scanner scanner = new Scanner(System.in);
                            String w = scanner.nextLine();
                            String[] s = w.split(";");
                            String[] s1 = s[0].split(",");
                            String[] s2 = s[1].split(",");
                            String[] s3 = s[2].split(",");
                            String[] s4 = s[3].split(",");
                            int a = Integer.parseInt(s1[0]);
                            int b = Integer.parseInt(s1[1]);
                            int c = Integer.parseInt(s2[0]);
                            int d = Integer.parseInt(s2[1]);
                            int v = Integer.parseInt(s3[0]);
                            int n = Integer.parseInt(s3[1]);
                            int y = Integer.parseInt(s4[0]);
                            int u = Integer.parseInt(s4[1]);
                            q = 1;
                            addFrShip(a, b, c, d, v, n, y, u);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
                        }
                    }
                } else {
                    System.out.println("ореол корабля");
                    System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
                    int q = 0;
                    while (q == 0) {
                        try {
                            Scanner scanner = new Scanner(System.in);
                            String w = scanner.nextLine();
                            String[] s = w.split(";");
                            String[] s1 = s[0].split(",");
                            String[] s2 = s[1].split(",");
                            String[] s3 = s[2].split(",");
                            String[] s4 = s[3].split(",");
                            int a = Integer.parseInt(s1[0]);
                            int b = Integer.parseInt(s1[1]);
                            int c = Integer.parseInt(s2[0]);
                            int d = Integer.parseInt(s2[1]);
                            int v = Integer.parseInt(s3[0]);
                            int n = Integer.parseInt(s3[1]);
                            int y = Integer.parseInt(s4[0]);
                            int u = Integer.parseInt(s4[1]);
                            q = 1;
                            addFrShip(a, b, c, d, v, n, y, u);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
                        }
                    }
                }
            }
        }
       catch(ArrayIndexOutOfBoundsException e){
            System.out.println("неверный индекс");
            System.out.println("введите координаты еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
            int q = 0;
            while (q == 0) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    String w = scanner.nextLine();
                    String[] s = w.split(";");
                    String[] s1 = s[0].split(",");
                    String[] s2 = s[1].split(",");
                    String[] s3 = s[2].split(",");
                    String[] s4 = s[3].split(",");
                    int a = Integer.parseInt(s1[0]);
                    int b = Integer.parseInt(s1[1]);
                    int c = Integer.parseInt(s2[0]);
                    int d = Integer.parseInt(s2[1]);
                    int v = Integer.parseInt(s3[0]);
                    int n = Integer.parseInt(s3[1]);
                    int y = Integer.parseInt(s4[0]);
                    int u = Integer.parseInt(s4[1]);
                    q = 1;
                    addFrShip(a, b, c, d, v, n, y, u);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException o) {
                    System.out.println("Неверный ввод, попробуйте еще раз, шаблон: 'x1,y1;x2,y2;x3,y3;x4,y4'");
                }
            }
        }
    }


    public void setMas(String[][] mas) {
        this.mas = mas;
    }

    public String[][] getMas() {
        return mas;
    }

    public void Printmas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }

    public void oreol(int x, int y){
        if (x - 1 >= 0) {
            mas[x - 1][y] = "\uD83D\uDFE6";
        }
        if (x + 1 <= 9) {
            mas[x + 1][y] = "\uD83D\uDFE6";
        }
        if (y - 1 >= 0) {
            mas[x][y - 1] = "\uD83D\uDFE6";
        }
        if (y + 1 <= 9) {
            mas[x][y + 1] = "\uD83D\uDFE6";
        }
        if (x + 1 <= 9 && y + 1 <= 9) {
            mas[x + 1][y + 1] = "\uD83D\uDFE6";
        }
        if (x + 1 <= 9 && y - 1 >= 0) {
            mas[x + 1][y - 1] = "\uD83D\uDFE6";
        }
        if (x - 1 >= 0 && y + 1 <= 9) {
            mas[x - 1][y + 1] = "\uD83D\uDFE6";
        }
        if (x - 1 >= 0 && y - 1 >= 0) {
            mas[x - 1][y - 1] = "\uD83D\uDFE6";
        }
    }


        public boolean provOreol(int x, int y){
        if (mas[x][y] == "\uD83D\uDFE6" || mas[x][y] == "\uD83D\uDEE5"){
            return true;
        }
        else {
            return false;
        }
        }
}
