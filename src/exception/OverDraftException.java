package exception;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:48 2018/10/31
 *@Modified By:
 */
public class OverDraftException extends Exception {
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverDraftException(String msg, double deficit) {
        super(msg);
        this.deficit=deficit;
    }
}
