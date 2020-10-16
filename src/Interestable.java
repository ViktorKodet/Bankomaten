/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-30 <br>
 * Time: 10:55 <br>
 * Project: IntelliJ IDEA <br>
 *     kanske skip ngl
 */
public interface Interestable {
    double interestRate = 0;

    default double getInterestRate(){
        return this.interestRate;
    }
    void setInterestRate(double interestRate);
}
