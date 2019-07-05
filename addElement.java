import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Size");
        size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhap phan tu thu "+(i+1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nInput Number :");
        int num = scanner.nextInt();
        System.out.println("Input Index");
        int index = scanner.nextInt();

        if (index <= 0 || index >= arr.length - 1) {
            System.out.println("Nooooooooooooo");
        } else {
            for (int j = arr.length - 1; j >= index; j--){
                arr[j] = arr [j - 1];
            }
            arr[index-1] = num;
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
        }
    }
}