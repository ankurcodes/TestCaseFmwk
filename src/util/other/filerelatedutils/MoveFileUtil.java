package util.other.filerelatedutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MoveFileUtil {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 8, 10, 11, 13, 15, 16, 18, 22, 23, 24 };
		for (int i : arr) {
			String src="/Users/ankurkumar/Desktop/TestCases/Ques_"+i+"/small/out/output6.txt";
			String dest="/Users/ankurkumar/Desktop/TestCases/Ques_" + i + "/large/out/output6.txt";
			moveToLoc(src, dest);
		}
	}

	public static void moveToLoc(String source, String dest) {
		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File afile = new File(source);
			File bfile = new File(dest);

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}

			inStream.close();
			outStream.close();

			// delete the original file
			afile.delete();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}