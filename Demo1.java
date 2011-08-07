import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1{
	public static int countLines(String path){
		File file = new File(path);
		BufferedReader reader=null;
		int ret=0;
		try{
			reader=new BufferedReader(new FileReader(file));
			String line=null;
			while((line=reader.readLine())!=null)
				{
					ret++;
				}
		}catch(IOException e){
			//process io exception
		}finally{
			if(reader!=null){
				try{
					reader.close();
				}catch(IOException e){
					//process io exception
				}
			}
		}
		return ret;
	}
}