package design.auxiliary;

import java.lang.management.MemoryManagerMXBean;
import java.util.Scanner;

public class SweetHome {

    FloorTiling floorTiling=new FloorTiling();
    HomeDecoration homeDecoration=new HomeDecoration();
    MemoBoard memoBoard = new MemoBoard();

    public void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("=============你回到了家===============");
        System.out.println("======================================");
        System.out.println("*            1. 装饰地毯             *");
        System.out.println("*            2. 装饰屋子             *");
        System.out.println("*           3. 查看留言版            *");
        System.out.println("*              4. 退出               *");
        System.out.println("======================================");
        sweetHomeLoop:
        while(scanner.hasNext()){
            switch(scanner.next()){
                case "1":
                    floorTiling.operation();
                    break;
                case "2":
                    System.out.println("装饰屋子");
                    homeDecoration.operation();
                    break;
                case "3":
                    System.out.println("查看留言版");
                    memoBoard.operation();
                    break;
                case "4":
                    System.out.println("退出");
                    break sweetHomeLoop;
            }
            System.out.println("======================================");
            System.out.println("=============你回到了家===============");
            System.out.println("======================================");
            System.out.println("*            1. 装饰地毯             *");
            System.out.println("*            2. 装饰屋子             *");
            System.out.println("*           3. 查看留言版            *");
            System.out.println("*              4. 退出               *");
            System.out.println("======================================");
        }
        scanner.close();
    }

}
