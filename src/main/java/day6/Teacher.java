package day6;

import java.util.Random;

public class Teacher {
    private String fio, subject;

    public Teacher(String name, String subject) {
        this.fio = name;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int value = random.nextInt(4) + 2;
        String evaluation = null;

        switch (value) {
            case 2:
                evaluation = "D";
                break;
            case 3:
                evaluation = "C";
                break;
            case 4:
                evaluation = "B";
                break;
            case 5:
                evaluation = "A";
                break;


        }
        System.out.println(" Teacher " + this.fio
                + " evaluate " + student.getName()
                + " to subject " + this.subject
                + "from ---> " + evaluation);
    }
}
