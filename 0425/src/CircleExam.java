import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 String radius = null;
		Circle c = null;
		// �Է¹��� ������ �� radius ������ �ֱ�
		 //  Circle Ŭ������ ���� ��ü c����
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");  // ��¹�
	}
}

class Circle{
	int radius;
	 // ������(radius) �� �ʱ�ȭ
	
	public double Area() {
		return radius;   
		// ���� ���� return (���� ���� = ������*������*3.14)
	}
}