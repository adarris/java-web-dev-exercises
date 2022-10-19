package org.launchcode.java.studio.quizzes;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> question){
        this.questions = questions;
        this.score = score;
        this.total = total;
        for (int i = 0; i < question.size(); i++){
            this.total = this.total + questions.get(i).getPointValue();
        }
    }
    public void addQuestion(Question newQuestion){
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();
    }
    public void runQuiz(){
        for (Question question: this.questions){
            question.displayQuestion();
            question.displayAnswers();
            int pts = question.getAnswers();
            updateScore(pts);
        }
    }
    public void updateScore(int x){
        this.score = this.score + x;
    }
    public void gradeQuiz(){
        System.out.println("You're done! Your score is " + score);
    }
}
