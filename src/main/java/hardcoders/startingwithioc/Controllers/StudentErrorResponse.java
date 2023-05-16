package hardcoders.startingwithioc.Controllers;

public class StudentErrorResponse {

    private int status;
    private String message;
    private String timeStamp;

    public StudentErrorResponse()
    {

    }
    public StudentErrorResponse(int status, String message, String timeStamp)
    {

        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    // These getters and setters will be filled by Jackson package (Java POJO) automatically
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getTimeStamp()
    {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
