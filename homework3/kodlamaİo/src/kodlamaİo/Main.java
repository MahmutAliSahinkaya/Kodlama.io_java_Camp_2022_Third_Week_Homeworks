package kodlamaİo;

import kodlamaİo.business.CourseManager;
import kodlamaİo.core.logging.DatabaseLogger;
import kodlamaİo.core.logging.FileLogger;
import kodlamaİo.core.logging.Logger;
import kodlamaİo.core.logging.MailLogger;
import kodlamaİo.dataAccess.HibernateCourseDao;
import kodlamaİo.dataAccess.JdbcCourseDao;
import kodlamaİo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Engin Demiroğ", "Yazılım Geliştirici Kampı", "java", 11000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);

	}

}
