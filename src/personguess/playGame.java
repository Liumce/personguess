package personguess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class playGame {

	public static void main(String[] args) {
		int juese;
		int i;//��ʾ��ҳ�ȭ������
		int partsum = 0;
		Game g = new Game();
		g.init();
		System.out.println("-------------�� ӭ �� �� �� Ϸ �� ��---------------"); 
		System.out.println("	   *********************"); 
		System.out.println("	       **��ȭ����ʼ**"); 
		System.out.println("	   *********************"); 
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		Scanner input = new Scanner(System.in);
		try{
			juese = input.nextInt();
			 while(juese!=1&&juese!=2&&juese!=3){//�������ݱ�����һ��1~3��������������������  
		            System.out.println("���������Ӧ����һ��1~3�����������������룡");  
		            juese=input.nextInt();  
		        }  
			 g.cpoputerPlayer(juese);
			  System.out.println("����������������");  
		        g.person(input.next());  
		        System.out.println("��ȭ��������0�˳���");  
		        i=input.nextInt();  
		        while(i!=0){//���û�������0��ִ��ѭ���壬һֱ����Ϸ  
		            g.chuquan(i);  
		            g.jisuan();  
		            System.out.println("\n��ȭ��������0�˳���");  
		            i=input.nextInt(); 
		        }  
		        System.out.println("��Ϸ������");  
		        g.result();  
		        
		        if(i>partsum){
					System.out.println("�������ϲ!��Ӯ��");
					System.out.println("--------------------");
					System.out.println();
				}else if(i<partsum){
					System.out.println("������ߣ������ˣ��������ͼ��ͣ�");
					System.out.println("--------------------");
					System.out.println();
				}else if(i==partsum){
					System.out.println("��������ƽ�֣��´��ٺ���һ�����£�");
					System.out.println("--------------------");
					System.out.println();

				}
		  }catch(InputMismatchException e){  
	            System.out.println("�������г�������Ƿ��ַ���");  
		  }finally{  
	            System.out.println("\nллʹ�ã�");  
	        }  
	        input.close();  
		}
	
		
	}

