class lec{
    public double basic_sal,allowance;

    public lec(double basic_sal,double allowance){
        this.basic_sal = basic_sal;
        this.allowance = allowance;
    }
    public void Display(){
        double tot = basic_sal + allowance;
        System.out.println("Lecturer tot sal is " +tot);
    }
}

