package section5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employees = new ArrayList<>();
		readFile(employees);
		displayEmployees(employees);
	}
	
	
	public static void displayEmployees(ArrayList<String>employees) {
		for (String employee:employees) {
			System.out.println(employee);
		}
	}
	
	
	public static void readFile(ArrayList<String>employees) {
		String line="";
		BufferedReader fileInput=null;
		
		try {
			fileInput= new BufferedReader(new FileReader(new File("C:/JavaProgramming/employees.txt")));
			
			line=fileInput.readLine();
			System.out.println(line);
			while (line!=null) {
				line=fileInput.readLine();
				employees.add(line);
				
			}
			fileInput.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}catch (EOFException e){
			System.out.println("Não há linhas para ler!");
		}catch (IOException e){
			System.out.println("Não há linhas para ler!");

		}
	}
}
