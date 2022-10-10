package kodlamaİo.business;

import kodlamaİo.core.logging.Logger;
import kodlamaİo.dataAccess.CourseDao;
import kodlamaİo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = new Course[] {
				new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı", "C# + ANGULAR", 10000),
				new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı", "JAVA + REACT", 15000),
				new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı", "JavaScript", 7500),
				new Course("Engin Demiroğ", "2022 Yazılım Geliştirici Yetiştirme Kampı", "JAVA", 20000),
				new Course("Engin Demiroğ", "Programlamaya Giriş İçin Temel Kurs", "Temel Programlama Bilgisi", 1500) };
		for (Course course2 : courses) {
			if (course2.getCategory() == course.getCategory()) {
				throw new Exception("Aynı isme sahip bir kategori sistemde mevcut. Farklı bir kategori adı giriniz.");

			}
			if (course2.getCourseName() == course.getCourseName()) {
				throw new Exception("Aynı isme sahip bir kurs sistemde mevcut. Farklı bir kurs adı giriniz.");

			}
		}
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz. Lütfen 0'dan büyük bir kurs fiyatı giriniz.");

		}

		courseDao.add(course);
		for (Logger log : loggers) {
			log.log("Mesaj gönderildi.");
		}

	}
}
