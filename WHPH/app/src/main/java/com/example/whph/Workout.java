package com.example.whph;

/**
 * Määritelty lista
 * @author Jonne
 * @version 1.6
 */
public class Workout {

    private String firstMove, secondMove, thirdMove, name;
    private int firstMoveSets, secondMoveSets, thirdMoveSets,
            firstMoveReps, secondMoveReps, thirdMoveReps;

    public Workout(String name, String firstMove, int firstMoveSets, int firstMoveReps, String secondMove,
                   int secondMoveSets, int secondMoveReps, String thirdMove, int thirdMoveSets, int thirdMoveReps) {
        this.name = name;
        this.firstMove = firstMove;
        this.firstMoveSets = firstMoveSets;
        this.firstMoveReps = firstMoveReps;
        this.secondMove = secondMove;
        this.secondMoveSets = secondMoveSets;
        this.secondMoveReps = secondMoveReps;
        this.thirdMove = thirdMove;
        this.thirdMoveSets = thirdMoveSets;
        this.thirdMoveReps = thirdMoveReps;
    }

    public String toString() {
        return this.name;
    }

    /**
     * Palauttaa treenin nimen
     * @author Jonne
     * @version 1.2
     */
    public String getName() {
        return name;
    }

    /**
     *Palauttaa ensimmöisen liikeen nimen
     * @author Jonne
     * @version 1.2
     */
    public String getFirstMove() {
        return this.firstMove;
    }

    /**
     * Palauttaa ensimäisen liikkeen setit
     * @author Jonne
     * @version 1.2
     */
    public int getFirstMoveSets() {
        return firstMoveSets;
    }

    /**
     * Palauttaa ensimäisen liikkeen toistot
     * @author Jonne
     * @version 1.2
     */
    public int getFirstMoveReps() {
        return firstMoveReps;
    }

    public String getSecondMove() {
        return  this.secondMove;
    }

    public int getSecondMoveSets() {
        return secondMoveSets;
    }

    public int getSecondMoveReps() {
        return secondMoveReps;
    }

    public String getThirdMove() {
        return thirdMove;
    }

    public int getThirdMoveSets() {
        return thirdMoveSets;
    }

    public int getThirdMoveReps() {
        return thirdMoveReps;
    }
}
