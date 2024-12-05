// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
// public class vis{
// public static void main(String[] args) throws Exception{
//     System.out.println("Hello");
// }
// }

// import java.util.Scanner;
// public class App{
//     public static int add(int a, int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt(); 
//         int num2 = sc.nextInt(); 
//         int sum =add(num1,num2);
//         System.out.println(sum);
//     }
// }


public class App{
    String name;
    int age;
    public App(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(name,age);
    }
}