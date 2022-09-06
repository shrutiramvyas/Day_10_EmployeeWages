class ClassEmployee {
    public static final int part_time = 1;
    public static final int full_time = 2;
    public static String company;
    public int max_hour_in_month;
    public int no_of_working_days;
    public int emp_rate_per_hour;
    ClassEmployee(String company,int max_hour_in_month, int no_of_working_days,int emp_rate_per_hour){
        this.company=company;
        this.emp_rate_per_hour=emp_rate_per_hour;
        this.no_of_working_days=no_of_working_days;
        this.max_hour_in_month=max_hour_in_month;
    }

    public int calc(){
        System.out.println(max_hour_in_month+"  "+ no_of_working_days+"  "+ emp_rate_per_hour);
        int emp_hours = 0, total_emp_hrs = 0, total_working_days = 0;
        while(total_emp_hrs <= max_hour_in_month && total_working_days < no_of_working_days) {
            total_working_days++;
            int empcheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empcheck) {
                case part_time:
                    emp_hours = 4;
                    break;
                case full_time:
                    emp_hours = 8;
                    break;
                default:
                    emp_hours = 0;
            }
            total_emp_hrs += emp_hours;
            System.out.println("Day " + total_working_days + " Emp Hr: " + emp_hours);
        }
        int totalEmpWages=total_emp_hrs*emp_rate_per_hour;
        return totalEmpWages;
    }
}

class Main{
    public static void main(String[] args) {
        ClassEmployee bmw =new ClassEmployee("BMW",20,12,20);
        System.out.println("Total wages of BMW's employee is: "+bmw.calc());

        ClassEmployee tata =new ClassEmployee("BMW",20,12,20);
        System.out.println("Total wages of TATA's employee is: " + tata.calc());
    }
}


