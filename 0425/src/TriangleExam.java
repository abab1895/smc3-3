
public class TriangleExam {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2 , 17.3);
		System.out.println("�갢���� ����: "+ tr.getArea());
		tr.setSize(7.5, 9.2);
		System.out.println("����� �ﰢ���� ����: "+ tr.getArea());
	}

}
class Triangle {
	double bottom;
	double height;
	public Triangle(double bt, double hg) {
		this.bottom = bt;
		this.height = hg;
	}
	public void setSize(double d, double e) {
		// TODO Auto-generated method stub
		
	}
	public double getArea() {
		return bottom*height/2;
		
	}
}
