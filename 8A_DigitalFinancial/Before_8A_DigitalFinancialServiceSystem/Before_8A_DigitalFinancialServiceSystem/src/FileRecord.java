import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FileRecord {
	private String no;
	private String name;
	private String month;
	private String day;
	private String year;
	private String deposit;
	public FileRecord() {
		no = name = month = day = year = deposit="";
	}
	public FileRecord(String no, String name, String month, String day, String year, String deposit) {
		this.no = no;
		this.name = name;
		this.month = month;
		this.day = day;
		this.year = year;
		this.deposit = deposit;
	}
	public void write(DataOutputStream stream) throws IOException {
		stream.writeUTF(no);
		stream.writeUTF(name);
		stream.writeUTF(month);
		stream.writeUTF(day);
		stream.writeUTF(year);
		stream.writeUTF(deposit);
	}
	public void read(DataInputStream stream) throws IOException {
		no = stream.readUTF();
		name = stream.readUTF();
		month = stream.readUTF();
		day = stream.readUTF();
		year = stream.readUTF();
		deposit = stream.readUTF();
	}
	public String getNo() { return no;	}
	public String getName() { return name;	}
	public String getMonth() { return month;	}
	public String getDay() { return day;	}
	public String getYear() { return year;	}
	public String getDeposit() { return deposit;	}
}
