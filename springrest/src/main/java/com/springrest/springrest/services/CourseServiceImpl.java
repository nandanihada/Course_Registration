package com.springrest.springrest.services;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
       
//	List<Courses> list;
	public CourseServiceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Courses(145,"java core","this course contains basicas of java") );
//		list.add(new Courses(146,"c++ core","this course contains basicas of c++") );

	}
	
	
	
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}
	@SuppressWarnings("deprecation")
	public Courses getCourse(long courseId) {
//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}
	@Override
	public Courses addCourse(Courses course) {
//		list.add(course); 
//		return course;
	courseDao.save(course);
	return course;
	}



	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long courseId) {
//		list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		Courses entity =courseDao.getOne(courseId);
		courseDao.delete(entity);
		
	}
	
	public Courses updateCourse(Courses course) {
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
}
