package ch.heigvd.res.labs.roulette.net.protocol;

import ch.heigvd.res.labs.roulette.data.Student;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by Harbaoui Yosra,
 *            Passuello Arthur
 */
public class ListCommandResponse {

    private List<Student> students;

    public ListCommandResponse(){
        students = new LinkedList<>();
    }

    public ListCommandResponse(List<Student> students) {
        this.students = students;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return students;
    }
}
