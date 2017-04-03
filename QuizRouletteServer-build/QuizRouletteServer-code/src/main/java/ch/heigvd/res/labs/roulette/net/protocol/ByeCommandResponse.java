package ch.heigvd.res.labs.roulette.net.protocol;

/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "BYE" command defined in the protocol specification. The
 * JsonObjectMapper utility class can use this class.
 *
 * Created by Harbaoui Yosra,
 *            Passuello Arthur
 */
public class ByeCommandResponse {

    private String status;
    private int nbCommands;

    public ByeCommandResponse() {
        this.status = "Failure";
        this.nbCommands = 0;
    }

    public ByeCommandResponse(int nbCommands) {
        this.status = "Success";
        this.nbCommands = nbCommands;
    }

    public ByeCommandResponse(String status, int nbCommands) {
        this.status = status;
        this.nbCommands = nbCommands;
    }

    public int getNumberOfCommands() {
        return nbCommands;
    }

    public String getStatus() {
        return status;
    }

    public void setNumberOfCommands(int nbCommands) {
        this.nbCommands = nbCommands;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
