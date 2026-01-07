import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {

	private String id;
	private String name;
    private int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
        this.age = age;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String dobString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dobDate = sdf.parse(dobString);
			Calendar dobCalendar = Calendar.getInstance();
            dobCalendar.setTime(dobDate);

            Calendar currentCalendar = Calendar.getInstance();

            this.age = currentCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR) - 1;

            if (currentCalendar.get(Calendar.MONTH) >= dobCalendar.get(Calendar.MONTH)) {
                if (currentCalendar.get(Calendar.DAY_OF_MONTH) >= dobCalendar.get(Calendar.DAY_OF_MONTH)) {
                    this.age++;
                }
            }
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }

    public String getInfo() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}