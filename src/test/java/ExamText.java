import le21.Exam;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamText {
    @Test
    public void textEcamWorkFlow() throws IOException{
        Exam a =new Exam();
        a.readQuestions();
        a.toTest();
        try(BufferedReader br = new BufferedReader(new FileReader("Exam.txt"))){
            String ersteFrageLine="";
            String line;
            while((line= br.readLine())!=null){
                if(line.contains("\\textbf{")){
                    ersteFrageLine = line;
                    break;
                }

            }
            assertTrue(ersteFrageLine.startsWith("\\textbf{"), "Die Frage muss fett formatiert sein!");
            assertTrue(ersteFrageLine.endsWith("}\\\\"), "Die Zeile muss mit dem LaTeX-Umbruch enden!");
        }
    }
}
