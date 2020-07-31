import java.util.LinkedList;
import java.util.Scanner;


public class BaiTap1 {
	public static void luuSoNhap (Scanner scan,LinkedList<Integer> listSo) {
		System.out.println("Mời bạn nhập số muốn lưu vào list");
		int i = scan.nextInt(); 
		listSo.add(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int soNhap;
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> listSo = new LinkedList <Integer>();
		
		luuSoNhap(scan, listSo);
	}
}
		
