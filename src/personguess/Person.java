package personguess;

public class Person {
	public String name;
	public int score;
	public void chuquan(int i){
		switch(i){
		case 1:System.out.println("本人出拳：剪刀");break;
		case 2:System.out.println("本人出拳：石头");break;
		case 3:System.out.println("本人出拳：布");break;
		default:System.out.println("输入错误！此次输入无效");
		}
	}
}
