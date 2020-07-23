public class Question2 {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("19WMD12345", "Xiao Ming");
        
        student1.setId("19WMD67890");
        student1.setName("Xiao Hua");
        
        student1.addQuiz(10);
        student2.addQuiz(8);
        
        student1.addQuiz(10);
        student2.addQuiz(8);
        
        Student.setContribution(20);
        
        System.out.println("Student ID            : " + student1.getId());
        System.out.println("Student Name          : " + student1.getName());
        System.out.println("Quiz Taken            : " + student1.getQuizzesNumber());
        System.out.println("Total Score           : " + student1.getQuizzeScore());
        System.out.println("Average Score         : " + student1.getAverageScore());
        System.out.println("Contribution in Final : " + student1.getAverageScore() / 10 * Student.getContribution());
        System.out.println();
        System.out.println("Student ID            : " + student2.getId());
        System.out.println("Student Name          : " + student2.getName());
        System.out.println("Quiz Taken            : " + student2.getQuizzesNumber());
        System.out.println("Total Score           : " + student2.getQuizzeScore());
        System.out.println("Average Score         : " + student2.getAverageScore());
        System.out.println("Contribution in Final : " + student2.getAverageScore() / 10 * Student.getContribution());
        System.out.println();
    }
}