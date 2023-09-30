import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input jumlah indeks dari array 1D
        int jmlArray;
        System.out.print("Jumlah Index: ");
        jmlArray = input.nextInt();
        int[] angka = new int[jmlArray];

        for(int i = 0; i < jmlArray; i++){
            System.out.print("Masukkan nilai index ke-" + i + " : ");
            angka[i] = input.nextInt();
        }
        System.out.println();

        //output dengan menggunakan for loop
        System.out.println("Nilai yang tersimpan: ");
        for(int i = 0; i < jmlArray; i++){
            System.out.println("Index ke-" + i + ": " + angka[i]);
        }
        System.out.println();

        //pernyataan dengan if
        int bilangan;
        System.out.print("Masukkan angka untuk dicek: ");
        bilangan = input.nextInt();
        if(bilangan % 2 == 0){
            System.out.println(bilangan + " adalah bilangan genap.");
        }else{
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        System.out.println();

        //menggunakan while loop
        int n = 1, x;
        System.out.print("Banyak deret yang akan ditampilkan secara increment: ");
        x = input.nextInt();
        while(n <= x){
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n");

        //menggunakan do-while loop
        int deret;
        System.out.print("Banyak deret yang akan ditampilkan secara decrement: ");
        deret = input.nextInt();
        do{
            System.out.print(deret + " ");
            deret--;
        }while(deret > 0);
        System.out.println("\n");

        //menggunakan array multidimensi
        int[][] matriks = {{1, 4, 3}, {7, 4, 8}, {3, 1, 2}};
        System.out.println("Isi matriks: ");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(matriks[row][col] + " ");
            }
            System.out.println();
        }

    }
}
