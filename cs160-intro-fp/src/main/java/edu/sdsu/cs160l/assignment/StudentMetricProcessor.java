package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.assignment.model.Student;
import java.util.stream.Collectors;
import java.util.List;

public class StudentMetricProcessor {
  private final List<Student> students;

  public StudentMetricProcessor(List<Student> students) {
    this.students = students;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is 4.0
   */
  public List<Student> studentsWithPerfectGpa() {
    return students
    		.stream() //Stream<Student>
    		.filter((s)->s.getGpa().equals(4.0)) 
    		.collect(Collectors.toList());
  }
  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is < 2.85
   */
  public List<Student> studentWithGpaBelow2point85() {
    return students
    		.stream()
    		.filter((s)-> s.getGpa() < 2.85)
    		.collect(Collectors.toList());
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of all student names hint use map and s->s.getName()
   */
  public List<String> studentNames() {
    return students
    		.stream()
    		.map(s -> s.getName())
    		.collect(Collectors.toList());
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of redIds for all students whose gpa >= 3.0 && gpa <=3.5
   */
  public List<Long> studentRedIdsWithScoreBetweenAndInclusiveOf3point0and3point5() {
    return students
    		.stream()
    		.filter((s) -> s.getGpa() >= 3.0 && s.getGpa() <= 3.5)
    		.map((s) -> s.getRedId())
    		.collect(Collectors.toList());
  }
  /**
   * TODO (carries 1 point)
   *
   * @return a count of students whose gpa >=2.85 && gpa <=3.0, hit use the count method at end of stream instead of collect
   */
  public long countOfStudentsWithGpaBetweenAndInclusiveOf2point85and3point0() {
    return students
    		.stream()
    		.filter((s) -> s.getGpa() >= 2.85 && s.getGpa() <= 3.0)
    		.count();
  }
}
