package com.exercise.quizes.models;

import com.exercise.quizes.QuizQuestion;

import java.util.ArrayList;
import java.util.List;

public class Quiz implements BaseQuiz {
    List<QuizQuestion> questions = new ArrayList<QuizQuestion>();
    int score = 0;

    public Quiz() {

    }

    public static Quiz setupQuiz(List<QuizQuestion> questions) {
        Quiz newQuiz = new Quiz();
        newQuiz.setQuestions(questions);
        return newQuiz;
    }

    public List<QuizQuestion> getQuestions() {
        return questions;
    }

    public BaseQuiz setQuestions(List<QuizQuestion> questions) {
        this.questions.addAll(questions);
        return this;
    }

    public QuizQuestion getQuestion(int index) {
        return questions.get(index);
    }

    public void removeQuestion(QuizQuestion question) {
        questions.remove(question);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void calculateScore(QuizQuestion question) {
        if (question.compareAnswer()) {
            score++;
        }
        removeQuestion(question);
    }

}
