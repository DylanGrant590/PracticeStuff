
public class Tracker {
		private String activity;
		private int date;
		private int time;
		private int cal;

		public Tracker(String activity, int date, int time, int cal){
	        this.date = date;
	        this.activity = activity;
	        this.time = time;
	        this.cal = cal;     
	    }

	    public Tracker(String activity2, String string, int time2, int cal2) {
			// TODO Auto-generated constructor stub
		}

		public void date(int date){
	        System.out.println("I did this on " + date + ".");
	    }
	    public void activity(String activity){
	        System.out.println("Today I plan on " + activity);
	    }

	    public void minutesSpent(int time){
	        System.out.println("I spent " + time + " minutes doing so.");
	    }

	    public void caloriesUsed(int cal){
	        System.out.println("I burned " + cal + " calories.");
	    }

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public String getActivity() {
			return activity;
		}

		public void setActivity(String activity) {
			this.activity = activity;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public int getCal() {
			return cal;
		}

		public void setCal(int cal) {
			this.cal = cal;
		}
	}


