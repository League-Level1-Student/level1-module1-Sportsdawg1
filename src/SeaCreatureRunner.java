
public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spong = new SeaCreature("spongebob");
		SeaCreature patri = new SeaCreature("patrick");
		SeaCreature squid = new SeaCreature("squidward");
		
		spong.laugh();
		patri.laugh();
		squid.laugh();
		
		spong.eat();
		patri.eat();
		squid.eat();
	}
}
