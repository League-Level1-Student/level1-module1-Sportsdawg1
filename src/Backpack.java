/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class Backpack
{
	private static Pencil pencil;
	private static Ruler ruler;
	private static Textbook textbook;
	Backpack backpack;

	private void packAndCheck()
	{
		// Your mission is to go to school.
		// 1. First you need to put all your supplies into your backpack - use the putInBackpack(...) methods
		
		this.putInBackpack(pencil);
		this.putInBackpack(ruler);
		this.putInBackpack(textbook);
		
		pencil.write("hi");
		textbook.read();
		ruler.measure();
		
		goToSchool();
	}

	public static void main(String[] args)
	{
		pencil = new Pencil();
		ruler = new Ruler();
		textbook = new Textbook();
		Backpack backpack = new Backpack();
		backpack.packAndCheck();
	}

	public void putInBackpack(Pencil supply)
	{
		this.pencil = supply;
		log(supply);
	}

	public void putInBackpack(Ruler supply)
	{
		this.ruler = supply;
		log(supply);
	}

	public void putInBackpack(Textbook supply)
	{
		this.textbook = supply;
		log(supply);
	}

	private void log(Supply supply)
	{
		String description;
		if (supply == null)
		{
			description = "null";
		} else
		{
			description = supply.getClass().getSimpleName().toLowerCase();
		}

		System.out.println("You put " + description + " in your Backpack");
	}

	public void goToSchool()
	{
		if (pencil == null || ruler == null || textbook == null)
		{
			System.out.println("ERROR: You are not ready for School!");
		} else
		{
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

abstract class Supply
{
	protected String name;
}

class Pencil extends Supply
{
	Pencil()
	{
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}

	public void write(String writing)
	{
		System.out.println(writing);
	}
}

class Ruler extends Supply
{
	Ruler()
	{
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}

	public void measure()
	{
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply
{
	Textbook()
	{
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}

	public void read()
	{
		System.out.println("The history of Iceland is long and interesting");
	}
}
