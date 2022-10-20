package Summary;

import Classification_Parameter.Parameter_Menu;
import Customer_Data.CustomerView;
import Customer_Data.Customer_Menu;
import Summary.*;
import Store.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Classification_Parameter.Parameter_Menu.groupTypeSet;


public class SummaryMain {
    public static void SummaryMenu(){
        int menu = selectMenu();
        switch (menu) {
            case 1:
                //CustomerView.viewData();;
                groupTypeSet();
                break;
            case 2:
                Customers.groupByCustomerName();//이름
                break;
            case 3:
                SummaryBySpentTime.showByTime_Menu();//시간
                break;
            case 4:
                SummaryByPayment.showByPayment_Menu();//금액
                break;
            case 5:
                System.out.println("뒤로가기");
                break;
        }

    }




    private static int selectMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                System.out.println("====================");
                System.out.println("1. 등록 순으로 보기");
                System.out.println("2. 이름 순으로 보기");
                System.out.println("3. 사용  시간 순으로 보기");
                System.out.println("4. 사용 금액 순으로 보기");
                System.out.println("5. 뒤로가기");
                System.out.println("====================");
                System.out.print("메뉴 선택: ");
                int menu = Integer.parseInt(sc.next());
                if(menu<0 || menu > 4){
                    throw new InputMismatchException();
                }return menu;
            }catch(InputMismatchException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }catch(NumberFormatException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }catch (NegativeArraySizeException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }
        }
    }




}
