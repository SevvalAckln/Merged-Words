package springboot.thymeleafajax.demo.model;

public class User {

  private  String enterednumber;
  private  String allTexts;
public User(String enterednumber, String allTexts) {
	super();
	this.enterednumber = enterednumber;
	this.allTexts = allTexts;
}
public String getEnterednumber() {
	return enterednumber;
}
public void setEnterednumber(String enterednumber) {
	this.enterednumber = enterednumber;
}
public String getAllTexts() {
	return allTexts;
}
public void setAllTexts(String allTexts) {
	this.allTexts = allTexts;
}


    
}
