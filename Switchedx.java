
public class Switchedx {
	
	public static void main(String[] args) {
		int score=89;    //initialize value according to question
		char grade;
		int c=score/10;

		System.out.println(c);
		switch(c) {

		        case 10: grade = 'A';
		        case  9: grade = 'A'; break;
		        case  8: grade = 'B';break;
		        case  7: grade = 'C';
		        case  6: grade = 'C'; break;
		        case  5: grade = 'D';break;
		        default: grade = 'F';
		}
		System.out.println(grade);
	}

}
