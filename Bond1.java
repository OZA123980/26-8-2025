package SavingTest;

public class Bond1 {
     public String name;
    public double balance, rate;
    public int term, monthsRemaining;

    // Method untuk set term dan rate
    public void setTermAndRate(int t) {
        if(t >= 0 && t < 12) 
            rate = 0.005;
        else if(t >= 12 && t < 24) 
            rate = 0.10;
        else if(t >= 24 && t < 36) 
            rate = 0.15;
        else if(t >= 36 && t <= 48) 
            rate = 0.20;
        else if(t >= 48 && t <= 60) 
            rate = 0.25;
        else {
            System.out.println("Invalid term");
            t = 0;
        }
        term = t;
        monthsRemaining = t;       
    }

    // Method untuk menghitung bunga per bulan
    public void earnInterest() {
        if(monthsRemaining > 0) {
            balance += balance * rate / 12;   // tambahin bunga
            monthsRemaining--;                // kurangi sisa bulan
            System.out.println("Balance: $" + balance);
            System.out.println("Rate: " + rate);
            System.out.println("Months Remaining: " + monthsRemaining);
        } else {
            System.out.println("Bond Matured");
        }
    }
}

