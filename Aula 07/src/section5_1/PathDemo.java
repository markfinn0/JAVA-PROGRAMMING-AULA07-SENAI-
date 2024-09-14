package section5_1;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path[]paths= new Path[5];
		paths[0]=Paths.get("C:\\JavaProgramming\\employees.txt");
		paths[1]=Paths.get("C:/JavaProgramming/employees.txt");
		paths[2]=Paths.get("C:","JavaProgramming","employees.txt");
		paths[3]=Paths.get("employees.txt");
		paths[4]=Paths.get(URI.create("file:///~/employees.txt"));
		for (int i=0;i<paths.length;i++) {
			System.out.println("Caminho do path[" + i +"]: "+paths[i]);
		}
		System.out.println(paths[0].getFileName());
		System.out.println(paths[0].getParent());
		Path rp=Paths.get("C:/JavaProgramming/IO/../NI02//demoFiles.txt");
		System.out.println("rp.normalize() ["+rp.normalize()+"]");
		
		
		Path sp=Paths.get("C:/JavaProgramming/IO/../NI02//demoFiles.txt");
		System.out.println(sp.getNameCount()+" "+sp.subpath(0, 3));
		
		
	}
	
	
	

}
