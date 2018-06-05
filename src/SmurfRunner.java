
public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("handy");
		System.out.println(handy.getName());
		handy.eat();
		
		Smurf papa = new Smurf("papa smurf");
		System.out.println(papa.getName() + "\n" + papa.getHatColor() + "\n" + papa.isGirlOrBoy());
		
		Smurf ette = new Smurf("smurfette");
		System.out.println(ette.getName() + "\n" + ette.getHatColor() + "\n" + ette.isGirlOrBoy());
	}

}
