//package d07;
//
//class Score {
//
//	private int kor;
//	private int math;
//	private int computer;
//	
//	public int getKor() {
//		return kor;
//	}
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	public int getMath() {
//		return math;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	public int getComputer() {
//		return computer;
//	}
//	public void setComputer(int computer) {
//		this.computer = computer;
//	}
//	
//	
//	public Score() {
//		kor=0;
//		math=0;
//		computer=0;
//	}
//	
//	public Score(int kor, int math, int computer) {
//		this.kor = kor;
//		this.math = math;
//		this.computer = computer;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Score [kor=" + kor + ", math=" + math + ", computer=" + computer + "]";
//	}
//
//}
//
//public class Student {
//
//	private String name;
//	private int grade;
//	private Score score;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getGrade() {
//		return grade;
//	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	public Score getScore() {
//		return score;
//	}
//	public void setScore(Score score) {
//		this.score.setKor(score.getKor());
//		this.score.setComputer(score.getComputer());
//		this.score.setMath(score.getMath());
//	}
//	
//	
//	public Student() {
//		name="아무개";
//		grade=1;
//		score = new Score();
//	}
//	
//	public Student(String name, int grade, Score score) {
//		this.name = name;
//		this.grade = grade;
//		this.score = score;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", grade=" + grade + ", score=" + score + "]";
//	}
//}