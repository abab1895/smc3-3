import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("반지름 값 >>");
		 String radius = null;
		Circle c = null;
		// 입력받은 반지름 값 radius 변수에 넣기
		 //  Circle 클래스를 통해 객체 c생성
		 System.out.println("반지름 "+ radius + "인 원의 넓이는 " + c.Area() + "이다.");  // 출력문
	}
}

class Circle{
	int radius;
	 // 생성자(radius) 값 초기화
	
	public double Area() {
		return radius;   
		// 원의 넓이 return (원의 넓이 = 반지름*반지름*3.14)
	}
}