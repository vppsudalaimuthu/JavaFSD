package q38.oops.trainee;

public class Trainee {

	// encapsulate fields with private modifier
	private static final String BATCH_CODE = "CHNFSD";
	private long employeeId;
	private String name;

	// default constructor
	Trainee() {
		employeeId = 0;
		name = "";
	}

	// parameterized constructor
	Trainee(long employeeId, String name) {

		this.employeeId = employeeId;
		this.name = name;
	}

	// getters and setters
	public long getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	// display the trainee details
	public void display() {
		System.out.println("Employee Id = " + employeeId);
		System.out.println("Name = " + name);
		System.out.println("Batch code = " + BATCH_CODE);
	}

}
