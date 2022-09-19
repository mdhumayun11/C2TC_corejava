public class Assign2_ThisKeyword {
    int rollno;
	public  void This_key_word(int rollno){
		this.rollno=rollno;
	}

	public static void main(String[] args) {
		This_key_word rollno=new This_key_word();
		System.out.println("the rollno is ="+rollno.rollno);
	}
}
