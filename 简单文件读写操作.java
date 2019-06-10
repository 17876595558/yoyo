import java.io.*;
public class FileTest {
	public static void main(String[] args) {
		File file = new	File("D:/word.txt");
		// TODO 自动生成的方法存根
		try{
		FileOutputStream out = new FileOutputStream(file);
		byte buy[] = "深深地爱着你，你却爱着一个傻逼,傻逼他不爱你，你比傻逼还要傻逼。".getBytes();
		out.write(buy);
		out.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
		try {
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt,0,len));
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
