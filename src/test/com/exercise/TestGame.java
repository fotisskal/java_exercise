package com.exercise;

import com.exercise.quizes.Game;
import com.exercise.quizes.QuizQuestion;
import com.exercise.quizes.models.BaseQuiz;
import com.exercise.quizes.models.Quiz;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TestGame {
    private Map<Integer, String> options = Map.of(
            1, "A",
            2, "B",
            3, "C",
            4, "D"
    );

    public Quiz createQuiz(int questionsNo) {
        List<QuizQuestion> questions = new ArrayList<>();
        for (int i=0; i<questionsNo; i++) {
            questions.add(QuizQuestion.buildQuestion("Which option is correct?", options, 1));
        }
        return Quiz.setupQuiz(questions);
    }

    public List<Quiz> createQuizzes(int quizzesNo, int questionsNo) {
        List<Quiz> quizzes = new ArrayList<>();
        for (int i=0; i<quizzesNo; i++) {
            quizzes.add(createQuiz(questionsNo));
        }
        return quizzes;
    }

    @Test
    public void testGameOneQuizOneQuestion() {
        Game game = new Game();
        game.setupGame(createQuizzes(1,1));
        game.play();
        game.printScore();
    }
}
