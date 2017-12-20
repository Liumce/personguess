package personguess;

public class basic {
	public String basic(int a,int b){
		String [][]win = new String[3][3];
		win[0][0] = "和局，真衰！嘿嘿，等着瞧吧！";
		win[0][1] = "^_^你输了，真笨!";
		win[0][2] = "恭喜你赢了！";
		win[1][0] = "恭喜你赢了！";
		win[1][1] = "和局，真衰！嘿嘿，等着瞧吧！";
		win[1][2] = "^_^你输了，真笨!";
		win[2][0] = "^_^你输了，真笨!";
		win[2][1] = "恭喜你赢了！";
		win[2][2] = "和局，真衰！嘿嘿，等着瞧吧！";
		return win[a][b];
	}
}
