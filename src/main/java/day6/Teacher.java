package day6;

public class Teacher {
   private String nameTeach;
  private  String subject;


    public Teacher(String nameTeach, String subject, String b) {
        this.nameTeach = nameTeach;
        this.subject = subject;

    }

    public String getNameTeach() {
        return nameTeach;
    }

    public void setNameTeach(String nameTeach) {
        this.nameTeach = nameTeach;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String nameTeach, String subject) {
        this.nameTeach = nameTeach;
        this.subject = subject;
    }
   public void evaluate(String getNameSt) {
        int a = 2 + (int) (Math.random()* ((5-2) + 1));
        String b = "";
        switch (a){
            case 2:
               b = "2 - Неудовлетворительно";
                break;
            case 3:
               b = "3 - Удовлетворительно";
                break;
            case 4:
                b = "4 - Хорошо";
               break;
            case 5:
           b = "5 - Отлично";
        break;
        }

        System.out.println("Преподаватель " + getNameTeach() + " оценил студента с именем: "
                + getNameSt + " по предмету " + getSubject() + " на оценку " + b );

        }
    }




