package ManyToManyPackage;

import java.util.Set;

public class Student {
	
		private int sId;
		private String sName;
		private int sSalary;
		private Set teacherchildren;
		
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public int getsSalary() {
			return sSalary;
		}
		public void setsSalary(int sSalary) {
			this.sSalary = sSalary;
		}
		public Set getTeacherchildren() {
			return teacherchildren;
		}
		public void setTeacherchildren(Set teacherchildren) {
			this.teacherchildren = teacherchildren;
		}
		

}
