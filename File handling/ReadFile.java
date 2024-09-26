import java.io.*;
public class ReadFile{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter file name");
		String file=sc.nextLine();
		while(true){
			System.out.println("Enter the operation to perform:");
			System.out.println("1.Read file data");
			System.out.println("2.Write data in file");
			System.out.println("3.Append the data to file");
			System.out.println("4. Exit");
			System.out.println("Enter the operation perform:");
			
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					readFile(fileName);
					break;
				case 2:
					System.out.println("Enter the data to write:");
					String data=sc.nextLine();
					writeFile(fileName,data);
					break;
				case 3:
					break;
				case 4:
					System.out.println("Progarm ended");
					sc.close();
					break;
			}
		}
	}
	public static void readFile(String readFile){
		try(BufferedReader br=new BufferedReader(new FileReader(fileName))) {
			String line;
			System.out.println("File content:");
			while((line==br.readLine())!=null){
				System.out.println(line);
			}
		} catch(FileNotFoundException e){
			System.out.println("File not found:"+fileName);	
		} catch(IOException e){
			System.out.println("Error reading file:" +e.getMessage());
		}
	}
	public static void writeFile(String readFile,String data){
		try(BufferedWriter br=new BufferedWriter(new FileWriter(fileName))){
			br.write(data);
			System.out.println("Data written in to file");
		}catch (IOException e){
			System.out.println("Error writing to file:"+e.getMessage());
		}
	}
}