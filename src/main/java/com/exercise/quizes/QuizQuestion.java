package com.exercise.quizes;

import java.util.HashMap;
import java.util.Map;

public class QuizQuestion {
    String question;
    Map<Integer, String> options = new HashMap<Integer, String>();
    int correctAnswerIndex;
    int submittedAnswerIndex;
    int questionNumber;
    Status status;

    public String getQuestion() {
        return question;
    }

    public QuizQuestion setQuestion(String question) {
        this.question = question;
        return this;
    }

    public Map<Integer, String> getOptions() {
        return options;
    }

    public QuizQuestion setOptions(Map<Integer, String> options) {
        this.options = options;
        return this;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean compareAnswer() {
        if (submittedAnswerIndex == correctAnswerIndex) {
            setStatus(Status.CORRECT);
            return true;
        } else {
            setStatus(Status.WRONG);
            return false;
        }
    }

    public int getSubmittedAnswerIndex() {
        return submittedAnswerIndex;
    }

    public void setSubmittedAnswerIndex(int submittedAnswerIndex) {
        this.submittedAnswerIndex = submittedAnswerIndex;
    }

    enum Status {
        CORRECT,
        WRONG
    }

    public static QuizQuestion buildQuestion(String questionString, Map<Integer, String> options, int correctAnswerIndex) {
        QuizQuestion question = new QuizQuestion();
        question.setQuestion(questionString).setOptions(options).setCorrectAnswerIndex(correctAnswerIndex);
        return question;
    }

    public QuizQuestion() {

    }

}
