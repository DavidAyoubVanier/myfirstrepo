package org.example;

import java.util.ArrayList;

public class Student extends User implements ManageCourse {
    private ArrayList<Course> courses;

    public Student(String id, String name, int age, String gender, ArrayList<Course> courses) {
        super(id, name, age, gender);
        this.courses = courses;
    }

    public Student() {
        super();
        this.courses = new ArrayList<>();
    }

    @Override
    public void report(String title, String content) {
        String str = String.format("Student, ID: %d, Name: %s\n", id, );
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    /**
     * registers a course if the course is not registered
     * @param course the course to be registered
     * @return if the course is successfully registered
     */
    @Override
    public boolean register(Course course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    @Override
    public boolean drop(Course course) {
        if (!courses.contains(course)) {
            return false;
        }
        return true;
    }
}
