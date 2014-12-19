import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        System.out.println(x);

//        System.out.println("Hello!");
//
//        System.out.println("What's your name?");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//
//        try {
//            str = br.readLine();
//        } catch (IOException e) {
//            //e.printStackTrace();
//            str = "Unknown";
//        }
//
//        System.out.println("Hello, " + str + "!");
//
//        System.out.println("How old are you?");
//        int age;
//
//        try {
//            str = br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            age = Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            age = 0;
//        }
//
//        System.out.println("You were probably born in " + (2014 - age));

        Bank bank = new Bank();
        Person first = new Person("First", 37);
        Person second = new Person("Second", 77);
        long id;
        id = bank.addClient(second);
        System.out.println(second.getName() + " has account with number " + id);
        id = bank.addClient(first);
        System.out.println(first.getName() + " has account with number " + id);

        /* At home: back with unique id for clients
        * - create some accounts
        * - add money
        * - check account for client
        * - get money from the account
        */

        //About coping objects
//        Foo f = new Foo();
//        Boo1 b1 = new Boo1();
//        Boo2 b2 = new Boo2();
//        f.runTest();
//        b1.runTest();
//        b2.runTest();
//
//        Foo t = new Boo1();
//        t.runTest();
//        //t.test;
//
//        f = t;
//        f.runTest();
    }
}
