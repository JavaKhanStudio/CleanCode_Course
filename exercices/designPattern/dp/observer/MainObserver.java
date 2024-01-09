package dp.observer;

import dp.decorator.MilkDecorator;
import dp.decorator.SugarDecorator;
import dp.decorator.structure.BasicCoffee;
import dp.decorator.structure.Coffee;

public class MainObserver {

	public static void main(String[] args) {
		// Le code c'est ici !
		 Coffee basicCoffee = new BasicCoffee();
	        System.out.println(basicCoffee.getDescription() + " Cost: $" + basicCoffee.getCost());

	        Coffee milkCoffee = new MilkDecorator(basicCoffee);
	        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.getCost());

	        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
	        System.out.println(sugarMilkCoffee.getDescription() + " Cost: $" + sugarMilkCoffee.getCost());
	

		
	}
	
}
