	package com.jspiders.springrest.response;

	import java.util.List;

	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.jspiders.springrest.pojo.StudentPOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class StudentResponse {
		
		private String msg;
		private String description;
		private StudentPOJO student;
		private List<StudentPOJO> students;
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public StudentPOJO getStudent() {
			return student;
		}
		public void setStudent(StudentPOJO student) {
			this.student = student;
		}
		public List<StudentPOJO> getStudents() {
			return students;
		}
		public void setStudents(List<StudentPOJO> students) {
			this.students = students;
		}
		public StudentResponse(String msg, String description, StudentPOJO student, List<StudentPOJO> students) {
			super();
			this.msg = msg;
			this.description = description;
			this.student = student;
			this.students = students;
		}
		public StudentResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "StudentResponse [msg=" + msg + ", description=" + description + ", student=" + student
					+ ", students=" + students + "]";
		}
		
		

	}


