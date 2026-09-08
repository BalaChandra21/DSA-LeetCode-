class Solution {
    public int totalMoney(int n) {
        int week_count=n/7;
        int rem_days=n%7;
        int total=((week_count*(week_count-1))/2)*7;
        total+=week_count*28;
        total+=((rem_days*(rem_days+1))/2)+(week_count*rem_days);
        return total; 
    }
}