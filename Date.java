
public class Date {
private int monthdate;
private int daydate;
private int yeardate;


public Date(int month,int day,int year){
	monthdate=month;
	daydate=day;
	yeardate=year;
}


	public int getMonth() {
	return monthdate;
}


public void setMonth(int month) {
	monthdate = month;
}


public int getDay() {
	return daydate;
}


public void setDay(int day) {
   daydate = day;
}


public int getYear() {
	return yeardate;
}


public void setYear(int year) {
	yeardate = year;
}

public void displayDate (){
	System.out.println((int) getMonth()+"/"+(int) getDay()+"/"+(int)getYear());
}

	

}
