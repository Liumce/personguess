package personguess;

public class basic {
	public String basic(int a,int b){
		String [][]win = new String[3][3];
		win[0][0] = "�;֣���˥���ٺ٣������ưɣ�";
		win[0][1] = "^_^�����ˣ��汿!";
		win[0][2] = "��ϲ��Ӯ�ˣ�";
		win[1][0] = "��ϲ��Ӯ�ˣ�";
		win[1][1] = "�;֣���˥���ٺ٣������ưɣ�";
		win[1][2] = "^_^�����ˣ��汿!";
		win[2][0] = "^_^�����ˣ��汿!";
		win[2][1] = "��ϲ��Ӯ�ˣ�";
		win[2][2] = "�;֣���˥���ٺ٣������ưɣ�";
		return win[a][b];
	}
}
