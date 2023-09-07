package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecturer {
    @Id
    String lecId;
    String lecName;
    @ManyToMany(mappedBy = "lecturerList")
    List<Subject> subjectList = new ArrayList<>();
    public Lecturer() {
    }

    public Lecturer(String lecId, String lecName, List<Subject> subjectList) {
        this.lecId = lecId;
        this.lecName = lecName;
        this.subjectList = subjectList;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }
    public void setSubjectList(List<Subject> subjectList){
        this.subjectList = subjectList;
    }
    public List<Subject> getSubjectList(){
        return subjectList;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecId='" + lecId + '\'' +
                ", lecName='" + lecName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
