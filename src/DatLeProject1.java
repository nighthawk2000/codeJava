import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class DatLeProject1 {
    public static void main(String[] args) throws IOException{
        var scan = new Scanner(System.in);
        System.out.println("what is your name?: ");
        var name = scan.nextLine();
        var fileGrade = name + ".txt";
        var gradeTotal = 0.0;
        var addingGrade = 0.0;
        var final_result = 0.0;
        String averageGrade = Files.readString(Paths.get(fileGrade));
        String[] split_Grade = averageGrade.split("\n");
        for(String grade:split_Grade){
            float num = Float.parseFloat(grade);
            addingGrade+= num;
            gradeTotal =  gradeTotal+ 1.0;
        }
        final_result=addingGrade/gradeTotal;
        System.out.println(name+ "the overall grade is:  " + final_result);
    }

}
