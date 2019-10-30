package design.mainAuxiliary;

import org.jaxen.function.FloorFunction;

import java.util.Scanner;
import design.home.tile.*;
public class SweetHome {
    public void main(){

        FloorTiling floorTiling=new FloorTiling();

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
                    break;
                case "3":
                    System.out.println("查看留言版");
                    //查看当前-以前
                    break;
                case "4":
                    System.out.println("退出");
                    break sweetHomeLoop;
            }
        }
        scanner.close();
    }

}
