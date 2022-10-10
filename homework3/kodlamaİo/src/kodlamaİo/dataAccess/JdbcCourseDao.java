package kodlamaİo.dataAccess;

import kodlamaİo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritababına aktarıldı.");

	}

}
