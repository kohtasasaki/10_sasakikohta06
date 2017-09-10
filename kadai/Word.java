
public class Word{
	//変数の宣言
	private String english; //英単語
	private String japanese; //日本語
	
	
	//コンストラクターの定義　これやる意味は？→初期値（実体を作る）の設定
	public Word(String english,String japanese){
		this.english = english;
		this.japanese = japanese;
	}

	//アクセサーの定義
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getJapanese() {
		return japanese;
	}
	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}	
	
}