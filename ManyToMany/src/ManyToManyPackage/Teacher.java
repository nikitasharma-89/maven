package ManyToManyPackage;

import java.util.Set;

public class Teacher {
	
			private int  tId;
			private String tName;
			private int tSalary;
			private Set studentchildren;
			public int gettId() {
				return tId;
			}
			public void settId(int tId) {
				this.tId = tId;
			}
			public String gettName() {
				return tName;
			}
			public void settName(String tName) {
				this.tName = tName;
			}
			public int gettSalary() {
				return tSalary;
			}
			public void settSalary(int tSalary) {
				this.tSalary = tSalary;
			}
			public Set getStudentchildren() {
				return studentchildren;
			}
			public void setStudentchildren(Set studentchildren) {
				this.studentchildren = studentchildren;
			}
}
