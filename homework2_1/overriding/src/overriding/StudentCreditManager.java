package overriding;

public class StudentCreditManager extends BaseCreditManager {
	public double calculate(double sum) {
		return sum * 1.10;
	}

}
