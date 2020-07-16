public class Student {
    private String id;
    private String name;
    private int quizzesNumber;
    private double quizzeScore;
    
    public Student(){
        this(" ", " ");
    }
    
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public void addQuiz(int score){
        if(score <= 10 && score >= 0){
            quizzeScore+=score;
            quizzesNumber++;
        }
        else{
            System.out.println("The maximum score for each quiz is 10");
        } 
    }
    
    public double getAverageScore(){
        return quizzeScore / (double)quizzesNumber;
    }
    
}