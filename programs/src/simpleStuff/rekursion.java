package simpleStuff;

import java.util.List;

public class rekursion {

    public static double interativeFaculty(double n) {
        double x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }

    public static double recursiveFaculty(double n) {
//        1.) Abbruch Bedinngung
        if (n == 1) {
            return 1;
        }
//        2.) Rekursionsfortschritt
        return n * recursiveFaculty(n - 1);
    }

    private static double interativeFibonacci(int min, int max) {
        double anz = 0;
        double f1 = 1;
        double f2 = 1;
        while (f1 + f2 <= max) {
            double f = f2;
            f2 += f1;
            f1 = f;
            if (f2 > min) {
                anz++;
            }
        }
        return anz;
    }

    public static double recursiveFibonacci(double n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static double interativePascalshesTriangle(int line, int column) {
        double[][] values = new double[line + 1][line + 1];
        for (int i = 0; i <= line; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    values[i][j] = 1;
                } else {
                    values[i][j] = values[i - 1][j - 1] + values[i - 1][j];
                }
            }
        }
        return values[line][column];
    }

    public static double recursivePascalschesTriangle(int line, int column) {
        if (line == 0 && column == 0) {
            return 1;
        } else if (column < 0 || column > line) {
            return 0;
        }
        return recursivePascalschesTriangle(line - 1, column - 1) + recursivePascalschesTriangle(line - 1, column);
    }

    public static boolean isPrimenumber(int x) {
        if (x == 1) {
            return false;
        }
        return primenumber(x, x - 1);
    }

    private static boolean primenumber(int x, int i) {
        if (i == 1) {
            return true;
        } else if (x % i == 0) {
            return false;
        }
        return primenumber(x, i - 1);
    }

    public static int sumOfDigits(int x) {
        if (x < 0) {
            x = -x;
        }
        if (x / 10 == 0) {
            return x;
        }
        return x % 10 + sumOfDigits(sumOfDigits(x / 10));
    }

    public static int binarySearch(List<Integer> list, int number) {
        if (list.size() == 1) {
            if (list.get(0) == number) {
                return 0;
            } else {
                return -1;
            }
        }else if( list.size()==0){
            return -1;
        }
        int index = list.size() / 2;
        System.out.println(index);
        if (number == list.get(index)) {
            return list.size() / 2;
        }
        if (number > list.get(index)) {
            int x = binarySearch(list.subList(index + 1, list.size()), number);
            if(x!=-1){
                x+=index+1;
            }
            return x;
        }
        if (number < list.get(index)) {
            return binarySearch(list.subList(0, index), number);
        }
        return -1;
    }
}
