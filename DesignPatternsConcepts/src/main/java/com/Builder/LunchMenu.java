package com.Builder;

public class LunchMenu {
    private String starter;
    private String mainCourse;
    private String desert;

    public String getStarter() {
        return starter;
    }

    private LunchMenu(Builder builder) {
        this.starter=builder.starter;
        this.mainCourse=builder.mainCourse;
        this.desert=builder.desert;
    }

    public static class Builder{
        private String starter;
        private String mainCourse;
        private String desert;
        public Builder(){}

        public Builder starter(String starter){
            this.starter=starter;
            return this;
        }
        public Builder mainCourse(String maainCourse){
            this.mainCourse=maainCourse;
            return this;
        }
        public Builder desert(String desert){
            this.desert=desert;
            return this;
        }
        public LunchMenu build(){
            return new LunchMenu(this);
        }
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getDesert() {
        return desert;
    }
}
