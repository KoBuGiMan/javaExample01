package employee;

public abstract class EmployeeDefault {

	private String job;
	private String name;
	private String age;
	private String years;
	private String work;

	public EmployeeDefault(String name, String age, String years, String work) {
		this.name = name;
		this.age = age;
		this.years = years;
		this.work = work;

	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}
