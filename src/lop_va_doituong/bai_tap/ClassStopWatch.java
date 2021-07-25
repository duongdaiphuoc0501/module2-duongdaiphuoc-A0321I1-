package lop_va_doituong.bai_tap;

public class ClassStopWatch {
    private long startTime;
    private long endTime;
    public ClassStopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void Start(){
        startTime = System.currentTimeMillis();
    }
    public void Stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
