package book;
import java.util.Scanner;
public class menu {
	static Scanner scanner = new Scanner(System.in);
    static shop shop = new shop();
    public static void loadMenu(){
        System.out.println("��ӭʹ��ͼ�����ϵͳ");
        while (true){
            System.out.println("----------------");
            System.out.println("0.������а�");
            System.out.println("1.����ͼ��");
            System.out.println("2.��ѯͼ��");
            System.out.println("3.ɾ��ͼ��");
            System.out.println("4.���ͼ��");
            System.out.println("5.�黹ͼ��");
            System.out.println("6.����ͼ��");
            System.out.println("7.�˳�");
            System.out.println("----------------");
            System.out.print("��ѡ��");
            int input = scanner.nextInt();
            switch (input){
                case 0:
                    shop.borrowinglist();
                    break;
                case 1:
                    shop.addBook();
                    break;
                case 2:
                    shop.selectBook();
                    break;
                case 3:
                    shop.deleteBook();
                    break;
                case 4:
                    shop.lendBook();
                    break;
                case 5:
                    shop.returnBook();
                    break;
                case 6:
                    shop.saveBook();
                    break;
                case 7:
                    System.out.println("ллʹ�ã�");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n�����������������룡\n\n");
                    loadMenu();
            }
        }
    }
}

