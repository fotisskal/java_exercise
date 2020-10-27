package com.exercise.quizes.models;

import com.exercise.quizes.QuizQuestion;

import java.util.List;

public interface BaseQuiz {

    List<QuizQuestion> getQuestions();

    public BaseQuiz setQuestions(List<QuizQuestion> questions);

    QuizQuestion getQuestion(int index);

    void removeQuestion(QuizQuestion question);

    void setScore(int score);

    int getScore();

    void calculateScore(QuizQuestion question);

}
