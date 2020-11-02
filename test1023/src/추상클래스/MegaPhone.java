package 추상클래스;
//interface는 다중 상속이 가능하다!
//MegaPhone이 되기 위한 규칙을 정의하는 문서의 역할
public interface MegaPhone extends Phone, GPS{
	public final String COMPANY = "mega";
	public abstract void siri();
}
