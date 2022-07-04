package day6;

 class Car1 {



    private int year;

    public void setYear(int year) {
        this.year = year;
    }
    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int inputYear){
        inputYear = inputYear - year;
        return inputYear;
    }



    }




