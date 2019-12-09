package mo;

public class rekursion {

    public static double interativeFaculty(double n){
        double x=1;
        for(int i=1;i<=n;i++){
            x*=i;
        }
        return x;
    }

    public static double recursiveFaculty(double n){
//        1.) Abbruch Bedinngung
        if(n==1) {
            return 1;
        }
//        2.) Rekursionsfortschritt
        return n*recursiveFaculty(n-1);
    }

    private static double interativeFibonacci(int min, int max) {
        double anz = 0;
        double f1 = 1;
        double f2 = 1;
        while (f1 + f2 <= max) {
            double f = f2;
            f2 +=f1;
            f1 = f;
            if (f2 > min) {
                anz++;
            }
        }
        return anz;
    }

    public static double recursiveFibonacci(double n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }

    public static double interativePascalshesTriangle(int line,int column){
        double[][] values=new double[line+1][line+1];
        for(int i=0;i<=line;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    values[i][j]=1;
                }else{
                    values[i][j]=values[i-1][j-1]+values[i-1][j];
                }
            }
        }
        return values[line][column];
    }

    public static double recursivePascalschesTriangle(int line,int column){
        if(line==0&&column==0){
            return 1;
        }else if(column<0||column>line){
            return 0;
        }
        return recursivePascalschesTriangle(line-1,column-1)+recursivePascalschesTriangle(line-1,column);
    }

    public static void main(String[] args) {
//        System.out.println("interativFaculty: "+interativeFaculty(4));
//        System.out.println("recursiveFaculty: "+recursiveFaculty(4));
//        System.out.println("interativeFibonacci: "+interativeFaculty(4));
//        System.out.println("recursiveFibonacci: "+recursiveFibonacci(50));
//        System.out.println("recursivePascalschesTriangle: "+recursivePascalschesTriangle(4,2));
        System.out.println("interativePascalschesTriangle: "+interativePascalshesTriangle(4,2));
    }
}
