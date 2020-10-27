package com.exercise.quizes;

import com.exercise.quizes.models.Quiz;

import java.util.List;
import java.util.Scanner;

public class Game {
    static Player player = new Player();

    public Game() {}

    public void setupGame(List<Quiz> quizzes) {
        player.setQuizzes(quizzes);
    }

    public void play() {
        List<Quiz> quizzes = player.getQuizzes();
        while (!quizzes.isEmpty()) {
            Quiz currentQuiz = player.getCurrentQuiz();
            List<QuizQuestion> questions = currentQuiz.getQuestions();
            for (QuizQuestion question: questions) {
                System.out.println(question.getQuestion());
                for (Integer key : question.getOptions().keySet()) {
                    System.out.println(key +") " + question.getOptions().get(key));
                }
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                question.setSubmittedAnswerIndex(i);
                currentQuiz.calculateScore(question);

            }
            player.submitQuiz();
        }
    }

    public void printScore() {
        List<Quiz> quizzes = player.getSubmittedQuizes();
        for (Quiz quiz : quizzes) {
            System.out.println(quiz.getScore());
        }
    }
}
