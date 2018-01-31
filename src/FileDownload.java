
import java.nio.file.FileSystems;
import java.io.File;

public class FileDownload {
	public static void main(String args[])
	{
		String downloadpath = "C:\\Users\\soumya.billava\\Desktop\\Automation\\downloads";
		boolean flag=false;
	    File dir = new File(downloadpath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    for (int i = 0; i < files.length; i++) {
	    	System.out.println(files[i].getName());
	    	if(files[i].getName().contains(".pdf")) {
	    		flag=true;
	    	}
	    }
	    if(flag==true)
	    	System.out.println("true");
	    else
	    	System.out.println("false");
	    
	}
}
