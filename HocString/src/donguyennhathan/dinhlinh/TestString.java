package donguyennhathan.dinhlinh;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {        
		              // 01234
			String str= "Sài Gòn người ta bán bông Gòn";
			// index là chỉ mục (index chạy từ 0 --> n-1)
			int vt=str.indexOf("Gòn");
			System.out.println(vt);
			int vtCuoi=str.lastIndexOf("Gòn");
			System.out.println(vtCuoi);
			String sv="K184111444;Đỗ Nguyễn Nhật Hàn;K18411C;UEL";
			//Hàm sử dụng nhiều nhất trong lập trình
			//Dữ liệu trên web thường dc lưu dưới dạng XML
			//Các dữ liệu đc lưu trên web đều có quy luật
			String[] arr= sv.split(";");
			for(int i=0; i<arr.length;i++)
			{
				String s= arr[i];
				System.out.println(s);
			}
			String ten="Hàn";
			for(int i=0; i<10;i++)
			{
				StringBuilder builder= new StringBuilder();
				//Ko nên dùng dấu + để nối chuỗi trong vòng lặp
				// Crawl Data , Data mining
				// Máy sẽ tự động cấp phát 1 vùng nhớ mới cho nó
				// Tốn dung lượng máy
				// Sử dụng StringBuilder trong TH vòng lặp
				// Sử dụng dấu cộng khi chỉ nối 1 chuỗi đơn thuần
				builder.append("Hàn");
				builder.append(i);
				System.out.println(builder);		
			} //      0123456
			String s="@123Đỗ Nguyễn Nhật Hàn";
			String kq=s.substring(4,6);
			System.out.println(kq);
			String trim= "          Đỗ Nguyễn Nhật Hàn       ";
			trim= trim.trim();
			System.out.println(trim);
			
			// Ta có chuối: D:\Class1K\nhaccuatui\nhactrutinh\Closer.mp3
			// 1) Tách Closer.mp3
			// 2) Tách Closer bỏ mp3
			
			// Tao có chuỗi donguyenhathan20@gmail.com;
			// Tao có chuỗi 01-DoNguyenNhatHan-nhathando@gmail.com
	}

}
