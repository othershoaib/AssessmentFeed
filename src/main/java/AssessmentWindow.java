import assessments.AssessmentFeed;
import model.Assessment;
import students.Student;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AssessmentWindow extends JFrame {
    private static String[] assessmentType = {
            AssessmentFeed.PROGRAMMING_TEST, AssessmentFeed.AI_PROJECT, AssessmentFeed.DESIGN_VIVA
    };

    public AssessmentWindow(List<Student> students) {
        super("Assessments");
        JPanel grid = new JPanel(new GridLayout(0, 1));



        JPanel header = new JPanel(new GridLayout(1, 7));


        header.add(new JLabel("Name"));
        header.add(new JLabel("Cid"));
        header.add(new JLabel("Type"));


        for (String at : assessmentType){
            header.add(new JLabel("<html>" + at + "</html>"));
        }
        header.add(new JLabel("mark"));
        grid.add(header);

        for (Student s : students) {
            JPanel panel = new JPanel(new GridLayout(1, 7));

            panel.add(new JLabel(s.getName()));
            panel.add(new JLabel(s.getCid()));
            panel.add(new JLabel(s.getType()));


            for (String at : assessmentType) {
                Assessment a = s.getAssessment(at);
                panel.add(new JLabel(a == null ? "N/A" : String.format("%.2f%%", a.getMark())));


            }
            panel.add(new JLabel(String.format("%.2f%%", s.getModuleMark())));
            grid.add(panel);
        }

        add(grid);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}