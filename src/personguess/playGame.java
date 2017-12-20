package personguess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class playGame {

	public static void main(String[] args) {
		int juese;
		int i;//表示玩家出拳的数字
		int partsum = 0;
		Game g = new Game();
		g.init();
		System.out.println("-------------欢 迎 进 入 游 戏 世 界---------------"); 
		System.out.println("	   *********************"); 
		System.out.println("	       **猜拳，开始**"); 
		System.out.println("	   *********************"); 
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		Scanner input = new Scanner(System.in);
		try{
			juese = input.nextInt();
			 while(juese!=1&&juese!=2&&juese!=3){//输入内容必须是一个1~3的整数，否则重新输入  
		            System.out.println("输入的内容应该是一个1~3的整数，请重新输入！");  
		            juese=input.nextInt();  
		        }  
			 g.cpoputerPlayer(juese);
			  System.out.println("请输入您的姓名：");  
		        g.person(input.next());  
		        System.out.println("出拳：（输入0退出）");  
		        i=input.nextInt();  
		        while(i!=0){//若用户不输入0，执行循环体，一直玩游戏  
		            g.chuquan(i);  
		            g.jisuan();  
		            System.out.println("\n出拳：（输入0退出）");  
		            i=input.nextInt(); 
		        }  
		        System.out.println("游戏结束！");  
		        g.result();  
		        
		        if(i>partsum){
					System.out.println("结果：恭喜!你赢了");
					System.out.println("--------------------");
					System.out.println();
				}else if(i<partsum){
					System.out.println("结果：哼！你输了，哈哈加油加油！");
					System.out.println("--------------------");
					System.out.println();
				}else if(i==partsum){
					System.out.println("结果：打成平手，下次再和你一决高下！");
					System.out.println("--------------------");
					System.out.println();

				}
		  }catch(InputMismatchException e){  
	            System.out.println("程序运行出错：输入非法字符！");  
		  }finally{  
	            System.out.println("\n谢谢使用！");  
	        }  
	        input.close();  
		}
	
		
	}

