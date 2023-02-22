import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        while(true){
            try {
                print("Выберите программу, где 1 - первая задача, 2 - вторая задача");
                tp(i.nextInt(), i);
            }
            catch (Exception e){
                print(e);
            }
        }
    }
    static void tp(int n, Scanner i){
        if(n == 1)
            task1(i);
        if(n == 2)
            task2(i);
    }
    static void task1(Scanner i){
        print("Введите число элементов массива");
        int a = i.nextInt();
        List m = new ArrayList();
        for (int d=0; d<a; d++){
            System.out.print("Элемент массива № " + (d+1) + " = ");
            int f = i.nextInt();
            m.add(f);
        }
        print("Нечетные элементы:");
        for (int d = 0; d < m.size(); d+=2){
            System.out.print(m.get(d) + ", ");
        }
        print(' ');
        print("Четные элементы:");
        for (int d = 1; d < m.size(); d+=2){
            System.out.print(m.get(d) + ", ");
        }
        print(' ');
    }
    static void task2(Scanner i){
        print("Введите значение, порядка которого будет матрица");
        int m = i.nextInt();
        int[][] matrix = new int[m][m];
        for (int h = 0; h< m; h++){
            for(int j = 0; j<m; j++){
                matrix[h][j] = 1;
            }
        }
        for (int d = m-1; d >= 0; d--){
            for (int s = 0; s<d+1; s++){
                matrix[d][s] = 0;
                matrix[s][d-s] = 0;
            }
        }
        for (int h = 0; h< m; h++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[h][j]);
                System.out.print('\t');
            }
            print(' ');
        }
        i.next();
    }
    static void print(Object a){
        System.out.println(a);
    }
}