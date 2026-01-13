import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String filePath = "C:/Users/thanh/OneDrive/Desktop/data.txt";

        // File file = new File(filePath);
        // try (
        //     FileReader fileReader = new FileReader(file);
        //     BufferedReader bufferedReader = new BufferedReader(fileReader);
        // ) {
        //     // File file = new File(filePath);
        //     // FileReader fileReader = new FileReader(file);
        //     // BufferedReader bufferedReader = new BufferedReader(fileReader);

        //     // String line = bufferedReader.readLine();
        //     // System.out.println(line);

        //     // System.out.println(bufferedReader.readLine());
        //     // System.out.println(bufferedReader.readLine());
        //     // System.out.println(bufferedReader.readLine());
        //     // System.out.println(bufferedReader.readLine());
        //     // System.out.println(bufferedReader.readLine());

        //     // while(true) {
        //     //     String line = bufferedReader.readLine();

        //     //     if (line == null) {
        //     //         break;
        //     //     }

        //     //     System.out.println(line);
        //     // }

        //     String line = bufferedReader.readLine();
        //     System.out.println(line);

        //     String[] rawNumbers = line.split(", ");
        //     System.out.println(Arrays.toString(rawNumbers));

        //     int sum = 0;
        //     for (String rawNumber : rawNumbers) {
        //         sum += Integer.parseInt(rawNumber);
        //     }

        //     System.out.println("Sum: " + sum);

        //     // bufferedReader.close();
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }

        // File file = new File(filePath);
        // try (
        //     FileWriter fileWriter = new FileWriter(file, true);
        //     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // ) {
        //     bufferedWriter.write("Le Dao Tan Thanh!");
        //     bufferedWriter.newLine();
        //     bufferedWriter.write("FHD teacher!");
        //     bufferedWriter.newLine();
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }

        // Scanner sc = new Scanner(System.in);
		
		// File file = new File(filePath);
		// try (
		// 	FileWriter fileWriter = new FileWriter(file);
		// 	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		// ) {
		// 	String choice;
		// 	while(true) {
		// 		System.out.println("------------------------------");
		// 		System.out.println("1 -> Enter new line");
		// 		System.out.println("2 -> Flush current data");
		// 		System.out.println("3 -> Close program");
		// 		System.out.print("Your choice: ");
		// 		choice = sc.nextLine();
		// 		if(choice.equals("1")) {
		// 			System.out.print("Your data line: ");
		// 			bufferedWriter.write(sc.nextLine() + "\n");
		// 		} else if(choice.equals("2")) {
		// 			bufferedWriter.flush();
		// 		} else if(choice.equals("3")) {
		// 			break;
		// 		} else {
		// 			System.out.println("Invalid choice!");
		// 		}
		// 	}
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

        String inputFilePath = "‪C:/Users/thanh/OneDrive/Desktop/input.txt";
        // String outputFilePath = "C:/Users/thanh/OneDrive/Desktop/output.txt";

        // String inputFilePath = "data/input.txt";
        String outputFilePath = "data/output.txt";

        // int sum = 0;
        ArrayList<Integer> listSum = new ArrayList<Integer>();

        // Đọc, xử lý và tính toán
        File inputFile = new File(inputFilePath);
        try (
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            // Một chuỗi số chứa nhiều số cách nhau bằng dấu ", "
            // String line = bufferedReader.readLine();
            // String[] rawNumbers = line.split(", ");
            // for (String rawNumber : rawNumbers) {
            //     sum += Integer.parseInt(rawNumber);
            // }

            // Mỗi chuỗi số chứa 1 số và nằm trên nhiều dòng
            // while (true) {
            //     String rawNumber = bufferedReader.readLine();
            //     if (rawNumber == null) {
            //         break;
            //     }
            //     sum += Integer.parseInt(rawNumber);
            // }

            // Mỗi chuỗi số chứa nhiều số cách nhau bằng dấu ", " và các chuỗi số nằm trên nhiều dòng
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] rawNumbers = line.split(", ");
                int sum = 0;
                for (String rawNumber : rawNumbers) {
                    sum += Integer.parseInt(rawNumber);
                }
                listSum.add(sum);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Ghi kết quả
        File outputFile = new File(outputFilePath);
        try (
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            // bufferedWriter.write(String.valueOf(sum));

            for (Integer sum : listSum) {
                bufferedWriter.write(String.valueOf(sum));
                bufferedWriter.newLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // C:\Users\thanh\OneDrive\Desktop\input.txt
        // ‪C:\Users\thanh\OneDrive\Desktop\input.txt

    }

}
