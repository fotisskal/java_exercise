package com.exercise.quizes;

import com.exercise.quizes.models.Quiz;

import java.util.*;

public class Player {

    List<Quiz> quizzes = new ArrayList<Quiz>();
    Quiz currentQuiz;
    List<Quiz> submittedQuizes = new ArrayList<Quiz>();
    private int quizzesNo = 100;

    public Player() {
    }

    public Quiz getCurrentQuiz() {
        int random = (int)(Math.random() * quizzesNo + 1);
        quizzesNo--;
        setCurrentQuiz(quizzes.remove(random));
        return currentQuiz;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public void setCurrentQuiz(Quiz currentQuiz) {
        this.currentQuiz = currentQuiz;
    }

    public List<Quiz> getSubmittedQuizes() {
        return submittedQuizes;
    }

    public void submitQuiz() {
        this.submittedQuizes.add(currentQuiz);
    }
}

