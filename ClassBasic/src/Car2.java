
public class Car2 {

		// TODO Auto-generated method stub
		// 필드값 선언
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		Car2(){
		}
		
		Car2(String model){
			this.model = model;
		}
		
		Car2(String model, String color){
			this.model = model;
			this.color = color;
		}
		
		Car2(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
