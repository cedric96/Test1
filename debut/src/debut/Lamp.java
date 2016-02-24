package debut;

public class Lamp {
	
		private boolean light;
		private int d;
		
		public Lamp(){
			this.light=false;
		}
		public boolean  isOn() {
			return this.light;
		}
		public boolean turnOn(){
			return this.light=true;
		}
		public void turnOff(){
			this.light=false;
		}
		public void turn(){
			if(this.light==true){
				this.light=false;
			}else{
				this.light=true;
			}
		}
	


}
