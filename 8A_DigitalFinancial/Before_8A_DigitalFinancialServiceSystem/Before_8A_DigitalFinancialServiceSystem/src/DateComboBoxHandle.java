import javax.swing.JComboBox;

public class DateComboBoxHandle {
	public static JComboBox month() {
		String Months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return new JComboBox(Months);
	}

	public static JComboBox day() {
		JComboBox day = new JComboBox();
		for (int i = 1; i <= 31; i++) {
			String days = "" + i;
			day.addItem(days);
		}
		return day;
	}

	public static JComboBox year() {
		JComboBox year = new JComboBox();
		for (int i = 2000; i <= 2015; i++) {
			String years = "" + i;
			year.addItem(years);
		}
		return year;
	}
}
