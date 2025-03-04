package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class School {


    /**
     * exports user data into a csv file
     * @param fileName the name of the file
     */

    public void export(String fileName) {
        File file = new File( "src/main/resources/" + fileName);

        try (FileWriter filewriter = new FileWriter(file)) {
            for (User user : users) {
                fileWriter.write(user.getId() + ",");
                fileWriter.write(user.getName() + ",");
                fileWriter.write(user.getAge() + ",");
                fileWriter.write(user.getGender() + ",");
                if (user instancof Teacher teacher) {
                    fileWriter.write(teacher.getWorkExperience() + "\n");
                } else if (user instanceof Student student) {
                    ArrayList<Course> courses = student.getCourses();
                    for (int i = 0; i < courses.size(); i++) {
                        if ( i < courses.size() - 1) {
                            fileWriter.write(course.get(i).getName() + ",");
                        } else {
                            fileWriter.write(courses.get(i).getName() + "\n")
                        }
                    }
                    fileWriter.write("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
