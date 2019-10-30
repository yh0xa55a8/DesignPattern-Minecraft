package design.auxiliary;
import design.home.message.*;

import java.util.Scanner;

public class MemoBoard {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();
    public static void operation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("*          1. 查看最新留言            *");
        System.out.println("*           2. 查看留言版             *");
        System.out.println("*             3. 写留言               *");
        System.out.println("*              4. 退出                *");
        System.out.println("======================================");
        sweetHomeLoop:
        while(scanner.hasNext()){
            switch(scanner.next()){
                case "1":
                    HomeInit.floorTiling.operation();
                    break;
                case "2":
                    System.out.println("装饰屋子");
                    HomeInit.homeDecoration.operation();
                    break;
                case "3":
                    System.out.println("查看留言版");
                    HomeInit.memoBoard.operation();
                    break;
                case "4":
                    System.out.println("退出");
                    break sweetHomeLoop;
            }
            System.out.println("======================================");
            System.out.println("*          1. 查看最新留言            *");
            System.out.println("*           2. 查看留言版             *");
            System.out.println("*             3. 写留言               *");
            System.out.println("*              4. 退出                *");
            System.out.println("======================================");
        }
        scanner.close();

    }
}
