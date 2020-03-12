package com.example.whph;

import java.util.ArrayList;

class List {
    private static final List ourInstance = new List();
    ArrayList<Workout> workouts = new ArrayList<Workout>();

    static List getInstance() {
        return ourInstance;
    }

    private List() {
        workouts.add(new Workout("Bicep Blaster", "Seated Bicep Curl", 3, 12, "Cable Curl",
                4, 10, "Cable Hammer Curl", 4, 12));
        workouts.add(new Workout("Ass Blaster", "Squats", 3, 6, "Front Squat",
                4, 8, "Leg Press", 4, 10));
        workouts.add(new Workout("Abs Blaster", "Squats", 3, 6, "Front Squat",
                4, 8, "Leg Press", 4, 10));
        workouts.add(new Workout("Erics Special", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
        workouts.add(new Workout("Valentinesday Special", "Hip thrust", 3, 12, "Hip thrust",
                4, 10, "Hip thrust", 4, 12));
        workouts.add(new Workout("Card Deck Challenge", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
        workouts.add(new Workout("Erics Special", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
        workouts.add(new Workout("Erics Special", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
        workouts.add(new Workout("Ass Blaster", "Squats", 3, 6, "Front Squat",
                4, 8, "Leg Press", 4, 10));
        workouts.add(new Workout("Erics Special", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
        workouts.add(new Workout("Erics Special", "Fingering", 3, 12, "Sitting",
                4, 10, "More Sitting", 4, 10));
    }

    public ArrayList<Workout> getWorkout() {
        return workouts;
    }

    public Workout getWorkouts(int i) {
        return workouts.get(i);
    }
}
