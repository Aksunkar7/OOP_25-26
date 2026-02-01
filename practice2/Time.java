public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time(int h, int m, int s){
        if(isValid(h, m, s)){
        this.hour = h;
        this.minute = m;
        this.second = s;    
        }
        else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }
    

    private boolean isValid(int h, int m, int s){
        return h >= 0 && h <= 24 &&
                m >= 0 && m < 60 &&
                s >= 0 && s < 60;
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String toStandard(){
        String ampm = this.hour >= 12 ? "PM" : "AM";
        // restricted to change straightly "this.hour". Otherwise, each calling toStandard changes the AM->PM,PM->AM
        // this.hour %= 12;
        int thisHour = this.hour % 12;
        if (thisHour == 0) thisHour = 12;
        return String.format("%02d:%02d:%02d %s", thisHour, this.minute, this.second, ampm);
    }

    private int[] addTime(int x1, int x2){
        int cnt;
        x1 += x2;
        cnt = x1 / 60;
        x1 %= 60;
        return new int[]{cnt, x1};

    }

    public void add(Time t){
        int[] sec = this.addTime(this.second, t.second);
        int overSec = sec[0]; 
        this.second = sec[1];

        int[] min = this.addTime(this.minute, t.minute + overSec);
        int overMin = min[0];
        this.minute = min[1];

        this.hour = this.hour + overMin + t.hour;
        this.hour %= 24;
    }


    public static void main(String[] args){
        Time t = new Time(11, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toStandard());
    }
}
