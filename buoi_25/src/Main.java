import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        // Ghi dữ liệu đối tượng (ghi dữ liệu thô)
        
        // ArrayList<Student> list = new ArrayList<>();
        // list.add(new Student("S01", "A", 29));
        // list.add(new Student("S02", "B", 23));
        // list.add(new Student("S03", "C", 21));

        // File file = new File("data/student.txt");
		// try (
		// 	FileWriter fileWriter = new FileWriter(file);
		// 	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		// ) {
		// 	for (Student stu : list) {
        //         bufferedWriter.write(stu.stringToFile());
        //         bufferedWriter.newLine();
        //     }
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

        // Đọc dữ liệu đối tượng (đọc dữ liệu thô)

        // ArrayList<Student> list = new ArrayList<>();

        // File file = new File("data/student.txt");
		// try (
		// 	FileReader fileReader = new FileReader(file);
		// 	BufferedReader bufferedReader = new BufferedReader(fileReader);
		// ) {
		// 	while(true) {
		// 		String line = bufferedReader.readLine();
		// 		if(line == null) {
		// 			break;
		// 		}

		// 		// Student stu = new Student();
        //         // stu.extractFromString(line);

        //         Student stu = new Student(line);

        //         list.add(stu);
		// 	}
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

        // for (Student stu : list) {
        //     System.out.println(stu);
        // }

        // Ghi dữ liệu đối tượng (ghi dữ liệu byte)

        // ArrayList<Student> list = new ArrayList<>();
        // list.add(new Student("S01", "A", 29));
        // list.add(new Student("S02", "B", 23));
        // list.add(new Student("S03", "C", 21));

        // File file = new File("data/student.dat");
		// try (
		// 	FileOutputStream fos = new FileOutputStream(file);
        //     ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ) {
		// 	for (Student stu : list) {
        //         oos.writeObject(stu);
        //     }
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

        // File file = new File("data/student.dat");
		// try (
		// 	FileOutputStream fos = new FileOutputStream(file);
        //     ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ) {
		// 	oos.writeObject(new Student("S01", "A", 21));
        //     oos.writeObject("Le Dao Tan Thanh");
        //     oos.writeObject(new Student("S02", "B", 24));
        //     oos.writeObject("Java 29");
        //     oos.writeObject(new Student("S03", "C", 26));
        //     oos.writeObject("Fullhouse Dev");
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

        // Đọc dữ liệu đối tượng (đọc dữ liệu byte)

        ArrayList<Student> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        File file = new File("data/student.dat");
		try (
			FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			while(true) {
				Object obj = ois.readObject();
                if (obj instanceof Student) {
                    list.add((Student)obj);
                }
                if (obj instanceof String) {
                    list2.add((String)obj);
                }
			}
		} catch (EOFException e) { 
            // Done!
        }catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

        System.out.println("List<Student>");
        for (Student stu : list) {
            System.out.println(stu);
        }

        System.out.println("List<String>");
        for (String str : list2) {
            System.out.println(str);
        }

    }

}
