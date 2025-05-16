class Po_staff extends lec{
    public double ot,bonus;

    public Po_staff(double basic_sal,double ot,double bonus) {
        super(basic_sal,0);
        this.ot = ot;
        this.bonus = bonus;

    }
    public void Display(){
        double tot = basic_sal + ot + bonus;
        System.out.println("Po staff slary is " +tot);
    }
}
