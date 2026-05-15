package le21;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exam {
    private List<Question> fragen =new ArrayList<>();
    String readHeaderFromFile() throws IOException {
        // Dummy-Implementierung für die Logik
        return "\\documentclass{article}\n\\begin{document}\n";
    }
    public void readQuestions()throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("questions.csv"))){
            String line;
            while((line=br.readLine())!=null){
                Question q =Question.toQuestion(line);
                fragen.add(q);

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void toTest()throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Exam.txt"))){
            bw.write(readHeaderFromFile());
            for(Question q:fragen){
                bw.write("\\textbf{" + q.text + "}\\\\");
                bw.newLine();
            }
            bw.write("\\end{dokument}");
        }
    }
    public static void main(String[]args)throws IOException{
        Exam meinExam = new Exam();
        meinExam.readQuestions();
        meinExam.toTest();
    }
}