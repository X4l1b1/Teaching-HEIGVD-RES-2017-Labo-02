package ch.heigvd.res.labs.roulette.net.protocol;

/**
 *  * This class is used to serialize/deserialize the response sent by the server
 * when processing the "LOAD" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 *
 * Created By Harbaoui Yosra,
 *            Passuello Arthur
 */
public class LoadCommandResponse {

    private String status;
    private int numberOfNewStudents;

    public LoadCommandResponse() {}

    public LoadCommandResponse(String status){
        this.status = status;
        numberOfNewStudents = 0;
    }

    public LoadCommandResponse(String status, int newStudents) {
        this.status = status;
        this.numberOfNewStudents = newStudents;
    }


    public int getNumberOfStudents() {
        return numberOfNewStudents;
    }

    public void setNumberOfNewStudents(int newStudents) {
        this.numberOfNewStudents = newStudents;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
