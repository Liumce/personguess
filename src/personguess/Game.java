package personguess;

public class Game {
	Person u = new Person();
	Computer c = new Computer();
	public int times;
	public int compFist;
	public int i;
	public int partsum;
	//��Ϸ��ʼ��
	public void init(){
		u.name = "����";
		u.score = 0;
		c.name = "����";
		c.score = 0;
		times = 0;
	}
	public void cpoputerPlayer(int input){
		switch(input){
		case 1:c.name = "����";break;
		case 2:c.name = "��Ȩ";break;
		case 3:c.name = "�ܲ�";break;
		}
	}
	public void person(String name){
		u.name= name;
	}
	public void chuquan(int a){
		if(a==1||a==2||a==3){
			times+=1;
			u.chuquan(a);
			int b =(int)(Math.random()*3)+1;//����һ��1~3�������
			c.chuquan(b);
			if(a==1&&b==3||a==2&&b==1||a==3&&b==2){//���û�Ӯ������+1
				u.score+=1;
			}else if(a==3&&b==1||a==1&&b==2||a==2&&b==1){//������Ӯ��������1  
                c.score+=1;  
		}
	}else{
		System.out.println("��������������һ��0~3��������");
	}
}
	public void jisuan(){  
        System.out.println("һ�����ˣ�"+times+" �Σ� "+u.name+" Ӯ�ˣ�"+u.score+"�Σ� "+c.name+" Ӯ�ˣ�"+c.score+"�Σ�");  
    }  
    public void result(){  
        System.out.println("�����Ϊ��\nһ�����ˣ�"+times+" �Σ�"+c.name+"Ӯ�ˣ�"+c.score+"�Σ�");
}
    
    public int bac(){
	 //�����õ��Ľ�������ۼӲ�����ս�����ۼ�
		if(i==compFist){
			System.out.println("������;֣���˥���ٺ٣������ưɣ�");
			times++;
		}else if(i==1&&compFist==3){
			System.out.println("�������ϲ�� ��Ӯ�ˣ�");
			i++;
			times++;
		}else if(i==3&&compFist==2){
			System.out.println("�������ϲ�� ��Ӯ�ˣ�");
			i++;
			times++;
		}else if(i==1&&compFist==2){
			System.out.println("����������������ˣ��汿����");
			partsum++;
			times++;
		}else if(i==2&&compFist==1){
			System.out.println("�������ϲ�� ��Ӯ�ˣ�");
			i++;
			times++;
		}else if(i==2&&compFist==3){
			System.out.println("����������������ˣ��汿����");
			partsum++;
			times++;
		}else if(i==3&&compFist==1){
			System.out.println("����������������ˣ��汿����");
			partsum++;
			times++;
	
}
		 return bac();
   }
  
}