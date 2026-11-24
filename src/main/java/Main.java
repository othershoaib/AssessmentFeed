import assessments.AssessmentFeed;
import students.MScStudent;
import students.Student;
import students.UGStudent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (String cid : AssessmentFeed.getCIDs()) {
            if (AssessmentFeed.getStudentType(cid).equals("MSc")) {

                students.add(new MScStudent(cid));
            } else if (AssessmentFeed.getStudentType(cid).equals("UG")){
                students.add(new UGStudent(cid));
            }
        }

        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", CID: " + s.getCid() + ", Type: " + s.getType());

            System.out.println();
        }

        new AssessmentWindow(students).setVisible(true);
    }
}