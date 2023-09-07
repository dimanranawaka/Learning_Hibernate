package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    String subId;
    String subjectName;
    @ManyToMany
    List<Lecturer> lecturerList = new ArrayList<>();
    public Subject() {
    }

    public Subject(String subId, String subjectName, List<Lecturer> lecturerList) {
        this.subId = subId;
        this.subjectName = subjectName;
        this.lecturerList = lecturerList;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public void setLecturerList(List<Lecturer> lecturerList){
        this.lecturerList = lecturerList;
    }

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId='" + subId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", lecturerList=" + lecturerList +
                '}';
    }
}
