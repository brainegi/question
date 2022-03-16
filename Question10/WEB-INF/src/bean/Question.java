package bean;

public class Question {

	private int num;				//お客様番号
	private String name;			//お客様名前
	private String age;			//お客様年齢
	private String sex;				//性別
	private String adress;		//住所
	private String mail;			//メールアドレス
	private String select;			//項目
	private String text;			//詳細記入欄
	private String date;			//送信日時

	//コンストラクタ定義
	public Question() {
		this.num = 0;
		this.name = "";
		this.age = "";
		this.sex = "";
		this.adress = "";
		this.mail = "";
		this.select = "";
		this.text = "";
		this.date = "";
	}

	//番号-get・setメソッド
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	//名前-get・setメソッド
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//年齢-get・setメソッド
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	//性別-get・setメソッド
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	//住所-get・setメソッド
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


	//メールアドレス-get・setメソッド
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	//お問い合わせ項目-get・setメソッド
	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}


	//詳細記入欄-get・setメソッド
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//送信日時-get・setメソッド
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
