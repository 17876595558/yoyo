import java.io.*;
public class FileTest {
	public static void main(String[] args) {
		File file = new	File("D:/word.txt");
		// TODO �Զ����ɵķ������
		try{
		FileOutputStream out = new FileOutputStream(file);
		byte buy[] = "����ذ����㣬��ȴ����һ��ɵ��,ɵ���������㣬���ɵ�ƻ�Ҫɵ�ơ�".getBytes();
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
