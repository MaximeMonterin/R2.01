public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return "Time = " + this.hour + ':' + this.minute + ':' + this.second;
	}
	
	public Time nextSecond() {
		this.second += 1;
		if (this.second > 60) {
			this.setTime(00, 00, 0 + 1);
		}
		return this;
	}
	
	public Time previousSecond() {
		if (this.hour == 0 && this.minute == 0 && this.second == 0) {
			this.setTime(23, 59, 60);
		} else if (this.second <= 0) {
			this.setTime(this.hour - 1, this.minute - 1, 59);
		}
		this.second -= 1;
		return this;
	}
	
}
