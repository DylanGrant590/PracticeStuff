class JobApplicant {

   private String name;
   private String phoneNum;
   private boolean wordProcessing;
   private boolean spreadsheets;
   private boolean databases;
   private boolean graphics;
   
   public JobApplicant(String name, String phoneNum, boolean wordProcessing, boolean spreadsheets, boolean databases, boolean graphics) {

	   this.name = name;
	   this.phoneNum = phoneNum;
	   this.wordProcessing = wordProcessing;
	   this.spreadsheets = spreadsheets;
	   this.databases = databases;
	   this.graphics = graphics;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNum() {
	return phoneNum;
}

public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}

public boolean isWordProcessing() {
	return wordProcessing;
}

public void setWordProcessing(boolean wordProcessing) {
	this.wordProcessing = wordProcessing;
}

public boolean isSpreadsheets() {
	return spreadsheets;
}

public void setSpreadsheets(boolean spreadsheets) {
	this.spreadsheets = spreadsheets;
}

public boolean isDatabases() {
	return databases;
}

public void setDatabases(boolean databases) {
	this.databases = databases;
}

public boolean isGraphics() {
	return graphics;
}

public void setGraphics(boolean graphics) {
	this.graphics = graphics;
}
   
}
