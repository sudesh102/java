import java.io.*;
import java.util.*;

public class Stu_Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "";
        while (true) {
            System.out.println("1. To enter the student info.\n2. To retrieve student info.\n3. Stop ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter file name:");
                    fileName = sc.nextLine();
                    System.out.println("Enter PRN:");
                    String PRN = sc.nextLine();
                    System.out.println("Enter Class:");
                    String className = sc.nextLine();
                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                    System.out.println("Enter Weight (in kg):");
                    float wt = sc.nextFloat();
                    System.out.println("Enter Height (in ft):");
                    float ht = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Enter City:");
                    String city = sc.nextLine();
                    System.out.println("Enter Phone:");
                    String ph = sc.nextLine();
                    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
                        dos.writeUTF(PRN);
                        dos.writeUTF(className);
                        dos.writeInt(age);
                        dos.writeFloat(wt);
                        dos.writeFloat(ht);
                        dos.writeUTF(city);
                        dos.writeUTF(ph);
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (fileName.isEmpty()) {
                        System.out.println("No file is specified. Please enter file data first");
                        break;
                    }
                    try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
                        String prn = dis.readUTF();
                        String classname = dis.readUTF();
                        int ageRead = dis.readInt();
                        float wtRead = dis.readFloat();
                        float htRead = dis.readFloat();
                        String cityRead = dis.readUTF();
                        String phRead = dis.readUTF();
                        System.out.println("PRN No: " + prn);
                        System.out.println("Class: " + classname);
                        System.out.println("Age: " + ageRead);
                        System.out.println("Weight: " + wtRead);
                        System.out.println("Height: " + htRead);
                        System.out.println("City: " + cityRead);
                        System.out.println("Phone: " + phRead);
                    } catch (IOException e) {
                        System.out.println("Error reading from file: " + e.getMessage());
                    }
                    break;
                    
                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
